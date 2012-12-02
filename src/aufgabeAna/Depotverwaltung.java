package aufgabeAna;

public abstract class Depotverwaltung {
	String Kennung;
	double Gebuehr;
	int Stueckzahl;
	double Kurs;

	// Konstruktor
	public Depotverwaltung() {
	}

	// Met

	public abstract String getKennung();

	public abstract String getGebuehr();

	public abstract String getStueckzahl();

	public abstract String getKurs();

	public abstract void setKennung(String KennungNEU);

	public abstract void setGebuehr(double GebuehrNEU);

	public abstract void setStueckzahl(int StueckzahlNEU);

	public abstract void setKurs(double KursNEU);

	public abstract double DepotgebuehrBerechnen();

}
