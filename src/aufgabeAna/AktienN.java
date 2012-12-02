package aufgabeAna;

public class AktienN extends Depotverwaltung {
	public String Kennung;
	private double Gebuehr;
	private int Stueckzahl;
	private double Kurs;

	public AktienN(String kennung) {
		if (kennung.length() == 6) {
			if (kennung.charAt(0) == ('1')) {
				this.Kennung = kennung;
				Gebuehr = 0.0005;
				Stueckzahl = 1;
				Kurs = 100;
			} // end of if
		} // end of if

		else {
			System.out
					.println("Fehler! Bitte sechsstellige Kennung mit 1 als erster Ziffer.");

		} // end of if-else
	}

	public String getKennung() {
		return "Kennung: " + Kennung;
	}

	public String getGebuehr() {
		return "Gebuehr: " + Gebuehr;
	}

	public String getStueckzahl() {
		return "Stueckzahl: " + Stueckzahl;
	}

	public String getKurs() {
		return "Kurs: " + Kurs;
	}

	public void setKennung(String KennungNEU) {
		Kennung = KennungNEU;
	}

	public void setGebuehr(double GebuehrNEU) {
		Gebuehr = GebuehrNEU;
	}

	public void setStueckzahl(int StueckzahlNEU) {
		Stueckzahl = StueckzahlNEU;
	}

	public void setKurs(double KursNEU) {
		Kurs = KursNEU;
	}

	public double DepotgebuehrBerechnen() {
		return (double) Gebuehr * Stueckzahl * Kurs;
	}

}
