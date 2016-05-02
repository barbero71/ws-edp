package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.repositories.BolleRepository;
import it.sogesispa.dev.ws.edp.repositories.RepartiRepository;
import it.sogesispa.dev.ws.edp.repositories.UtentiRepository;

@RestController
public class FullDataController 
{
	@Autowired
	private UtentiRepository utentiRepository;
	
	@Autowired
	private RepartiRepository repartiRepository;
	
	@Autowired
	private BolleRepository bolleRepository;
	
	private FullDataModel fullData;
	
	@RequestMapping(value="/data/{ip}", method=RequestMethod.GET)
	public FullDataModel GetFullData(@PathVariable("ip") String ip)
	{
		fullData = new FullDataModel((long)0, null, (long)0, null, (long)0, null);
		fullData.setUtentiCount(utentiRepository.countByIp(ip));
		fullData.setUtenti(utentiRepository.getByIp(ip));
		fullData.setRepartiCount(repartiRepository.countByIp(ip));
		fullData.setReparti(repartiRepository.getByIp(ip));
		fullData.setBolleCount(bolleRepository.countByIp(ip));
		fullData.setBolle(bolleRepository.getByIp(ip));
		
		return fullData;
	}
}
