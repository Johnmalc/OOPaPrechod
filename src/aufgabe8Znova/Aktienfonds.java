package aufgabe8Znova;

public class Aktienfonds extends SuperKlasse {
	String Name;
	int Kennung;
	double GebuhrInProzent = 0.2;
	int Sockelbetrag = 30;
	int Stuckzahl;
	double Kurs;
	int KaufenStuckzahl;
	int VerkaufenStuckzah;

	public Aktienfonds(String nameX, int KennungX) {
		if (numlength(KennungX) == 6) {
			if (intAt(KennungX, 0) == 2 ) {
				this.Name = nameX;
				this.Kennung = KennungX;
			}
		}
	}

	@Override
	public String toString() {
		return Name + " " + Kennung;
	}

	public static int intAt(int num, int index) {
		String s = Integer.toString(num);
		int r = Integer.parseInt(s.substring(index, index + 1));
		return r;
	}

	public static int numlength(int n) {
		int l;
		n = Math.abs(n);
		for (l = 0; n > 0; ++l)
			n /= 10;
		return l;
	}

	@Override
	public double getBerechneGebuhren() {
		double gebuhr = Sockelbetrag + getAktuellenWer() * GebuhrInProzent;
		return gebuhr;
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

}
