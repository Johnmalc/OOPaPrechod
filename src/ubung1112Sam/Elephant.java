package ubung1112Sam;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 11.12.2012
 * @author
 */

public class Elephant extends Saugetrier {

	public boolean kussen;

	public Elephant(String name, int beine) {
		super(name, beine);
		this.kussen = false;
	}

	// Anfang Methoden
	public void getKussen() {
		// false 
		System.out.println(kussen);
	}

	public void setKussen(boolean kussen) {
		this.kussen = kussen;
	}

	public void setBeine(int beine) {
		this.beine = beine;
	}

	public int getBeine() {
		return beine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
