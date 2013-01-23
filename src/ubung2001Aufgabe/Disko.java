package ubung2001Aufgabe;

public class Disko extends Gebaude implements Unterhaltend {
	private int anzahlPersonen;
	
	
	public Disko (int anzahlPersonen){
		this.anzahlPersonen = anzahlPersonen;
	}
	
	@Override
	public int unterhaltungswer() {
		double f = anzahlPersonen * (int) 0.3;
		return (int) f;
		
	}

}
