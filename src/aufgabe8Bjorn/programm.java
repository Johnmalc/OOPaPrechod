package aufgabe8Bjorn;

public class programm {
	public static void main(String[] args) {

		superKlasse[] depotVerwaltung = new superKlasse[3];

		int depotanzahl = 3;
		int i = 0;
		//int a = 0;
		int f = 0;
		int g = 1;
		int h = 1;

		depotVerwaltung[0] = new aktien();
		depotVerwaltung[0].setName("Daimler AG");
		depotVerwaltung[0].setStueckzahl(2000);
		depotVerwaltung[0].setKurs(36.84);

		depotVerwaltung[1] = new aktienfonds();
		depotVerwaltung[1].setName("Kapital Plus");
		depotVerwaltung[1].setStueckzahl(350);
		depotVerwaltung[1].setKurs(30.00);

		depotVerwaltung[2] = new rentenfonds();
		depotVerwaltung[2].setName("Union Investment");
		depotVerwaltung[2].setStueckzahl(500);
		depotVerwaltung[2].setKurs(32.70);

		// ARRAY AUSGABE!
		// --------------------------------------------------------------------------
		while (i < depotanzahl) {

			// Ausgabe!
			System.out.println("");
			System.out.println("");
			System.out.println("DEPOT " + h);
			System.out
					.println("-----------------------------------------------------");
			System.out.println("Aktien von                : "
					+ depotVerwaltung[i].getAktienName());
			System.out.println("Stueckzahl                : "
					+ depotVerwaltung[i].getAktienStueckzahl());
			System.out.println("Kennung                   : "
					+ depotVerwaltung[i].getAktienKennung());
			System.out.println("Aktueller Kurs            : "
					+ depotVerwaltung[i].getAktienKurs());
			System.out.println("Aktueller Wert des Depots : "
					+ depotVerwaltung[i].getAktienWert() + " Euro");
			System.out.println("Aktuelles Vermoegen       : "
					+ depotVerwaltung[i].getVermoegen() + " Euro");
			System.out.println("");
			System.out.println("");

			// Verkauf von Aktien!

			depotVerwaltung[i].AktienVerkauf(150);

			System.out.println("nach verkauf");
			System.out.println("-------------");
			System.out.println("Aktien von                : "
					+ depotVerwaltung[i].getAktienName());
			System.out.println("Stueckzahl                : "
					+ depotVerwaltung[i].getAktienStueckzahl());
			System.out.println("Kennung                   : "
					+ depotVerwaltung[i].getAktienKennung());
			System.out.println("Aktueller Kurs            : "
					+ depotVerwaltung[i].getAktienKurs());
			System.out.println("Aktueller Wert des Depots : "
					+ depotVerwaltung[i].getAktienWert() + " Euro");
			System.out.println("Aktuelles Vermoegen       : "
					+ depotVerwaltung[i].getVermoegen() + " Euro");
			System.out.println("");
			System.out.println("");

			// Ankauf von Aktien!

			depotVerwaltung[i].AktienAnkauf(100);

			System.out.println("nach ankauf");
			System.out.println("------------");
			System.out.println("Aktien von                : "
					+ depotVerwaltung[i].getAktienName());
			System.out.println("Stueckzahl                : "
					+ depotVerwaltung[i].getAktienStueckzahl());
			System.out.println("Kennung                   : "
					+ depotVerwaltung[i].getAktienKennung());
			System.out.println("Aktueller Kurs            : "
					+ depotVerwaltung[i].getAktienKurs());
			System.out.println("Aktueller Wert des Depots : "
					+ depotVerwaltung[i].getAktienWert() + " Euro");
			System.out.println("Aktuelles Vermoegen       : "
					+ depotVerwaltung[i].getVermoegen() + " Euro");

			i++;
			h++;

		}

		// DEPOTGEBUEHREN MIT ARRAY!

		// double[] arr1 = new double[10];

		while (depotanzahl > 0) {
			depotVerwaltung[f].calcualte();
			System.out.println("");
			System.out.println("");
			System.out.println("Depot " + g + " Gebuehren : "
					+ depotVerwaltung[f].getGebuehr());
			f++;
			g++;
			depotanzahl--;

		} // end of while

	}

}