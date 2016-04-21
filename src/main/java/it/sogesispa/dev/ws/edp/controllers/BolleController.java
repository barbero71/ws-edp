package it.sogesispa.dev.ws.edp.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import it.sogesispa.dev.ws.edp.models.BolleModel;
import it.sogesispa.dev.ws.edp.repositories.BolleRepository;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class BolleController 
{
	@Autowired
	private BolleRepository bolleRepository;
	
	
	private BolleModel bolle;
	
	@RequestMapping(value="/bolle", method=RequestMethod.GET)
	public BolleModel getBolle()
	{
		bolle = new BolleModel((long) 0, null);
		bolle.setBolle(bolleRepository.findAll());
		bolle.setCount(bolleRepository.count());
		
		return bolle;
	}
	
	@RequestMapping(value="/bolle/{ip}", method=RequestMethod.GET)
	public BolleModel getBolleByIp(@PathVariable("ip") String ip)
	{
		bolle = new BolleModel((long) 0, null);
		bolle.setBolle(bolleRepository.getByIp(ip));
		bolle.setCount(bolleRepository.countByIp(ip));
		
		return bolle;
		
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody String handleFileUpload(
			@RequestParam("file") MultipartFile file,
			@RequestParam("ip") String ip)
	{
		String UPLOAD_LOCATION = "/docs/" + ip + "/";
		String name = file.getOriginalFilename();
		
		File dir = new File("/docs/" + ip);
		
		if (!dir.exists())
		{
			if(dir.mkdir()) 
			{
				try {
					Runtime.getRuntime().exec("chmod 777 " + dir);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("Errore nel cambiare i permessi alla cartella");
					e.printStackTrace();
				}
				System.out.println("Creata la directory " + ip);
			}
			else
			{
				System.out.println("Errore nella creazione della directory " + ip);
			}
		}
		
		if (!file.isEmpty())
		{
			try
			{
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(UPLOAD_LOCATION + name)));
				stream.write(bytes);
				Runtime.getRuntime().exec("chmod 777 " + UPLOAD_LOCATION + name);
				stream.close();
				return "File caricato correttamente!";
			}
			catch (Exception e)
			{
				return "Upload " + name + " fallito => " + e.getMessage(); 
			}
		}
		else
		{
			return "Upload fallito - Nessun file caricato!";
		}
	}
	
}
