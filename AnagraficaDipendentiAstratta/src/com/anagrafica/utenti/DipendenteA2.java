package com.anagrafica.utenti;

public class DipendenteA2 extends Dipendente {
	
	 public DipendenteA2(String nome, String cognome, String cf, String nomeAzienda) {
			super(nome, cognome, cf, nomeAzienda);
			this.matricola = generaMatricola();
		}
		
		protected String generaMatricola()
		{
			String mat = this.getNome().substring(0,3);
			mat+= this.getCognome().substring(0, 3);			
			return mat;
		}

	}
