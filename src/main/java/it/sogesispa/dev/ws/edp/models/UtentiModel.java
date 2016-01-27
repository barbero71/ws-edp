package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Utenti;

public class UtentiModel 
{
	private long count;
	private Iterable<Utenti> utenti;
	
	public UtentiModel(long count, Iterable<Utenti> utenti)
	{
		this.count = count;
		this.utenti = utenti;
	}
	
	public long getCount() {
		return count;
	}
	public void setCount(long l) {
		count = l;
	}
	public Iterable<Utenti> getUtenti() {
		return utenti;
	}
	public void setUser(Iterable<Utenti> utenti) {
		this.utenti = utenti;
	}
	
	
}
