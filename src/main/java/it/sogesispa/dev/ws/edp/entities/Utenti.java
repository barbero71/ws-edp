package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JSN_UTENTI")
public class Utenti
{
	@Id
	@Column(name="JUSER_LOGIN")
	private String login;
	@Column(name="JUSER_NOME")
	private String nome;
	@Column(name="JUSER_COGNOME")
	private String cognome;
	@Column(name="JUSER_PASSWD")
	private String pwd;
	@Column(name="JUSER_IP")
	private String ip;
	
	
	/*
	public User(String login, String nome, String cognome, String pwd, String ip) 
	{
		this.login = login;
		this.nome = nome;
		this.cognome = cognome;
		this.pwd = pwd;
		this.ip = ip;
	}
	*/
	public String getLogin() 
	{
		return login;
	}
	
	public void setLogin(String login) 
	{
		this.login = login;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getCognome() 
	{
		return cognome;
	}
	
	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}
	
	public String getPwd() 
	{
		return pwd;
	}
	
	public void setPwd(String pwd) 
	{
		this.pwd = pwd;
	}
	
	public String getIp() 
	{
		return ip;
	}
	
	public void setIp(String ip) 
	{
		this.ip = ip;
	}
	

}
