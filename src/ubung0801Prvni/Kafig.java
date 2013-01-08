package ubung0801Prvni;

public class Kafig {
	Hase[] ha;

	public Kafig() {
		ha = new Hase[200];
	}

	public void add(Hase H1) {
		for (int i = 0; i < ha.length; i++) {
			if (ha != null) {
				ha[i] = H1;
			} else {
				System.out.println("error");
			}
		}
	}
}
