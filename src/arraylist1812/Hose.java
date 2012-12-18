package arraylist1812;

public class Hose extends Artikel{

	public Hose(String name, double preis, int menge) {
		super(name, preis, menge);
	}
	@Override
	public String toString () {
		return name + " " + preis + " " + menge;
	}
	@Override
	public double getBerechnung() {
		return preis*menge;
	}
	
	
}
