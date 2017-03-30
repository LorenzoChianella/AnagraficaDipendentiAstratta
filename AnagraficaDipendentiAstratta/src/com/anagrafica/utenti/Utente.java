package com.anagrafica.utenti;

public class Utente {

	private String nome;	
	private String cognome;
	private String cf;
	
	public Utente(String nome, String cognome, String cf) 
	{		
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public void printFullDetails()
	{
		String n="Nome:";
		String c="Cognome:";
		String cod="Codice Fiscale:";
		System.out.println("---------------");
		System.out.format("%-20s %1s \n\r",n, nome);
		System.out.format("%-20s %1s \n\r",c, cognome);
		System.out.format("%-20s %1s \n\r",cod, cf);
		
	}
}
