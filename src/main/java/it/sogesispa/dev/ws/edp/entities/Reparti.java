package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JSN_REPARTI")
public class Reparti 

{
	@Id
	@Column(name="JCLS_CODICE")
	private int codice;
	@Column(name="JCLS_SUBCOD")
	private String subCod;
	@Column(name="JCLS_REPCOD")
	private String repCod;
	@Column(name="JCLS_SEZCOD")
	private String sezCod;
	@Column(name="JCLS_LIVELLO")
	private String livello;
	@Column(name="JCLS_DESCRIZIONE")
	private String descrizione;
	@Column(name="JCLS_IP")
	private String ip;
}
