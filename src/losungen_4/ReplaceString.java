/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.10.2012
  * @author 
  */

public class ReplaceString {
  
  public static void main(String[] args) {
    
    String text;
    
    text = "Der Ösi hätte über die Straße laufen müssen. Übrigens der österreichische Baum hat viele Äste!";
    
    System.out.println("Text vor der Umwandlung:\n" + text);
    
    text = text.replaceAll("Ö", "Oe");
    text = text.replaceAll("ö", "oe");
    text = text.replaceAll("Ü", "Ue");
    text = text.replaceAll("ü", "ue");
    text = text.replaceAll("Ä", "Ae");
    text = text.replaceAll("ä", "ae");
    text = text.replaceAll("ß", "ss"); 
    
    System.out.println("Text vor der Umwandlung:\n" + text);
    
  } // end of main
  
} // end of class ReplaceString
