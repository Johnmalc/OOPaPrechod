package ubung0801Treti;

/**
 * Beschreibung
 * 
 * @version 1.0 vom 08.01.2013
 * @author
 */

public class Schiff {
	Object[] d;
	int zahler;

	public Schiff(int grosse) {
		d = new Object[grosse];
		zahler = 0;

	}

	public void add(Object a) {
		d[zahler] = a;
		zahler++;

	}

	public Baum getBuch() {

		for (int i = 0; i < d.length; i++) {
			if (d[i] instanceof Baum) {
				Baum Bx = (Baum) d[i];
				return Bx;
			}
		} // end of for
		return null;
	}

} // end of class Schiff
