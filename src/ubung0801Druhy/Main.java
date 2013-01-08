package ubung0801Druhy;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Werk w = new Werk();
		Anlage a = new Anlage();
		Masinen m1 = new Masinen();
		Masinen m2 = new Masinen();
		a.addMasinen(m1);
		a.addMasinen(m2);

		w.add(a);
		Kase k1 = w.produziereKase();
		Wurst k2 = w.produziereWurst();
		
		System.out.println(w.toString());
		System.out.println(a.toString());
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(k1.toString());
		System.out.println(k2.toString());
	}

}
