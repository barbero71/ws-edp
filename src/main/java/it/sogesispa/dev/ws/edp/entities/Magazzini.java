package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JSN_MAGAZZINI")
public class Magazzini 
{
	@Id
	@Column(name="JMAG_CODICE")
	private String codice;
	@Column(name="JMAG_DESCRIZIONE")
	private String descrizione;
	@Column(name="JMAG_IP")
	private String ip;
	
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
