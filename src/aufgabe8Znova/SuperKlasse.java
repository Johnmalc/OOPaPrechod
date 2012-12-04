package aufgabe8Znova;

public abstract class SuperKlasse {
  public int Kennung;
  public String Name;
  public int Stuckzahl;
  public double Kurs;
  public double GebuhrInProzent;
  public int KaufenStuckzahl;
  public int VerkaufenStuckzah;

  public abstract int getKaufenStuckzahl();

  public abstract int getVerkaufenStuckzahl();

  public abstract void setKaufenStuckzahl(int KaufenStuckzahlX);
  
  public abstract void setVerkaufenStuckzahl(int VerkaufenStuckzahlX);

  public abstract double getkursSetzen();

  public abstract void setKursSetzen(double kursX);

  public abstract double getAktuellenWer();

  public abstract String toString();

  public abstract double getBerechneGebuhren();

}
