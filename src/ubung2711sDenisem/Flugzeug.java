package ubung2711sDenisem;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 27.11.2012
 * @author
 */

public class Flugzeug {

	// Anfang Attribute
	public int passagiere;
	public double kosten;
	private static double treibstoffkosten = 9.33;
	private static double ticketkosten = 264.00;
	private static double crew = 8890;
	private static double docking = 499;
	private double treibstoff_passagier;
	private int max_passagiere;

	// Ende Attribute

	// Anfang Methoden
	public Flugzeug(double kosten, int max_passagiere,
			double treibstoff_passagier) {
		this.kosten = -kosten;
		this.max_passagiere = max_passagiere;
		this.treibstoff_passagier = treibstoff_passagier;

	}

	public int getPassagiere() {
		return passagiere;
	}

	public void setPassagiere(int passagiere) {
		this.passagiere = passagiere;
	}

	public double getTreibstoffkosten() {
		return treibstoffkosten;
	}

	public double getTicketkosten() {
		return ticketkosten;
	}

	public double getCrew() {
		return crew;
	}

	public double getDocking() {
		return docking;
	}

	public double getTreibstoff_passagier() {
		return treibstoff_passagier;
	}

	public int getMax_passagiere() {
		return max_passagiere;
	}

	public double getKosten() {
		return kosten;
	}

	public void setKosten(double kosten) {
		this.kosten = kosten;
	}

	// Ende Methoden
} // end of Flugzeug
