package ubung1112Lisa;

public class Gepard extends Saeugetier {
	int punkte;

	public Gepard() {

	}

	public Gepard(String namex, int alterx, double gewichtx, int punktex) {
		super(namex, alterx, gewichtx);
		punkte = punktex;
	}

	public int getPunkte() {
		return punkte;
	}
} // end of class Gepard
