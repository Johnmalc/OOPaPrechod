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
		  
		  	 Kontakt[] kontakten = new Kontakt[10];
		  	 Kontakt details = null;
	
		  	 for(int i = 0; i < kontakten.length; i++){
		  		 kontakten[i] = new Kontakt();
		  		 details = kontakten[0];
		  	 }
		   
	         // for a menu, a convection
	         boolean fertigMitProgramm = false;
	    	 System.out.println("\n");
	         
	         // repead action after your input
	         while(!false) {
	        	 
	        	 System.out.println("Menu 1  : Eingabe");
	             System.out.println("Menu 2  : Schuler Daten bearbeiten (Loschen)");
	             System.out.println("Menu 3  : Programm beenden ");
	             
	             int yourChoice = IOTools.readInt("Your choice for menu, please");
	            
	          // choose a number and procced
	          switch(yourChoice){
	          
	          // eingabe ausgabe
	          case 1 :
	        	   System.out.println("");
	        	   System.out.println("Geben Sie jetzt ihre daten ein");
	        	   
	               details.name = IOTools.readLine("Name eingeben");
	               details.vorname = IOTools.readLine("Vorname eingeben");
	               details.studiengang = IOTools.readLine("Studiengang eingeben");
	               details.email = IOTools.readLine("Email eingeben");
	               details.semester = IOTools.readInt("Semester eingeben");
	               details.matrikel = IOTools.readInt("Matrikel Nummer eingeben");
	              
	               System.out.println("");
	               System.out.println(details.name);
	               System.out.println(details.vorname);
	               System.out.println(details.studiengang);
	               System.out.println(details.semester);
	               System.out.println(details.matrikel);
	               System.out.println("");
	               
	          break;
	          
	          
	          // Schuller wechseln = array uberschreiben
	          case 2 :
	//        	  if(kontakten[i] ==  ) {
	//        		  
	//        	  }
	        	  int n = IOTools.readInteger("Schuller wechseln an position"
	                      + " 1 bis 10):");
	        	  details = kontakten[n-1];
	        	  
	          // Fertig
	          case 3 : 
	        	  fertigMitProgramm = true;
	        	  
	          break;
	          
	          // user's input = error = Fertig
	          default:
	        	  System.out.println("You cannot write a text (String) or number bigger than " + yourChoice);
	          }
	      }
	
	  }
	}