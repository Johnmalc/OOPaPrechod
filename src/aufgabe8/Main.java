package aufgabe8;

import java.util.Scanner;

public class Main {

	/**
	 * @author johnmalc 
	 * 
	 *         Aufgabe 8 : Erweitern Sie die Programme für Aktien zu einer
	 *         Depotverwaltung: Es soll nun neben normalen Aktien auch
	 *         Aktienfonds und Rentenfonds geben. Legen Sie für diese eine
	 *         gemeinsamen Superklasse an, in der alle gemeinsamen Daten und
	 *         Methoden zusammengefasst sind.
	 * 
	 *         Die Kennung soll im Konstruktor automatisch eindeutig vergeben
	 *         werden.
	 * 
	 *         Für die Wertpapiere sollen Depotgebühren berechnet werden.
	 * 
	 *         Der Namen dafür soll in allen Klassen gleich sein, damit die
	 *         Gebühren des Depots in einer einzigen Schleife berechnet werden
	 *         können (mit Array).
	 * 
	 *         Unterschiede der drei vererbten Klassen: Aktien: sechsstellige
	 *         Kennung mit 1 als erster Ziffer Gebühr 0,5% vom Wert Aktienfonds:
	 *         2 als erste Ziffer Gebühr Sockelbetrag 30€, zusätzlich 0,2% vom
	 *         Wert Rentenfonds: 3 als erste Ziffer Gebühr 0,05% pro Stück Alle
	 *         Gebühren sollen änderbar sein.
	 * 
	 * 
	 * 
	 */

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Create array of 4 shares - aktien.java In case both are in comments
		 * nothing will happen
		 */
		// Aktien[] shares = new Aktien [4];

		System.out.println("wahlen sie ihre veraltung");
		int vyber = new Scanner(System.in).nextInt();
		switch (vyber) {

		case 100_000:

			/*
			 * Object for Microsoft
			 */
			System.out.println("Sie habe AktienProgramm gewalt");

			System.out.println("Wie viel aktien haben sie schon ?");
			int r = new Scanner(System.in).nextInt();

			System.out
					.println("Welchen Preis stellen sie ? Nur mit , nich punkt ");
			double b = new Scanner(System.in).nextDouble();

			System.out.println("Wie viel aktien wollen sie kaufen ?");
			int c = new Scanner(System.in).nextInt();

			System.out.println("Wie viel aktien wollen danach sie verkaufen ?");
			int s = new Scanner(System.in).nextInt();

			// 1. price 2. quantity
			Microsoft share2 = new Microsoft(b, c, r);
			System.out.println("Sie haben schon " + r);
			System.out.println("sie kaufen aktien - anzahl " + c);
			System.out.println("Sie kaufen aktien fur " + b);
			System.out.println("Sie verkaufen spater  aktien fur " + s);
			System.out.println();
			System.out.println(share2.toString());
			// "wert insgesamt"
			System.out
					.println("The value of the share is " + share2.getValue());
			System.out.println("Diese einkauf kostet sie zusammen "
					+ share2.berechneGebuhr());
			/*
			 * "Verkaufen und kaufen"
			 */
			System.out.println(share2.setBuy(r));
			System.out.println(share2.setSell(s));
			System.out.println(share2.getSagHallo());

			System.out.println("\n");
			System.out.println("\n");
			System.out.println();
			// uzavira 1. case
			break;
		case 200_000:

			/*
			 * Object for My Hedge Fund (Aktien-Menge)
			 */
			System.out.println("Sie habe Hedge Fond Programm gewalt");

			System.out
					.println("Welchen Kapital besitzt ihres HedgeFond auf der Borse");
			double kapital = new Scanner(System.in).nextDouble();

			System.out
					.println("Welchen Wert (Start-value) haben die aktien des Hedgefonds");
			double zakladovka = new Scanner(System.in).nextDouble();

			System.out
					.println("Wie viel aktien des Hedgefonds wollen sie kaufen(nimmt eingabe * zakladovka)");
			double aktienAnzahl = new Scanner(System.in).nextDouble();

			Aktienfond_Menge aktienf = new Aktienfond_Menge(kapital,
					zakladovka, aktienAnzahl);
			System.out.println("Den jauf wir sie " + aktienf.berechneGebuhr()
					+ " zusammen kosten");
			System.out.println("Welchen wert besitzen hedgefond auf der borse "
					+ aktienf.getValue());
			System.out.println(aktienf.getDefferenz());

			break;
		case 300_000:
			System.out.println("Wie viele aktien besitzt Rentefond");
			int quantity = new Scanner(System.in).nextInt();

			System.out.println("Zu welchem Preis wollen sie diese kaufen");
			double price = new Scanner(System.in).nextDouble();
			
			System.out.println("Wie viel aktien wollen sie kaufen ?");
			int kauf = new Scanner(System.in).nextInt();

			System.out
					.println("Wie viele aktien wollen sie spater danach verkaufen");
			int verkauf = new Scanner(System.in).nextInt();

			Rentefonds rfonds = new Rentefonds(quantity, price, verkauf);
			System.out.println("Wert der Aktien die sie gekauft haben ist "
					+ rfonds.getValue());

			System.out.println(rfonds.setBuy(kauf));
			System.out.println(rfonds.setSell(verkauf));
			System.out.println(rfonds.berechneGebuhr());


			break;
		default:
			System.out
					.println("Sie mussen entweder: 100000, oder 200000 oder 300000 eingeben ");

			/*
			 * If in comments it will print Error These lines print either
			 * Fehler in case 131-136 are in comments or nothing in case
			 * everything is in comments If not then the last share will be
			 * printed 4 times (here Volskwagen)
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
}
