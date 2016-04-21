package it.sogesispa.dev.ws.edp.entities;

import java.io.Serializable;

public class MbpCorpoPk implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	protected int mbpc_bpt_id;
	protected String mbpc_articolo;
	
	
	public MbpCorpoPk()
	{
		
	}

	public MbpCorpoPk(int mbpc_bpt_id, String mbpc_articolo) 
	{
		this.mbpc_bpt_id = mbpc_bpt_id;
		this.mbpc_articolo = mbpc_articolo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mbpc_bpt_id;
		result = prime * result + ((mbpc_articolo == null) ? 0 : mbpc_articolo.hashCode());

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
		MbpCorpoPk other = (MbpCorpoPk) obj;
		if (mbpc_bpt_id != other.mbpc_bpt_id)
			return false;
		if (mbpc_articolo == null) {
			if (other.mbpc_articolo != null)
				return false;
		} 
		return true;
	}

}
