/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class ForEinmalEins {
  
  public static void main(String[] args) {
    
    short max;
    
    max = 10;
    
    for (short i = 1; i <= max; i++ ) {
      
      for (short k = 1;k <= max ;k++ ) {
        System.out.println(k + " x " + i + " = " + k * i);
      } // end of for
      
      System.out.println("");
      
    } // end of for
    
    
  } // end of main
  
} // end of class ForEinmalEins
