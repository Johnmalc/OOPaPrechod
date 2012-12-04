package los;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class SchleifeSchaltjahre {
  
  public static void main(String[] args) {
    
      
    for (int jahr=1900;jahr<2013 ;jahr++ ) {

      // Erste Bedingung
      // Jahr muss durch 4 teilbar sein
      if ( jahr%4 == 0 ) {
        if (jahr%100 == 0) {
          if (jahr%400 == 0) {
            System.out.println( "Das Jahr " + jahr + " ist ein Schaltjahr" );
          }
          else
          {
            System.out.println( "Das Jahr " + jahr + " ist kein Schaltjahr" );
          } 
        }
        else
        {
          System.out.println( "Das Jahr " + jahr + " ist ein Schaltjahr" );
        } 
      } 
      else
      {
        System.out.println( "Das Jahr " + jahr + " ist kein Schaltjahr" );
      }
      
      //---------------------------------------------------------------------------------------------------------
      
      // Vereinfachte Form
      if ( (jahr%400==0) || ( (jahr%4==0) && (jahr%100!=0) ) ) {
        System.out.println( "Das Jahr " + jahr + " ist ein Schaltjahr" );
      }
      else
      {
        System.out.println( "Das Jahr " + jahr + " ist kein Schaltjahr" );
      }// end of if
      
      
    } // end of for
    
  } // end of main
  
} // end of class Schaltjahr
