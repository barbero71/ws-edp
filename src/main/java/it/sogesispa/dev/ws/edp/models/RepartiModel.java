package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Reparti;

public class RepartiModel 
{	
	private long count;
	private Iterable<Reparti> reparti;
	
	public RepartiModel(long count, Iterable<Reparti> reparti)
	{
		this.count = count;
		this.reparti = reparti;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Reparti> getReparti() {
		return reparti;
	}

	public void setRep(Iterable<Reparti> reparti) {
		this.reparti = reparti;
	}
	
	

}
