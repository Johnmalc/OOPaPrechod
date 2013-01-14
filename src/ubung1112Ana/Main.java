package ubung1112Ana;
import java.util.*;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 16.12.2012
 * @author
 */

public class Main {

	public static void main(String[] args) {

		Kaefig K1 = new Kaefig();
		Kaefig K2 = new Kaefig();
		Random ra = new Random();
		for (int i = 0; i < 3; i++) {
			
			int zufall = ra.nextInt(6);
			if (zufall == 1) {
				Gepard G1 = new Gepard(1, "Gepardik", true);
				K1.addTier(G1);
			} // end of if
			else if (zufall == 2) {
				Elefant E1 = new Elefant(2, "Elefantik", true);
				K1.addTier(E1);
			} // end of if-else
		} // end of for

		// K2.addTier(K1.getGepard());
		Gepard G1 = (Gepard) K1.getGepard();
		if (G1 != null) {
			K2.addTier(G1);
		} // end of if
		System.out.println("K1");
		K1.Scanner();
		System.out.println("K2");
		K2.Scanner();

	} // end of main

} // end of class Main
