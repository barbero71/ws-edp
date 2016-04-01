package it.sogesispa.dev.ws.edp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;
import it.sogesispa.dev.ws.edp.repositories.MbpCorpoRepository;

@RestController
public class MbpCorpoController 
{
	@Autowired
	private MbpCorpoRepository mbpCorpoRepository;
	
	private MbpCorpo mbpCorpo;
	
	@RequestMapping(value="/corpo", method=RequestMethod.POST)
	public String MbpCorpoModel(
			@RequestParam(value="mbpc_btp_id", defaultValue="0") int mbpc_btp_id,
			@RequestParam(value="mbpc_articolo") String mbpc_articolo,
			@RequestParam(value="mbpc_qta") int mbpc_qta,
			@RequestParam(value="mbpc_qta_con") int mbpc_qta_con,
			@RequestParam(value="mbpc_qta_pre") int mbpc_qta_pre,
			@RequestParam(value="mbpc_qta_dif") int mbpc_qta_dif
			)
	{
		try
		{
			mbpCorpo = new MbpCorpo(mbpc_btp_id,mbpc_articolo,mbpc_qta,mbpc_qta_con,mbpc_qta_pre,mbpc_qta_dif);
			this.mbpCorpoRepository.save(mbpCorpo);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return "Salvataggio OK";
	}
	
}
