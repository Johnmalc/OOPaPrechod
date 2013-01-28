package aufgabe6VonIhm;

public class bruchProgramm {
	public static void main(String[] args) {

		bdaruch bruchEins = new bdaruch();
		bruchEins.setZaehlerkommaNenner(2, 3);

		bdaruch bruchZwei = new bdaruch();
		bruchZwei.setZaehlerkommaNenner(3, 4);

		// 1.Bruch Ausgabe!
		System.out.println("1.Bruch");
		System.out.println("");
		System.out.println(bruchEins.getZaehler());
		System.out.println("-");
		System.out.println(bruchEins.getNenner());
		System.out.println("");

		// 2.Bruch Ausgabe!
		System.out.println("2.Bruch");
		System.out.println("");
		System.out.println(bruchZwei.getZaehler());
		System.out.println("-");
		System.out.println(bruchZwei.getNenner());
		System.out.println("");
		System.out.println("");

		// Multiplikation!
		System.out.println("Multipliziert");
		System.out.println("");
		bruchEins.multiply(3, 4);
		System.out.println(bruchEins.getZaehler());
		System.out.println("--");
		System.out.println(bruchEins.getNenner());
		System.out.println("");

		// Bruch als Double!
		System.out.println("Bruch als Double");
		System.out.println("");
		System.out.println(bruchEins.getZaehler());
		System.out.println("--      = " + bruchEins.bruchZuDezimal());
		System.out.println(bruchEins.getNenner());
		System.out.println("");

		// Bruch als String mit der Form (3/8)!
		System.out.println("Bruch als String");
		System.out.println("");
		System.out.println(bruchEins.toString());

	}

}
