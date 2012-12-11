package ubung1112Sam;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 11.12.2012
 * @author
 */

public class Main {
	public static void main(String[] args) {
		int anzahl = 8;
		Kaffig[] tiere = new Kaffig[anzahl];
		Kaffig t1 = new Kaffig("Kirstin", 4, 8);

		for (int i = 0; i < 8; i++) {
			int zufall = (int) (Math.random() * 6) + 1;
			//System.out.println(zufall);

			if (zufall == 2 || zufall == 6) {
				Gepard G1 = new Gepard("Jiri", 15);
				t1.addTier(G1);
			} else {
				Elephant E1 = new Elephant("Honza", 12);
				t1.addTier(E1);
			}
		}
		System.out.println(t1.toString());
	}
} // end of Main
