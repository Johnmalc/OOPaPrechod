package zoo;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bar B1 = new Bar("Haus");
		Bar B2 = new Bar();

		B1.setName("sdf"); // overwrites the old name with this one
		System.out.println(B1.getName());
		// prints two new objects
		System.out.println(B2.getName());
		System.out.println(B2.sagHallo());

		/*
		 * Array mit Objekten
		 */
		// int [] alter = new int [5];
		Bar[] GB = new Bar[5];
		// alter[1] = 4;
		// vypise cislo 4 na pozici 1
		// System.out.println(Arrays.toString(alter));

		Bar B3 = new Bar("susi");
		GB[2] = B3; // z principu jakakoliv pozice mozna
		for (int i = 0; i < 5; i++) {
			GB[i] = new Bar("haus");
			System.out.println(B3.getName());
		}

		Bar Ba = GB[1];
		// System.out.println(Arrays.toString(GB));

		// GB[1].setName("sdfdsf");
		// System.out.println(Arrays.toString();

		for (int i = 0; i < GB.length; i++) {
			if (GB[i] == null) {
				System.out.println("Fheler");
			} else {
				GB[i].sagHallo();
				// System.out.println(GB[i].toString());
				System.out.println(GB[i].toStringN());

			}
		}
	}

}
