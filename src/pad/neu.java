package pad;

import Prog1Tools.IOTools;

public class neu {
	public static class Adresse { // Adressdaten zusammengefasst
	    public String name;
	    public String strasse;
	    public int hausnummer;
	    public int postleitzahl;
	    public String wohnort;
	    public String mail;
	    public String kommentar;
	  }
	    
	  public static void main(String[] args) { // Hauptprogramm
	    // Benoetigte Variablen
	    Adresse adr0=new Adresse();
	    Adresse adr1=new Adresse();
	    Adresse adr=adr0;
	    boolean fertig=false;
	    // Starte das Programm mit eines huebschen Ausgabe
	    System.out.println("================");
	    System.out.println("Adressverwaltung");
	    System.out.println("================");
	    // Schleifenbeginn
	    while (!fertig) {
	      // Menue
	      System.out.println(" ");
	      System.out.println("1 = Adresseingabe");
	      System.out.println("2 = Adressausgabe");
	      System.out.println("3 = aktuelle Adresse wechseln");
	      System.out.println("4 = Programm beenden");
	      int auswahl=IOTools.readInteger("Ihre Wahl:");
	      // Fallunterscheidung
	      switch(auswahl) {
	        case 1: // Adresse eingeben
	          adr.name =IOTools.readLine ("Name : ");
	          adr.strasse =IOTools.readLine ("Strasse : ");
	          adr.hausnummer =IOTools.readInteger("Hausnummer: ");
	          adr.wohnort =IOTools.readLine ("Wohnort : ");
	          adr.postleitzahl=IOTools.readInteger("PLZ : ");
	          adr.mail =IOTools.readLine ("E-Mail : ");
	          adr.kommentar =IOTools.readLine ("Kommentar : ");
	          break;
	        case 2: // Adresse ausgeben
	          System.out.println(adr.name);
	          System.out.println(adr.strasse+" "+adr.hausnummer);
	          System.out.println(adr.postleitzahl+" "+adr.wohnort);
	          System.out.println("E-Mail: "+adr.mail);
	          System.out.println("KOMMENTAR: "+adr.kommentar);
	          break;
	        case 3: // Adresse wechseln
	          int n=IOTools.readInteger("Neue Adressennummer "
	                                    +"(zwischen 0 und 1):");
	          adr=(n==0)?adr0:adr1;
	          break;
	        case 4: // Programm beenden
	          fertig=true;
	          break;
	        default: // Falsche Zahl eingegeben
	          System.out.println("Eingabefehler!");
	      }
	    } // Schleifenende
	  } // Ende des Hauptprogramms
	} // Ende des Programms
