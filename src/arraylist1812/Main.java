package arraylist1812;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/**
	 * http://www.javaprogrammingforums.com/java-se-api-tutorials/471-how-use-
	 * arraylist-what-its-advantage-over-array.html
	 */
	public static void main(String[] args) {

		ArrayList<Artikel> ar = new ArrayList<Artikel>();

//		Hose ho;
//		Top to;
//		Top to2;

		// name, preis, menge
		// here to change the values of everything
		Scanner scan = new Scanner(System.in);
		System.out.println("Was sie machen wollen -  1:einkaufen");

		int wahl = scan.nextInt();

		switch (wahl) {

		case 1:
			Hose ho;
			Top to;
			Top to2;
			int wahl2 = scan.nextInt();
			switch (wahl2) {
			case 1:
				ho = new Hose("Michigan", 50, 30);
			case 2:
				to = new Top("Clarisa", 50, 50);
			case 3:
				to2 = new Top("Jorgina", 50, 80);
			}

		case 2:
//			Hose ho;
//			Top to;
//			Top to2;
			// convert array list into object array
			Object[] ol = ar.toArray();

			// Print Object content
			for (int i = 0; i < ol.length; i++) {
				System.out.println(ol[i]);
			}
			// for warenkorb anzeigen.
			//ar.add(ho.);
//			ar.add(to);
//			ar.add(to2);
//
//			System.out.println(ho.getBerechnung() + " " + ho.toString());
//			System.out.println(to.getBerechnung() + " " + to.toString());
//			System.out.println(to2.getBerechnung() + " " + to2.toString());

		}
	}
}
