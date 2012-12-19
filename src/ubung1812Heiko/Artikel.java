package ubung1812Heiko;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 18.12.2012
 * @author
 */

public class Artikel {

	protected String name;
	protected double preis;
	protected int menge;

	public Artikel(String NNam, double NPr) {
		name = NNam;
		preis = NPr;
		menge = 0;
	}

	public void kaufen(int meng) {
		menge += meng;
	}

	public String warenkorb() {
		return "Name " + name + " Menge " + menge + " Preis " + (preis * menge);
	}

	public int getMenge() {
		return menge;
	}

	public double getBetrag() {
		return (preis * menge);
	}
} // end of Artikel
