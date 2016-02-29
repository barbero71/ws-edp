package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JSN_ARTICOLI")
public class Articoli 
{
	@Id
	@Column(name="JART_CODICE")
	private String codice;
	@Column(name="PACCODA")
	private int pacco_da;
	@Column(name="JART_DESCRIZIONE")
	private String descrizione;
	@Column(name="JART_IP")
	private String ip;
	
	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	public int getPacco_da() {
		return pacco_da;
	}
	public void setPacco_da(int pacco_da) {
		this.pacco_da = pacco_da;
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
