package aufgabeAna;

public class Rentenfonds extends Depotverwaltung {
	private String Kennung;
	private double Gebuehr;
	private int Sockelbetrag;
	private int Stueckzahl;
	private double Kurs;

	public Rentenfonds(String kennung) {
		if (kennung.length() == 6) {
			if (kennung.charAt(0) == ('2')) {
				Kennung = kennung;
				Gebuehr = 0.0002;
				Stueckzahl = 1;
				Kurs = 130;
				Sockelbetrag = 30;
			} // end of if
		} // end of if

		else {
			System.out
					.println("Fehler! Bitte sechsstellige Kennung mit 2 als erster Ziffer.");

		} // end of if-else
	}

	public String getKennung() {
		return "Kennung: " + Kennung;
	}

	public String getGebuehr() {
		return "Gebuehr: " + Gebuehr;
	}

	public String getSockelbetrag() {
		return "Sockelbetrag: " + Sockelbetrag;
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

	public void setSockelbetrag(int SockelbetragNEU) {
		Sockelbetrag = SockelbetragNEU;
	}

	public void setStueckzahl(int StueckzahlNEU) {
		Stueckzahl = StueckzahlNEU;
	}

	public void setKurs(double KursNEU) {
		Kurs = KursNEU;
	}

	public double DepotgebuehrBerechnen() {
		return (double) Gebuehr * (Stueckzahl * Kurs) + Sockelbetrag;
	}
}