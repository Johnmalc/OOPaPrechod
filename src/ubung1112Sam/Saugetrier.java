package ubung1112Sam;

/**
 * 
 * Not abstract class, just normal one from which i can inherite
 * 
 * @version 1.0 vom 11.12.2012
 * @author
 */

public class Saugetrier {

	// Anfang Attribute
	public String name;
	public int beine;

	public Saugetrier(String name, int beine) {
		this.name = name;
		this.beine = beine;
	}

	public int getBeine() {
		return beine;
	}

	public void setBeine(int beine) {
		this.beine = beine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

} // end of Superklasse
