package ubung2711.SOstatnimi;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 27.11.2012
 * @author
 */

public class Berechnung {
	public static double kosten(int passagieranzahl, double treibstoff,
			double treibstoffperson, int andockgebuhr) {
		double kosten = ((passagieranzahl * treibstoff * treibstoffperson * 1)
				+ (passagieranzahl * treibstoff * treibstoffperson * 0.8) + (2 * andockgebuhr));
		return kosten;
	}

	public static double gewinn(double ticketkosten, int passigieranzahl) {
		double gewinn = ticketkosten * passigieranzahl + ticketkosten
				* (passigieranzahl * 0.8);
		return gewinn;
	}

} // end of class Berechnung
