package ubung2711Sam;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flugzeug Spider = new Flugzeug(3000000,130,9.6);
		Berechnung Spider2 = new Berechnung();
		System.out.println(Spider2.kosten(499, 8990, 130, 9.6, 9.33));
	}

}
