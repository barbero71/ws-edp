package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JSN_CLIENTI")
public class Clienti 
{
	@Id
	@Column(name="JCL_CODICE")
	private String codice;
	@Column(name="JCL_RAGSOC")
	private String ragsoc;
	@Column(name="JCL_IP")
	private String ip;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getRagsoc() {
		return ragsoc;
	}
	public void setRagsoc(String ragsoc) {
		this.ragsoc = ragsoc;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
