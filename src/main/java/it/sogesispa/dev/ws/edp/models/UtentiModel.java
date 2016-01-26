package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Utenti;

public class UtentiModel 
{
	private long count;
	private Iterable<Utenti> user;
	
	public UtentiModel(long count, Iterable<Utenti> user)
	{
		this.count = count;
		this.user = user;
	}
	
	public long getCount() {
		return count;
	}
	public void setCount(long l) {
		count = l;
	}
	public Iterable<Utenti> getUser() {
		return user;
	}
	public void setUser(Iterable<Utenti> user) {
		this.user = user;
	}
	
	
}
