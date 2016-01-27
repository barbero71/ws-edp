package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.MagazziniModel;
import it.sogesispa.dev.ws.edp.repositories.MagazziniRepository;

@RestController
public class MagazziniController
{

	@Autowired
	private MagazziniRepository magRepository;
	
	private MagazziniModel mag;
	
	@RequestMapping(value="/magazzini", method=RequestMethod.GET)
	public MagazziniModel getMag ()
	{
		mag = new MagazziniModel(0, null);
		mag.setMag(magRepository.findAll());
		mag.setCount(magRepository.count());
		//user.setCount(100);
		
		return mag;
	}
	
	@RequestMapping(value="/magazzini/{ip}", method=RequestMethod.GET)
	public MagazziniModel getMagByIp (@PathVariable("ip") String ip)
	{
		mag = new MagazziniModel(0, null);
		mag.setMag(magRepository.getByIp(ip));
		mag.setCount(magRepository.countByIp(ip));
		
		return mag;
	}
}
