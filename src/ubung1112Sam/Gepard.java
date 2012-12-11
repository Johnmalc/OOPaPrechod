package ubung1112Sam;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 11.12.2012
 * @author
 */

public class Gepard extends Saugetrier {
	public boolean beissen;

	public Gepard(String name, int beine) {
		super(name, beine);
		this.beissen = false;
	}

	// Anfang Methoden
	public boolean getBeissen() {
		return beissen;
	}

	public void setBeissen(boolean beissen) {
		this.beissen = beissen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBeine() {
		return beine;
	}

	public void setBeine(int beine) {
		this.beine = beine;
	}
} // end of Gepard
