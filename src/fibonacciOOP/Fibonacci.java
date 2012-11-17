package fibonacciOOP;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Normalni verze // answer will be answer -1 because of 0
		 * System.out.println(fb(20)); // bude uz ukazavoat spravne
		 * System.out.println(notR(20));
		 */

		// OOP verze
		// Initialising of object
		Fibonac vypocet = new Fibonac();
		// put your number
		vypocet.setMeineZahl(30);

		// vypise me cislo
		System.out.println(vypocet.getMeineZahl());

		// vypise me nove vypocitane cislo
		vypocet.pocitejFib();
		System.out.println(vypocet.pocitejFib());

	}

	// public static long fb(int zahl) {
	// if(zahl == 0 || zahl == 1) {
	// return 0;
	// }
	// if(zahl == 2) {
	// return 1;
	// }
	// return fb(zahl-1) + fb(zahl-2);
	// }
	// public static long notR (int zahl2) {
	// long[] ar = new long [zahl2+1];
	//
	// ar[0] = 0;
	// ar[1] = 1;
	//
	// for(int i = 2; i < ar.length; i++) {
	// // projde kazde cislo
	// ar[i] = ar[i-1] + ar[i-2];
	// }
	// return ar[zahl2];
	// }

}
