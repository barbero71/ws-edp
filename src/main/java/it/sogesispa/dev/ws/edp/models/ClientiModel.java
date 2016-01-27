package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Clienti;

public class ClientiModel 
{

	private long count;
	private Iterable<Clienti> clienti;
	
	public ClientiModel(long count, Iterable<Clienti> clienti) {
		this.count = count;
		this.clienti = clienti;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Clienti> getClienti() {
		return clienti;
	}

	public void setCli(Iterable<Clienti> clienti) {
		this.clienti = clienti;
	}
	
	
}
