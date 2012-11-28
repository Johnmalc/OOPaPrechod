package ubung2711Sam;

public class Flugzeug {

	public int ticketPreis;
	public int cenaPristani;
	public int crewPreis;

	int kosten, anzahlPersonen;
	double CenaPaliva, CenaProPerson;

	// Constructor - does nothing
	public Flugzeug(int kostetX, int anzahlPersonenX, double CenaProPerson ){
		this.kosten = kostetX;
		this.CenaPaliva=9.33;
		this.ticketPreis = 264;
		this.cenaPristani = 499;
		this.crewPreis = 8990;
		this.anzahlPersonen = anzahlPersonenX;
	}

	public void setAnzahlPersonen(int anzahlPersonenX) {
		this.anzahlPersonen = anzahlPersonenX;
	}

	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	public double getCenaPaliva() {
		return CenaPaliva;
	}

	public int crewPreis() {
		return crewPreis;
	}

	public int ticketPreis() {
		return ticketPreis;
	}

	public int cenaPristani() {
		return cenaPristani;
	}
	public double getKosten() {
		return kosten;
	}
}
