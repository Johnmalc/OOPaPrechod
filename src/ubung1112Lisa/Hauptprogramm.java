package ubung1112Lisa;

public class Hauptprogramm {
	public static void main(String[] args) {
		int zufall;
		Kaefig K1 = new Kaefig();
		Kaefig K2 = new Kaefig();

		zufall = (int) ((Math.random() * 2) + 1);

		if (zufall == 1) {
			Gepard G1 = new Gepard();
			K1.addTier(G1);
		} // end of if
		else {
			Elefant E1 = new Elefant();
			K1.addTier(E1);
		} // end of if-else

		Gepard G1 = K1.getGepard();
		if (G1 != null) {
			K2.addTier(G1);
		} // end of if
	} // end of main

} // end of class Hauptprogramm
