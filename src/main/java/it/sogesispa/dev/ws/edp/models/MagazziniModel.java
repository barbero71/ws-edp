package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Magazzini;

public class MagazziniModel 
{
	private long count;
	private Iterable<Magazzini> magazzini;
	
	public MagazziniModel(long count, Iterable<Magazzini> magazzini)
	{
		this.count = count;
		this.magazzini = magazzini;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Magazzini> getMagazzini() {
		return magazzini;
	}

	public void setMag(Iterable<Magazzini> magazzini) {
		this.magazzini = magazzini;
	}
	
}
