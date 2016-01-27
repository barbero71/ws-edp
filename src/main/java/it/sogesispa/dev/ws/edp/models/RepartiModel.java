package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Reparti;

public class RepartiModel 
{	
	private long count;
	private Iterable<Reparti> rep;
	
	public RepartiModel(long count, Iterable<Reparti> rep)
	{
		this.count = count;
		this.rep = rep;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Reparti> getRep() {
		return rep;
	}

	public void setRep(Iterable<Reparti> rep) {
		this.rep = rep;
	}
	
	

}
