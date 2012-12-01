package aufgabe7;

import java.util.Scanner;

public class Main {

	/**
	 * @author johnmalc and Heiko 
	 * Schreiben Sie ein Klasse zur Verwaltung von
	 *         Aktien: Ein Aktieneintrag hat Stückzahl, Kurs, Name, Kennung
	 *          Als
	 *         Methoden sollen Sie implementieren Konstruktor (nur Name und
	 *         Kennung), kaufen (Stückzahl) verkaufen (dto) Kurs setzen
	 *         aktuellen Wert ausgeben Inhalt als String zurückgeben
	 * 
	 *         Schreiben Sie auch ein Testprogramm, in dem einige Aktien
	 *         angelegt, Aktien an- und verkauft (als Aufruf von Methoden) und
	 *         immer wieder der Wert des Depots angezeigt wird.
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Create array of 4 shares - aktien.java In case both are in comments
		 * nothing will happen
		 */
		// Aktien[] shares = new Aktien [4];

		/*
		 * Object for GS Print Wert from method Get Value
		 */

		System.out.println("Welchen Preis stellen sie ? Nur mit , nich punkt ");
		System.out.println("Wie viel aktien wollen sie kaufen ?");
		double a = new Scanner(System.in).nextDouble();
		int d = new Scanner(System.in).nextInt();

		// 1. price 2. quantity
		GoldmanSachs share = new GoldmanSachs(a, d);
		System.out.println(share.toStringNon());
		// "wert insgesamt"
		System.out.println(share.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share.setBuy(50));
		System.out.println(share.setSell(20));
		System.out.println(share.getSagHallo());

		System.out.println("\n");
		System.out.println("\n");

		/*
		 * Object for Microsoft
		 */

		System.out.println("Welchen Preis stellen sie ? Nur mit , nich punkt ");
		System.out.println("Wie viel aktien wollen sie kaufen ?");

		double b = new Scanner(System.in).nextDouble();
		int c = new Scanner(System.in).nextInt();

		// 1. price 2. quantity
		Microsoft share2 = new Microsoft(b, c);
		System.out.println(share2.toStringNon());
		// "wert insgesamt"
		System.out.println(share2.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share2.setBuy(50));
		System.out.println(share2.setSell(20));
		System.out.println(share2.getSagHallo());

		System.out.println("\n");
		System.out.println("\n");

		/*
		 * Object for Google
		 */

		System.out.println("Welchen Preis stellen sie ? Nur mit , nich punkt ");
		System.out.println("Wie viel aktien wollen sie kaufen ?");

		double e = new Scanner(System.in).nextDouble();
		int r = new Scanner(System.in).nextInt();

		// 1. price 2. quantity
		Google share3 = new Google(e, r);
		System.out.println(share3.toStringNon());
		// "wert insgesamt"
		System.out.println(share3.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share3.setBuy(50));
		System.out.println(share3.setSell(20));
		System.out.println(share3.getSagHallo());

		System.out.println("\n");
		System.out.println("\n");

		/*
		 * Object for Volkswagen
		 */

		System.out.println("Welchen Preis stellen sie ? Nur mit , nich punkt ");
		System.out.println("Wie viel aktien wollen sie kaufen ?");

		double q = new Scanner(System.in).nextDouble();
		int w = new Scanner(System.in).nextInt();

		// 1. price 2. quantity
		Volkswagen share4 = new Volkswagen(q, w);
		System.out.println(share4.toStringNon());
		// "wert insgesamt"
		System.out.println(share4.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share4.setBuy(50));
		System.out.println(share4.setSell(20));
		System.out.println(share4.getSagHallo());

		/*
		 * If in comments it will print Error These lines print either Fehler in
		 * case 131-136 are in comments or nothing in case everything is in
		 * comments If not then the last share will be printed 4 times (here
		 * Volskwagen)
		 */
		// for (int i = 0; i<4; i++) {
		// shares[i] = new Google(e,r);
		// shares[i] = new GoldmanSachs(a,d);
		// shares[i] = new Microsoft(b,c);
		// shares[i] = new Volkswagen(a,d);
		// }
		// for (int i = 0; i < shares.length; i++) {
		// if(shares[i] == null) {
		// System.out.println("Fehler");
		// }else {
		// System.out.println(shares[i].getSagHallo());
		// }
		// }
	}
}
