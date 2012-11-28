package ubung2711Sam;

public class Berechnung {

	public double getKosten(int cenaPristani, int anzahlPersonen, int crewPreis, int CenaPaliva, int CenaProPerson ) {
		double ko = (cenaPristani*2 + crewPreis * 2) // cesta tam a zpet
				+ (anzahlPersonen * CenaPaliva * CenaProPerson)
				+ (anzahlPersonen * 0.8 * CenaPaliva * CenaProPerson);
		return ko;
	}
	public double getGewinn(int ticketPreis, int anzahlPersonen) {
		double ge = (ticketPreis*anzahlPersonen) + 0.8*(ticketPreis*anzahlPersonen);
		return ge;
	}

}
