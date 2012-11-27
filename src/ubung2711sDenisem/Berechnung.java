package ubung2711.SDenisem;
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 27.11.2012
  * @author 
  */

public class Berechnung {
  
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  public static double kosten(Flugzeug tmp) {
    double ges = tmp.getPassagiere()*tmp.getTreibstoffkosten()*tmp.getTreibstoff_passagier()+2*tmp.getCrew()+2*tmp.getDocking()+
    0.8*tmp.getPassagiere()*tmp.getTreibstoffkosten()*tmp.getTreibstoff_passagier();                                //gesamte Flugkosten f�r Hin- und R�ckflug
    return ges;
  }
  
  
  public static double einnahmen(Flugzeug tmp) {
    double ges = tmp.getPassagiere()*tmp.getTicketkosten()+0.8*tmp.getPassagiere()*tmp.getTicketkosten();
    return ges;
  }
  
  
  public static double gewinn(Flugzeug tmp) {
    return einnahmen(tmp)-kosten(tmp);
  }
  
  // Ende Methoden
} // end of Berechnung
