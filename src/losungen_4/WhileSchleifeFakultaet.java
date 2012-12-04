/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class WhileSchleifeFakultaet {
  
  public static void main(String[] args) {
    
    short zaehler;
    short zahl;
    int ergebnis;
    
    zaehler = 0;
    zahl = 5;
    ergebnis = 0;
    
    while (zaehler <= zahl) { 
      ergebnis = ergebnis + zaehler;
      zaehler++;
    } // end of while
    
    System.out.println("Das Ergebnis von " + zahl + "! ist: " + ergebnis);
    
  } // end of main
  
} // end of class Fakultaet
