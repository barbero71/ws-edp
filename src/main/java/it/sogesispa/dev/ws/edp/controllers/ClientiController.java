package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.models.ClientiModel;
import it.sogesispa.dev.ws.edp.repositories.ClientiRepository;

@RestController
public class ClientiController 
{
	@Autowired
	private ClientiRepository cliRepository;
	
	private ClientiModel cli;
	
	@RequestMapping(value="/clienti", method=RequestMethod.GET)
	public ClientiModel getCli ()
	{
		cli = new ClientiModel(0, null);
		cli.setCli(cliRepository.findAll());
		cli.setCount(cliRepository.count());

		
		return cli;
	}
	
	@RequestMapping(value="/clienti/{ip}", method=RequestMethod.GET)
	public ClientiModel getcliByIp (@PathVariable("ip") String ip)
	{
		cli = new ClientiModel(0, null);
		cli.setCli(cliRepository.getByIp(ip));
		cli.setCount(cliRepository.countByIp(ip));
		
		return cli;
	}
	
}
