package it.sogesispa.dev.ws.edp.entities;

import java.io.Serializable;

public class BollePk implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	protected int jpbd_id;
	protected String jbpc_articolo;
	
	
	public BollePk()
	{
		
	}

	public BollePk(int jpbd_id, String jbpc_articolo) 
	{
		this.jpbd_id = jpbd_id;
		this.jbpc_articolo = jbpc_articolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jpbd_id;
		result = prime * result + ((jbpc_articolo == null) ? 0 : jbpc_articolo.hashCode());

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
		BollePk other = (BollePk) obj;
		if (jpbd_id != other.jpbd_id)
			return false;
		if (jbpc_articolo == null) {
			if (other.jbpc_articolo != null)
				return false;
		} 
		return true;
	}

}
