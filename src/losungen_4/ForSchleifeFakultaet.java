/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class ForSchleifeFakultaet {
  
  public static void main(String[] args) {
    
    short zahl;
    int ergebnis;
    
    zahl = 5;
    ergebnis = 1;
    
    for (short i = 1; i <= zahl; i++ ) {
      ergebnis *= i;
    } // end of for
    
    System.out.println("Das Ergebnis von " + zahl + "! ist: " + ergebnis);
    
  } // end of main

} // end of class Fakultaet
