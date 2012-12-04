package los;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class StringEZaehlen {
  
  public static void main(String[] args)
  { 
    String text;
    char letterToSearch = 'e';
    int lengthOfText;
    int anzahl;
    
    text = "Wie oft kommt der Buchstabe (kleines) e in diesem kurzen Text vor?";
    lengthOfText = text.length();
    anzahl = 0;
    
    for (int pos = 0; pos < lengthOfText; pos++ )
    {
      if (text.charAt(pos) == letterToSearch)
      {
         anzahl++;
      } 
    }
    
    System.out.println("Der Buchstabe " + letterToSearch + " kommt genau " + anzahl + " mal vor");
    
  } // end of main
  
} // end of class StringEZaehlen
