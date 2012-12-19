package arraylist1812;

public class Top extends Artikel{

	public Top(String name, double preis, int menge) {
		super(name, preis, menge);
	}

	@Override
	public String toString() {
		return name + " " + preis + " " + menge;
	}

	@Override
	public double getBerechnung() {
		return preis*menge;
	}

}
