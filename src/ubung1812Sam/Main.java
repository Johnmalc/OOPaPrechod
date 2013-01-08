/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1812Sam;

import java.util.*;

/**
 * 
 * @author petrovd
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 * @param bezahlen 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Artikel wa = new Artikel [2];

		int a = 0;
		int bezahlen = 0;
		while (a != 99) {

			System.out.println("Einkaufen - 1");
			System.out.println("Anzeigen - 2");
			System.out.println("Bezahlen - 3");

			int zahl = scan.nextInt();
			// erste Wahl - user wahlt 1
			switch (zahl) {
			case 1:
				System.out.println("Sie werden jetzt einkaufen");
				System.out.println("");
				System.out.println("Was wollen sie einkaufen");
				System.out.println("");
				System.out.println("Clissa - 1");
				System.out.println("Timpa - 2");
				System.out.println("Michigan - 3");

				int zahl2 = scan.nextInt();
				// 2. wahl innerhalb den ersten - user entscheidet sich fur 3
				// verschiedene Produkte
				switch (zahl2) {
				case 1:
					System.out.println("-------------");
					System.out.println("Geben Sie ihre Menge bitte.");
					int ihreMenge = scan.nextInt();
					Hose h = new Hose(ihreMenge);
					System.out.println(h.bezahlen(ihreMenge));
					System.out.println(h.toString());
					bezahlen = ihreMenge+bezahlen;
					break;
				case 2:
					System.out.println("-------------");
					System.out.println("Geben Sie ihre Menge bitte.");
					int ihreMenge2 = scan.nextInt();
					Top ha = new Top(ihreMenge2);
					System.out.println(ha.bezahlen(ihreMenge2));
					System.out.println(ha.toString());
					bezahlen = ihreMenge2+bezahlen;

					break;
				case 3:
					System.out.println("-------------");
					System.out.println("Geben Sie ihre Menge bitte.");
					int ihreMenge3 = scan.nextInt();
					Hose hsa = new Hose(ihreMenge3);
					System.out.println(hsa.bezahlen(1));
					System.out.println(hsa.toString());
					bezahlen = ihreMenge3+bezahlen;

					break;
				default:
					System.out.println("Eoror");
				}

				break;
			case 2:
				System.out.println("Zeigt, was sie im Warenkorb haben");
				Warenkorb wa = new Warenkorb();
				System.out.println("Wie viel haben sie gekauft ? Geben sie die gleiche zahl !!!");
				// eingabe die gleich zahl
				int ihreMenge4 = scan.nextInt();
				wa.add(new Hose (ihreMenge4));
				// toString aus der Warenkorb
				System.out.println(wa.toString());
				break;
			case 3:
				System.out.println("Zahlen Sie jetzt bitte"+ bezahlen);
				break;
			default:
				System.out.println("Error");
				break;
			}
		}
	}
}
