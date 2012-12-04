/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class Schaltjahr {
  
  public static void main(String[] args) {
    
    int geburtsjahr = 1985;
    
    // Erste Bedingung
    // Jahr muss durch 4 teilbar sein
    if ( geburtsjahr%4 == 0 ) {
      if (geburtsjahr%100 == 0) {
        if (geburtsjahr%400 == 0) {
          System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist ein Schaltjahr" );
        }
        else
        {
          System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist kein Schaltjahr" );
        } 
      }
      else
      {
        System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist ein Schaltjahr" );
      } 
    } 
    else
    {
      System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist kein Schaltjahr" );
    }
    
    //---------------------------------------------------------------------------------------------------------
    
    // Vereinfachte Form
    if ( (geburtsjahr%400==0) || ( (geburtsjahr%4==0) && (geburtsjahr%100!=0) ) ) {
      System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist ein Schaltjahr" );
    }
    else
    {
      //System.out.println( "Mein Geburtsjahr " + geburtsjahr + " ist kein Schaltjahr" );
    }// end of if
    
  } // end of main
  
} // end of class Schaltjahr
