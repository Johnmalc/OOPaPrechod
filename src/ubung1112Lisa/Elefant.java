package ubung1112Lisa;

public class Elefant extends Saeugetier {
	double rlaenge;

	public Elefant() {

	}

	public Elefant(String namex, int alterx, double gewichtx, double rlaengex) {
		super(namex, alterx, gewichtx);

		rlaenge = rlaengex;
	}

	public double getLaenge() {
		return rlaenge;
	}
} // end of class Elefant
