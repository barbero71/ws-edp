package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.UtentiModel;
import it.sogesispa.dev.ws.edp.repositories.UtentiRepository;

@RestController
public class UtentiController 

{
	@Autowired
	private UtentiRepository userRepository;
	
	private UtentiModel user;
	
	@RequestMapping(value="/utenti", method=RequestMethod.GET)
	public UtentiModel getUsers ()
	{
		user = new UtentiModel(0, null);
		user.setUser(userRepository.findAll());
		user.setCount(userRepository.count());
		//user.setCount(100);
		
		return user;
	}
	
	@RequestMapping(value="/utenti/{ip}", method=RequestMethod.GET)
	public UtentiModel getUsersByIp (@PathVariable("ip") String ip)
	{
		user = new UtentiModel(0, null);
		user.setUser(userRepository.getByIp(ip));
		user.setCount(userRepository.countByIp(ip));
		
		return user;
	}
}
