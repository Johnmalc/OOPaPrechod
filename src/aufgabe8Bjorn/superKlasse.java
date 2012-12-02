package aufgabe8Bjorn;

public class superKlasse {
	int stueckzahl;
	double kurs;
	double gebuehr;
	double gebuehrSatz;
	double sockelbetrag;
	String name;
	int kennung;
	int vermoegen;

	public superKlasse() {
		stueckzahl = 0;
		kurs = 0;
		name = "default";
		kennung = 9999;
		vermoegen = 0;
		gebuehr = 0;
		gebuehrSatz = 0;
		sockelbetrag = 0;

	}

	// Get Methoden
	public String getAktienName() {
		return this.name;
	}

	public int getAktienKennung() {
		return this.kennung;
	}

	public int getAktienStueckzahl() {
		return this.stueckzahl;
	}

	public double getAktienWert() {
		return (double) (this.stueckzahl * this.kurs);
	}

	public double getAktienKurs() {
		return this.kurs;
	}

	public int getVermoegen() {
		return this.vermoegen;
	}

	public double getGebuehr() {
		return this.gebuehr;

	}

	// Set Methoden
	public void setKurs(double newKurs) {
		this.kurs = newKurs;
	}

	public void setStueckzahl(int newStueckzahl) {
		this.stueckzahl = newStueckzahl;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setKennung(int newKennung) {
		this.kennung = newKennung;
	}

	public void AktienVerkauf(int anzahlVerkauf) {
		this.stueckzahl = (this.stueckzahl - anzahlVerkauf);
		this.vermoegen = (this.vermoegen + ((int) (anzahlVerkauf * this.kurs)));

	}

	public void AktienAnkauf(int anzahlAnkauf) {
		this.stueckzahl = (this.stueckzahl + anzahlAnkauf);
		this.vermoegen = (this.vermoegen - ((int) (anzahlAnkauf * this.kurs)));

	}

	public void calcualte() {

		this.gebuehr = ((double) (this.gebuehrSatz * this.getAktienWert() / 100) + (this.sockelbetrag));

	}

}
