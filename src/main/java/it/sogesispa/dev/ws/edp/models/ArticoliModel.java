package it.sogesispa.dev.ws.edp.models;

import it.sogesispa.dev.ws.edp.entities.Articoli;

public class ArticoliModel 
{

	private long count;
	private Iterable<Articoli> articoli;
	
	public ArticoliModel(long count, Iterable<Articoli> articoli) {
		this.count = count;
		this.articoli = articoli;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public Iterable<Articoli> getArticoli() {
		return articoli;
	}

	public void setArt(Iterable<Articoli> articoli) {
		this.articoli = articoli;
	}

}
