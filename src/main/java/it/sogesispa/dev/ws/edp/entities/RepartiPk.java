package it.sogesispa.dev.ws.edp.entities;

import java.io.Serializable;

public class RepartiPk implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	protected int codice;
	protected String subCod;
	protected String repCod;
	protected String sezCod;
	
	public RepartiPk()
	{
		
	}

	public RepartiPk(int codice, String subCod, String repCod, String sezCod) 
	{
		this.codice = codice;
		this.subCod = subCod;
		this.repCod = repCod;
		this.sezCod = sezCod;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codice;
		result = prime * result + ((repCod == null) ? 0 : repCod.hashCode());
		result = prime * result + ((sezCod == null) ? 0 : sezCod.hashCode());
		result = prime * result + ((subCod == null) ? 0 : subCod.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RepartiPk other = (RepartiPk) obj;
		if (codice != other.codice)
			return false;
		if (repCod == null) {
			if (other.repCod != null)
				return false;
		} else if (!repCod.equals(other.repCod))
			return false;
		if (sezCod == null) {
			if (other.sezCod != null)
				return false;
		} else if (!sezCod.equals(other.sezCod))
			return false;
		if (subCod == null) {
			if (other.subCod != null)
				return false;
		} else if (!subCod.equals(other.subCod))
			return false;
		return true;
	}

}
