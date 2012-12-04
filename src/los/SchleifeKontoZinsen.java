package los;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class SchleifeKontoZinsen {
  
  public static void main(String[] args) {
    
    short laufzeit;
    float kontostand;
    float guthaben;
    float zinssatz;
    
    laufzeit = 10;
    kontostand = 1250.54f;
    guthaben = 1250.54f;  // oder guthaben = kontostand;
    zinssatz = 1.0134f;
    
    System.out.println("Das Startguthaben in Euro betraegt: \t" + guthaben);
    System.out.println("-----------------------------------------------------------");
    
    for (short i=1;i <= laufzeit; i++ ) {
      guthaben = guthaben * zinssatz;
      System.out.println("Guthaben nach dem " + i + ". Jahr in Euro: \t" + guthaben);
    } // end of for
    
    System.out.println("-----------------------------------------------------------");
    System.out.println("Zinsen nach " + laufzeit + " Jahren in Euro: \t\t" + (guthaben - kontostand)); 
    
  } // end of main
  
} // end of class SchleifeKontoZinsen
