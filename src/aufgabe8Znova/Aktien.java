package aufgabe8Znova;
public class Aktien extends SuperKlasse {
  String Name;
  int Kennung;
  double GebuhrInProzent = 0.5;
  int Stuckzahl;
  double Kurs;
  int KaufenStuckzahl;
  int VerkaufenStuckzah;

  public Aktien(String nameX, int KennungX) {
    if (numlength(KennungX) == 6) {
      if (intAt(KennungX, 0) == 1) {
        this.Name = nameX;
        this.Kennung = KennungX;
      }
    } else {
      System.out.println("Sie mussen nur 6 stellige Ziffer eingeben");
    }
  }


  @Override
  public int getKaufenStuckzahl() {
    return KaufenStuckzahl;
  }

  @Override
  public int getVerkaufenStuckzahl( ) {
    if(VerkaufenStuckzah >= KaufenStuckzahl) {
      System.out.println("Sie konnen nicht merh verkaufen als kaufen");
    }
    return VerkaufenStuckzah;
  }

  @Override
  public void setKaufenStuckzahl(int KaufenStuckzahlX) {
    this.KaufenStuckzahl = KaufenStuckzahlX;
  }

  @Override
  public void setVerkaufenStuckzahl(int VerkaufenStuckzahX) {
    this.VerkaufenStuckzah = VerkaufenStuckzahX;
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
