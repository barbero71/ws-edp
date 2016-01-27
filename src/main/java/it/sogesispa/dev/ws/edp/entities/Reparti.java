package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="JSN_REPARTI")
@IdClass(RepartiPk.class)
public class Reparti 

{
	@Id
	@Column(name="JCLS_CODICE")
	private int codice;
	@Id
	@Column(name="JCLS_SUBCOD")
	private String subCod;
	@Id
	@Column(name="JCLS_REPCOD")
	private String repCod;
	@Id
	@Column(name="JCLS_SEZCOD")
	private String sezCod;
	@Column(name="JCLS_LIVELLO")
	private String livello;
	@Column(name="JCLS_DESCRIZIONE")
	private String descrizione;
	@Column(name="JCLS_IP")
	private String ip;
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getSubCod() {
		return subCod;
	}
	public void setSubCod(String subCod) {
		this.subCod = subCod;
	}
	public String getRepCod() {
		return repCod;
	}
	public void setRepCod(String repCod) {
		this.repCod = repCod;
	}
	public String getSezCod() {
		return sezCod;
	}
	public void setSezCod(String sezCod) {
		this.sezCod = sezCod;
	}
	public String getLivello() {
		return livello;
	}
	public void setLivello(String livello) {
		this.livello = livello;
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
