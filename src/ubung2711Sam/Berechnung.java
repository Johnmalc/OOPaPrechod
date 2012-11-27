package ubung2711Sam;

public class Berechnung {

	public double kosten(Flugzeug tmp) {
		double ko = (tmp.cenaPristani()*2 + (crewPreis * 2)
				+ (anzahlPersonen * CenaPaliva * CenaProPerson)
				+ (anzahlPersonen * 0.8 * CenaPaliva * CenaProPerson);
		return ko;
	}
	public double gewinn(int ticketPreis, int anzahlPersonen) {
		double ge = ticketPreis*anzahlPersonen;
		return ge;
	}

}
