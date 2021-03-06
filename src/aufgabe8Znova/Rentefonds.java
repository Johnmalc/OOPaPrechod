package aufgabe8Znova;

public class Rentefonds extends SuperKlasse {
  String Name;
  int Kennung;
  double GebuhrInProzent = 0.05;
  int Stuckzahl;
  double Kurs;
  int KaufenStuckzahl;
  int VerkaufenStuckzah;

  public Rentefonds(String NameX, int KennungX) {
    if (numlength(KennungX) == 6) {
      if (intAt(KennungX, 0) == 3) {
        this.Name = NameX;
        this.Kennung = KennungX;
      }
    }
  }

  @Override
  public int getKaufenStuckzahl() {
    return KaufenStuckzahl;
  }

  @Override
  public int getVerkaufenStuckzahl() {
      return VerkaufenStuckzah;
    }


  @Override
  public void setKaufenStuckzahl(int KaufenStuckzahlX) {
    this.KaufenStuckzahl = KaufenStuckzahlX;
  }

  @Override
  public void setVerkaufenStuckzahl(int VerkaufenStuckzahlX) {
    this.VerkaufenStuckzah = VerkaufenStuckzahlX;
  }

  @Override
  public double getkursSetzen() {
    return Kurs;
  }

  @Override
  public void setKursSetzen(double kursX) {
    this.Kurs = kursX;
  }

  @Override
  public double getAktuellenWer() {
    double wert = Kurs * KaufenStuckzahl;
    return wert;
  }

  @Override
  public String toString() {
    return Name + " " + Kennung;
  }

  @Override
  public double getBerechneGebuhren() {
    double gebuhr = GebuhrInProzent * getAktuellenWer();
    return gebuhr;
  }

}
