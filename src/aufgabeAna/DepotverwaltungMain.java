package aufgabeAna;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 01.12.2012
 * @author
 */

public class DepotverwaltungMain {

	public static void main(String[] args) {
		int ANZ_WP = 100;
		double SummeGebuehrenDepots;

		Depotverwaltung ma[];
		ma = new Depotverwaltung[ANZ_WP];
		ma[0] = new AktienN("159987");
		ma[1] = new Rentenfonds("236547");
		ma[2] = new AktienN("125896");
		ma[3] = new Aktienfonds("321654");
		//ma[2].setGebuehr(10.0);

		SummeGebuehrenDepots = 0.0;
		for (int i = 0; i < ma.length; ++i) {
			if (ma[i] == null) {
				// Das ist nur zum filtern Elementen von Arrays, die noch leer
				// sind
			} // end of if
			else {
				SummeGebuehrenDepots += ma[i].DepotgebuehrBerechnen();
				// System.out.println(ma[i].DepotgebuehrBerechnen());
			} // end of if-else

		} // end of for
		System.out.printf("Summe der Gebhren des Depots = " + "%.2f",
				SummeGebuehrenDepots);

	} // end of main

} // end of class DepotverwaltungMain
