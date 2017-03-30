package com.anagrafica.utenti;

public class DipendenteA1 extends Dipendente {
	
 public DipendenteA1(String nome, String cognome, String cf, String nomeAzienda) {
		super(nome, cognome, cf, nomeAzienda);
		this.matricola = generaMatricola();
	}
	
	protected String generaMatricola()
	{
		String mat = this.getNome().substring(0,2);
		mat+= this.getCognome().substring(0, 2);
		Double rnd = Math.random()*100;
		mat+=rnd.intValue();
		return mat;
	}

}