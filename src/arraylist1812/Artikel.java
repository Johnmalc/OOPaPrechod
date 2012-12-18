package arraylist1812;

public abstract class Artikel implements Inte {
	
	String name;
	double preis;
	int menge;

	public Artikel(String name, double preis, int menge) {
		this.menge = menge;
		this.name = name;
		this.preis = preis;
	}
	public abstract String toString();
	
	public abstract double getBerechnung ();
	
}
