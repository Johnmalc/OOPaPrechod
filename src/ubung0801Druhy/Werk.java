package ubung0801Druhy;

public class Werk {
	public Werk() {

	}

	public void add(Anlage a) {
		@SuppressWarnings("unused")
		Anlage d1 = new Anlage();
		d1 = a;
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
