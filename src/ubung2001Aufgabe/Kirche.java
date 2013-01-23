package ubung2001Aufgabe;

public class Kirche extends Gebaude implements Unterhaltend {

	private int anzahlBereistuhle;
	private int verfugbarerMesswein; 
	
	public Kirche (int anzahlBereistuhle, int verfugbarerMesswein){
		this.anzahlBereistuhle = anzahlBereistuhle;
		this.verfugbarerMesswein = verfugbarerMesswein;
	}
	
	@Override
	public int unterhaltungswer() {
		double a = anzahlBereistuhle + verfugbarerMesswein * 0.12;
		return (int) a;
	}
	

}
