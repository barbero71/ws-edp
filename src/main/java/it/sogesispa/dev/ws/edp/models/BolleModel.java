package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Bolle;

public class BolleModel 
{
	private long count;
	private Iterable<Bolle> bolle;
	
	public BolleModel(Long count, Iterable<Bolle> bolle) 
	{
		this.count = count;
		this.bolle = bolle;
	}

	public Long getCount() 
	{
		return count;
	}
	
	public void setCount(long i) 
	{
		this.count = i;
	}
	
	public Iterable<Bolle> getBolle() 
	{
		return bolle;
	}
	
	public void setBolle(Iterable<Bolle> bolle) 
	{
		this.bolle = bolle;
	}
	
	
}
