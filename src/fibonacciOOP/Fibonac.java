package fibonacciOOP;

public class Fibonac {
	// variables
	public int meineZahl;

	// konstruktor
	public Fibonac() {
		
	}
	/* * @author Meine Methoden (instanz/object)
	 */
	
	// methods

	// set number
	public void setMeineZahl(int meinZahlX) {
		meineZahl = meinZahlX;
	}

	// get mnou zadane cislo
	public int getMeineZahl() {
		return meineZahl;
	}

	// vypocita novy wert
	// object methodes
	public long pocitejFib() {
		long[] ar = new long[meineZahl + 1];

		ar[0] = 0;
		ar[1] = 1;

		for (int i = 2; i < ar.length; i++) {
			// projde kazde cislo = fibonacci formula
			ar[i] = ar[i - 1] + ar[i - 2];
		}
		return ar[meineZahl];
	}

}
