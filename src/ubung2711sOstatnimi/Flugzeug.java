package ubung2711sOstatnimi;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 27.11.2012
 * @author
 */

public class Flugzeug {

	private int kosten;
	private int panzahl;
	private double treibstoff;
	private double kosten_pro_liter;
	private double ticket;
	private double crew;
	private int andock;

	public Flugzeug(int kost, int anzahl, double treibpropass) {
		kosten = kost;
		panzahl = anzahl;
		treibstoff = treibpropass;
		kosten_pro_liter = 9.33;
		ticket = 265;
		crew = 8890;
		andock = 499;
	}

	public void setkosten(int kost) {
		kosten = kost;
	}

	public void setpanzahl(int anzahl) {
		panzahl = anzahl;
	}

	public void settreibstoff(double treib) {
		treibstoff = treib;
	}

	public void setkosten_pro_liter(double kosten) {
		kosten_pro_liter = kosten;
	}

	public void setticket(double tick) {
		ticket = tick;
	}

	public void setcrew(double cre) {
		crew = cre;
	}

	public void setandock(int and) {
		andock = and;
	}

	public int getkosten() {
		return kosten;
	}

	public int getpanzahl() {
		return panzahl;
	}

	public double gettreibstoff() {
		return treibstoff;
	}

	public double getkosten_pro_liter() {
		return kosten_pro_liter;
	}

	public double getticket() {
		return ticket;
	}

	public double getcrew() {
		return crew;
	}

	public int getandock() {
		return andock;
	}
} // end of Flugzeug
