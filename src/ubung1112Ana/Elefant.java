package ubung1112Ana;

public class Elefant extends Saeugetier {
	boolean huebsch = false;

	public Elefant(int a, String n, boolean h) {
		super(a, n);
		this.huebsch = h;
	}

	public void Schauen() {
		huebsch = true;
	}
}