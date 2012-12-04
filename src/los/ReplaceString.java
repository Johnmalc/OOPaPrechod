package los;
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
    
    text = "Der �si h�tte �ber die Stra�e laufen m�ssen. �brigens der �sterreichische Baum hat viele �ste!";
    
    System.out.println("Text vor der Umwandlung:\n" + text);
    
    text = text.replaceAll("�", "Oe");
    text = text.replaceAll("�", "oe");
    text = text.replaceAll("�", "Ue");
    text = text.replaceAll("�", "ue");
    text = text.replaceAll("�", "Ae");
    text = text.replaceAll("�", "ae");
    text = text.replaceAll("�", "ss"); 
    
    System.out.println("Text vor der Umwandlung:\n" + text);
    
  } // end of main
  
} // end of class ReplaceString
