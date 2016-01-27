package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.RepartiModel;
import it.sogesispa.dev.ws.edp.repositories.RepartiRepository;

@RestController
public class RepartiController 
{

	@Autowired
	private RepartiRepository repartiRepository;
	
	private RepartiModel rep;
	
	@RequestMapping(value="/reparti", method=RequestMethod.GET)
	public RepartiModel getRep ()
	{
		rep = new RepartiModel(0, null);
		rep.setRep(repartiRepository.findAll());
		rep.setCount(repartiRepository.count());
		
		return rep;
	}
	
	@RequestMapping(value="/reparti/{ip}", method=RequestMethod.GET)
	public RepartiModel getRepByIp (@PathVariable("ip") String ip)
	{
		rep = new RepartiModel(0, null);
		rep.setRep(repartiRepository.getByIp(ip));
		rep.setCount(repartiRepository.countByIp(ip));
		
		return rep;
	}
}
