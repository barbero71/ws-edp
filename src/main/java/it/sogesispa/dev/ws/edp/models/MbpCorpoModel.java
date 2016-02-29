package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.MbpCorpo;

public class MbpCorpoModel 
{
	public long count;
	public Iterable<MbpCorpo> corpo;
	
	public MbpCorpoModel(long count, Iterable<MbpCorpo> corpo) 
	{
		this.count = count;
		this.corpo = corpo;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<MbpCorpo> getCorpo() {
		return corpo;
	}

	public void setCorpo(Iterable<MbpCorpo> corpo) {
		this.corpo = corpo;
	}
	
	
	
}	
	
