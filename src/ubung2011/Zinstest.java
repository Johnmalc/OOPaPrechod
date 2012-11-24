package ubung2011;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 20.11.2012
 * @author
 */

public class Zinstest {
	public static double startkapital(double kapital, double zinssatz,
			int laufzeit) {
		if (laufzeit > 0) {
			double zinsen = kapital * (zinssatz / 100);
			kapital = kapital + zinsen;
			laufzeit--;

			kapital = startkapital(kapital, zinssatz, laufzeit);
		} // end of if
		return kapital;
	}

	public static void main(String[] args) {
		double kapital = 10000;
		double zinssatz = 2;
		int laufzeit = 10;

		double endkapital = startkapital(kapital, zinssatz, laufzeit);
		System.out.println(endkapital);
	} // end of main
} // end of class Zinstest
