package it.sogesispa.dev.ws.edp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.sogesispa.dev.ws.edp.dao.MbpCorpoDao;
import it.sogesispa.dev.ws.edp.entities.MbpCorpo;

@Service("mbpCorpoService")
public class MbpCorpoService 
{
	@Autowired
	private MbpCorpoDao mbpCorpoDao;
	
//	@Autowired
//	public void setMbpCorpoDao(MbpCorpoDao mbpCorpoDao)
//	{
//		this.mbpCorpoDao = mbpCorpoDao;
//	}
	
	public String SaveBolle(MbpCorpo[] mbp)
	{
		return mbpCorpoDao.SaveBolle(mbp);
	}
	
}
