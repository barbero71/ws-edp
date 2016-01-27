package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.ArticoliModel;
import it.sogesispa.dev.ws.edp.repositories.ArticoliRepository;

@RestController
public class ArticoliController 
{

	@Autowired
	private ArticoliRepository artRepository;
	
	private ArticoliModel art;
	
	@RequestMapping(value="/articoli", method=RequestMethod.GET)
	public ArticoliModel getMag ()
	{
		art = new ArticoliModel(0, null);
		art.setArt(artRepository.findAll());
		art.setCount(artRepository.count());

		
		return art;
	}
	
	@RequestMapping(value="/articoli/{ip}", method=RequestMethod.GET)
	public ArticoliModel getArtByIp (@PathVariable("ip") String ip)
	{
		art = new ArticoliModel(0, null);
		art.setArt(artRepository.getByIp(ip));
		art.setCount(artRepository.countByIp(ip));
		
		return art;
	}
}
