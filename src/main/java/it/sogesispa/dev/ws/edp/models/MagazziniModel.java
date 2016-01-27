package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Magazzini;

public class MagazziniModel 
{
	private long count;
	private Iterable<Magazzini> mag;
	
	public MagazziniModel(long count, Iterable<Magazzini> mag)
	{
		this.count = count;
		this.mag = mag;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Magazzini> getMag() {
		return mag;
	}

	public void setMag(Iterable<Magazzini> mag) {
		this.mag = mag;
	}
	
}
