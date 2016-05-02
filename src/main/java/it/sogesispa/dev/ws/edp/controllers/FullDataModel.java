package it.sogesispa.dev.ws.edp.controllers;

import it.sogesispa.dev.ws.edp.entities.Bolle;
import it.sogesispa.dev.ws.edp.entities.Reparti;
import it.sogesispa.dev.ws.edp.entities.Utenti;

public class FullDataModel 

{
	private long utentiCount;
	private Iterable<Utenti> utenti;
	private long repartiCount;
	private Iterable<Reparti> reparti;
	private long bolleCount;
	private Iterable<Bolle> bolle;
	
	public FullDataModel(long utentiCount, Iterable<Utenti> utenti, long repartiCount, Iterable<Reparti> reparti,
			long bolleCount, Iterable<Bolle> bolle) 
	{
		this.utentiCount = utentiCount;
		this.utenti = utenti;
		this.repartiCount = repartiCount;
		this.reparti = reparti;
		this.bolleCount = bolleCount;
		this.bolle = bolle;
	}

	public long getUtentiCount() 
	{
		return utentiCount;
	}

	public void setUtentiCount(long utentiCount) 
	{
		this.utentiCount = utentiCount;
	}

	public Iterable<Utenti> getUtenti() 
	{
		return utenti;
	}

	public void setUtenti(Iterable<Utenti> utenti) 
	{
		this.utenti = utenti;
	}

	public long getRepartiCount() 
	{
		return repartiCount;
	}

	public void setRepartiCount(long repartiCount) 
	{
		this.repartiCount = repartiCount;
	}

	public Iterable<Reparti> getReparti() 
	{
		return reparti;
	}

	public void setReparti(Iterable<Reparti> reparti) 
	{
		this.reparti = reparti;
	}

	public long getBolleCount() 
	{
		return bolleCount;
	}

	public void setBolleCount(long bolleCount) 
	{
		this.bolleCount = bolleCount;
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
