package ubung2711sDenisem;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 27.11.2012
 * @author
 */

public class main {

	public static void main(String[] args) {
		boolean ausgegeben = false;
		int fluege = 0;

		Flugzeug Mouse = new Flugzeug(2500000, 105, 9.6);
		Flugzeug Spider = new Flugzeug(3000000, 130, 9.4);

		for (int i = 1; i <= Mouse.getMax_passagiere(); i++) {
			Mouse.setPassagiere(i);
			if (Berechnung.gewinn(Mouse) > 0 && !ausgegeben) {
				System.out.println("Mouse lohnenswert ab: " + i
						+ " Passagieren");
				ausgegeben = true;
			} // end of if
		} // end of for
		ausgegeben = false;
		
		for (int i = 1; i <= Spider.getMax_passagiere(); i++) {
			Spider.setPassagiere(i);
			if (Berechnung.gewinn(Spider) > 0 && !ausgegeben) {
				System.out.println("Spider lohnenswert ab: " + i
						+ " Passagieren");
				ausgegeben = true;
			} // end of if
		} // end of for

		Mouse.setPassagiere(Mouse.getMax_passagiere());
		while (Mouse.getKosten() <= 0) {
			Mouse.setKosten(Mouse.getKosten() + Berechnung.gewinn(Mouse));
			fluege++;
		} // end of while
		System.out.println("N�tige Fluege f�r Typ Mouse: " + fluege);
		
		fluege = 0;
		Spider.setPassagiere(Spider.getMax_passagiere());
		while (Spider.getKosten() <= 0) {
			Spider.setKosten(Spider.getKosten() + Berechnung.gewinn(Spider));
			fluege++;
		} // end of while
		System.out.println("N�tige Fluege f�r Typ Spider: " + fluege);
	} // end of main

} // end of class main
