package ubung0801Druhy;

public class Anlage {

	public Anlage() {

	}

	public void addMasinen(Masinen m1) {
		Masinen[] ma = new Masinen[2];
		for (int i = 0; i < ma.length; i++) {
			ma[i] = m1;
		}
	}
}
