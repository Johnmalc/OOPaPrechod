package pad;

import java.util.Scanner;
import Prog1Tools.IOTools;

public class Aufgabe4 {

	/**
	 * Schreiben Sie ein Programm, das Studentendaten für maximal 10 Studenten
	 * (Name, Vorname, Matr.Nr., Studiengang, Semester, eMail)
	 * verwaltet (ähnlich dem Beispielprogramm für die Adressen).
	 * Die Ausgabe von Daten soll nur gemacht werden, wenn gültige Daten 
	 * eingegeben wurden.
	 * Die Eingabe bei einem Index, für den bereits Daten vorliegen, soll 
	 * erst nach Sicherheitsabfrage erfolgen.
	 * Nach der Eingabe von Daten soll sofort die Ausgabe erfolgen.
	 * Es sollen auch die Daten eines Studenten gelöscht werden können,
	 * danach sollen bei diesem Index auch keine Daten mehr angezeigt werden.
	 * Hilfe: Sie brauchen eine Kennung, ob an einer Indexposition gültige
	 * Daten vorliegen. 
	 * Diese Kennung sollte zu Beginn initialisiert werden.
	 * 
	 * https://github.com/Johnmalc/PAD/blob/master/5/2%20Klasse%20%28Daten%29/4/AdressBuch_v1.java
	 * 
	 * 
	 */
	public static class Kontakt{
		String name;
		String vorname;
		String studiengang;
		String email;
		int semester;
		int matrikel;
		
	}
	
	
	public static void main(String[] args) {
		
		Kontakt details = new Kontakt();
		// for a menu, a convection
		boolean fertigMitProgramm = false;
		int yourChoice = IOTools.readInt("Your choice for menu, please");
		
		// repead action after your input
		while(!false) {
			
		// choose a number and procced
		switch(yourChoice){
		case : 
			break;
		case :
			break;
		case : 
			break;
			
		
		// exit programm
		case /*Number*/ :
		fertigMitProgramm = true;
		break;
		
		
		// user's input  = error
		default: 
			System.out.println("You cannot write a text (String) or number bigger than x");
			
		
		
		
			}
		
		}
		
		
	}

}
