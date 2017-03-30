package com.anagrafica;

import java.util.Scanner;
import com.anagrafica.utenti.Dipendente;
import com.anagrafica.utenti.DipendenteA1;
import com.anagrafica.utenti.DipendenteA2;
import com.anagrafica.utenti.Utente;


public class Main {

	private static Scanner scanner;
	public static void showMenu()
	{		
		System.out.println("\"a\" >> Inserisci un nuovo Dipendente:  ");
		System.out.println("\"b\" >> Conta i dipendenti inseriti:  ");
		System.out.println("\"c\" >> Guarda la lista dei dipendenti:  ");
		System.out.println("\"d\" >> ESCI");
	}

	public static void main(String[] args) {



		System.out.println("Ciao "+ args[0].toString() + "!!");	
		scanner = new Scanner(System.in);

		System.out.println("DI che azienda fai parte? 1 o 2");
		int codice = scanner.nextInt();

		Utente[] dipendenti;

		if (codice == 1)
		{
			dipendenti = new DipendenteA1[3];
		}
		else
		{
			dipendenti = new DipendenteA2[3];
		}

		String linea = ""; 
		int len=0;

		while (!"d".equals(linea = scanner.nextLine())){

			switch (linea) {

			case "a":
				System.out.println ( "------------------------------------" );


				System.out.println("Inserisci nome: ");
				String nome = scanner.nextLine();
				System.out.println("Inserisci cognome: ");
				String cognome = scanner.nextLine();
				System.out.println("Inserisci codice fiscale: ");
				String cf = scanner.nextLine();	 
				System.out.println("Inserisci il nome dell'azienda: ");
				String nomeAzienda = scanner.nextLine();

				Utente dipendente;
						if (codice ==1 ){
								dipendente = new DipendenteA1(nome, cognome, cf, nomeAzienda);}
						else {
								dipendente = new DipendenteA2(nome, cognome, cf, nomeAzienda);
							 }
						
				dipendenti[len++]= dipendente;												
				dipendente.printFullDetails();

				break;

			case "b":

				System.out.println ( "------------------------------------" );
				System.out.println ( "I dipendenti inseriti sono: " + len);
				break;

			case "c":
				for (int i=0; i<len;i++)
				{
					Utente dip= dipendenti[i];

					dip.printFullDetails();
				}

				break;

			case "d":

				break;

			
				default:
					System.err.println("PREMI IL TASTO CORRISPONDENTE E PREMI INVIO");
					break;
			}		
			showMenu();
		}
		System.out.println ( "Ciao Ciao!!" );




	}

}


