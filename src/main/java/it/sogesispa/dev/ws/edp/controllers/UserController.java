package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.UserModel;
import it.sogesispa.dev.ws.edp.repositories.UserRepository;

@RestController
public class UserController 

{
	@Autowired
	private UserRepository userRepository;
	
	private UserModel user;
	
	@RequestMapping(value="/user", method=RequestMethod.GET)
	public UserModel getUsers ()
	{
		user = new UserModel(0, null);
		user.setUser(userRepository.findAll());
		user.setCount(userRepository.count());
		//user.setCount(100);
		
		return user;
	}
	
	@RequestMapping(value="/user/{ip}", method=RequestMethod.GET)
	public UserModel getUsersByIp (@PathVariable("ip") String ip)
	{
		user = new UserModel(0, null);
		user.setUser(userRepository.getByIp(ip));
		user.setCount(userRepository.countByIp(ip));
		
		return user;
	}
}
