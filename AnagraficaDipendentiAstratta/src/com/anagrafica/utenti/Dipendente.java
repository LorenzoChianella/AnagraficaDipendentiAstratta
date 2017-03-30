package com.anagrafica.utenti;

public abstract class Dipendente extends Utente{
	
	public Dipendente(String nome, String cognome, String cf, String nomeAzienda) {
		super(nome, cognome, cf);
		this.nomeAzienda = nomeAzienda;
		this.matricola = generaMatricola();
	}
	String nomeAzienda;
	String matricola;
	
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public String getMatricola() {
		return matricola;
	}
	
	protected abstract String generaMatricola();

	@Override
	public void printFullDetails() {
		
		super.printFullDetails();
		
		String na ="Nome dell'azienda:";
		String ma ="Matricola:";
		System.out.format("%-20s %1s \n\r",na, nomeAzienda);
		System.out.format("%-20s %1s \n\r",ma, matricola);
		System.out.println ( "------------------------------------" );
	}
}
