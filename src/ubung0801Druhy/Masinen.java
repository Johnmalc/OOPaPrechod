package ubung0801Druhy;

public class Masinen extends Anlage {

	public Masinen() {
	
	}
	public Kase produziereKase() {
		Kase k1 = new Kase();
		return k1;
	}

	public Wurst produziereWurst() {
		Wurst w1 = new Wurst();
		return w1;
	}

}
