package it.sogesispa.dev.ws.edp.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;
import it.sogesispa.dev.ws.edp.models.MbpCorpoModel;

import it.sogesispa.dev.ws.edp.repositories.MbpCorpoRepository;

@RestController
public class MbpCorpoController 
{
	@Autowired
	private MbpCorpoRepository mbpCorpoRepository;
	
	private MbpCorpoModel corpo;
	
	
	@RequestMapping(value="/corpo", method=RequestMethod.POST, consumes="application/json", headers="content-type=application/x-www-form-urlencoded")
	public String MbpCorpoBolle(
			@RequestParam("bolle") String jsonString
			)
	{
		ObjectMapper mapper = new ObjectMapper();
		MbpCorpo[] mbp = null;
		try {
			 mbp = mapper.readValue(jsonString, MbpCorpo[].class);
		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Transaction trns = null;
		//trns.begin();
		try
		{
			int i = 0;
			for (i=0; i< mbp.length; i++)
			{
				corpo = new MbpCorpoModel(null);
				corpo.setCorpo(mbpCorpoRepository.save(mbp[i]));
			}
			//trns.commit();
		}
		catch(Exception e)
		{
			//trns.rollback();
			System.out.println("Errore nel salvataggio!");
			System.out.println(e);
		}
		System.out.println("SALVATAGGIO OK!!!!");
		return "Salvataggio OK";
	}
	
}
