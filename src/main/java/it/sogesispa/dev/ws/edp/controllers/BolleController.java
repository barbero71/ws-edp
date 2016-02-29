package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import it.sogesispa.dev.ws.edp.models.BolleModel;
import it.sogesispa.dev.ws.edp.models.MbpCorpoModel;
import it.sogesispa.dev.ws.edp.repositories.BolleRepository;
import it.sogesispa.dev.ws.edp.repositories.MbpCorpoRepository;
import scala.annotation.meta.setter;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BolleController 
{
	@Autowired
	private BolleRepository bolleRepository;
	@Autowired
	private MbpCorpoRepository mbpCorpoRepository;
	
	private BolleModel bolle;
	private MbpCorpoModel mbpCorpo;
	
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
	
	@RequestMapping(value="/corpo/{id}", method=RequestMethod.GET)
	public MbpCorpoModel getMbpCordpoById(@PathVariable("id") String id)
	{
		mbpCorpo = new MbpCorpoModel(0, null);
		mbpCorpo.setCorpo(mbpCorpoRepository.getById(id));
		mbpCorpo.setCount(mbpCorpoRepository.countById(id));
		
		return mbpCorpo;
	}
}
