package ubung2711Sam;

public class Flugzeug {

	public static int ticketPreis = 264;
	public static int cenaPristani = 499;
	public static int crewPreis = 8890;
	
	int kosten, anzahlPersonen;
	double CenaPaliva, CenaProPerson;
	
	// Constructor - does nothing
	public Flugzeug(int kostenX, int anzahlPersonenX, double CenaPaliva) {
		this.kosten = kostenX;
		this.anzahlPersonen = anzahlPersonenX; 
	}
	
	public void setAnzahlPersonen(int anzahlPersonenX) {
		this.anzahlPersonen = anzahlPersonenX;
	}
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}
	public void setCenaPaliva(double CenaPalivaX) {
		this.CenaPaliva = CenaPalivaX;
	}
	public double getCenaPaliva() {
		return CenaPaliva;
	}
	public int crewPreis(){
		return crewPreis;
	}
	public int ticketPreis() {
		return ticketPreis;
	}
	public int cenaPristani() {
		return cenaPristani;
	}
}
