package it.sogesispa.dev.ws.edp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;
import it.sogesispa.dev.ws.edp.models.MbpCorpoModel;
import it.sogesispa.dev.ws.edp.repositories.MbpCorpoRepository;

@Component("mbpCorpoDao")
public class MbpCorpoDao 
{
	@Autowired
	private MbpCorpoRepository mbpCorpoRepository;
	
	private MbpCorpoModel corpo;
	
	@Transactional
	public String SaveBolle(MbpCorpo[] mbp)
	{
		
		
		try
		{
			int i = 0;
			for (i=0; i< mbp.length; i++)
			{
				corpo = new MbpCorpoModel(null);
				corpo.setCorpo(mbpCorpoRepository.save(mbp[i]));
			}

		}
		catch(Exception e)
		{

			System.out.println("Errore nel salvataggio!");
			System.out.println(e);
			return "{\"Success\":0}";
		}
		System.out.println("SALVATAGGIO OK!!!!");
		return "{\"Success\":1}";

	}
}
