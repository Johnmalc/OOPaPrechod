package aufgabe8Bjorn;

public class aktienProgramm {
	public static void main(String[] args) {
		aktien depot1 = new aktien();

		depot1.setName("Daimler AG");
		depot1.setStueckzahl(2000);
		depot1.setKennung(2425);
		depot1.setKurs(36.84);

		// Ausgabe!

		System.out
				.println("-----------------------------------------------------");
		System.out.println("Aktien von                : "
				+ depot1.getAktienName());
		System.out.println("Stueckzahl                : "
				+ depot1.getAktienStueckzahl());
		System.out.println("Kennung                   : "
				+ depot1.getAktienKennung());
		System.out.println("Aktueller Kurs            : "
				+ depot1.getAktienKurs());
		System.out.println("Aktueller Wert des Depots : "
				+ depot1.getAktienWert() + " Euro");
		System.out.println("Aktuelles Vermoegen       : "
				+ depot1.getVermoegen() + " Euro");
		System.out.println("");
		System.out.println("");

		// Verkauf von Aktien!

		depot1.AktienVerkauf(1000);

		System.out.println("NACH VERKAUF");
		System.out
				.println("-----------------------------------------------------");
		System.out.println("Aktien von                : "
				+ depot1.getAktienName());
		System.out.println("Stueckzahl                : "
				+ depot1.getAktienStueckzahl());
		System.out.println("Kennung                   : "
				+ depot1.getAktienKennung());
		System.out.println("Aktueller Kurs            : "
				+ depot1.getAktienKurs());
		System.out.println("Aktueller Wert des Depots : "
				+ depot1.getAktienWert() + " Euro");
		System.out.println("Aktuelles Vermoegen       : "
				+ depot1.getVermoegen() + " Euro");
		System.out.println("");
		System.out.println("");

		// Ankauf von Aktien!

		depot1.AktienAnkauf(500);

		System.out.println("NACH ANKAUF");
		System.out
				.println("-----------------------------------------------------");
		System.out.println("Aktien von                : "
				+ depot1.getAktienName());
		System.out.println("Stueckzahl                : "
				+ depot1.getAktienStueckzahl());
		System.out.println("Kennung                   : "
				+ depot1.getAktienKennung());
		System.out.println("Aktueller Kurs            : "
				+ depot1.getAktienKurs());
		System.out.println("Aktueller Wert des Depots : "
				+ depot1.getAktienWert() + " Euro");
		System.out.println("Aktuelles Vermoegen       : "
				+ depot1.getVermoegen() + " Euro");

	}

}