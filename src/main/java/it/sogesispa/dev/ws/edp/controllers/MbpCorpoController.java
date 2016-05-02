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

//import it.sogesispa.dev.ws.edp.dao.MbpCorpoDao;
import it.sogesispa.dev.ws.edp.entities.MbpCorpo;
import it.sogesispa.dev.ws.edp.services.MbpCorpoService;

@RestController
public class MbpCorpoController 
{
	@Autowired
	private MbpCorpoService mbpCorpoService;
	
//	@Autowired
//	public void setMbpCorpoService(MbpCorpoService mbpCorpoService)
//	{
//		this.mbpCorpoService = mbpCorpoService; 
//	}
	
	//@Autowired
	//private MbpCorpoDao mbpCorpoDao;
	
		
	@RequestMapping(value="/corpo", method=RequestMethod.POST, consumes="application/json", headers="content-type=application/x-www-form-urlencoded")
	public String MbpCorpoBolle(
			@RequestParam("bolle") String jsonString
			)
	{
		ObjectMapper mapper = new ObjectMapper();
		MbpCorpo[] mbp = null;
		try {
			 mbp = mapper.readValue(jsonString, MbpCorpo[].class);
		} 
		catch (JsonParseException e1) 
		{
	
			e1.printStackTrace();
		} 
		catch (JsonMappingException e1) 
		{
			e1.printStackTrace();
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		
		return mbpCorpoService.SaveBolle(mbp);

	}		
	
}
