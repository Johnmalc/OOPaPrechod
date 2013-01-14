package ubung0801Prvni;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Kafig ka = new Kafig();
		Kafig ka2 = new Kafig();
		Hase ha = new Hase();
		Katze kr = new Katze();
		for (int i = 1; i <= 199; i++) {
			ka.add(ha);
			ka.addKatze(kr);
			ka.add(ha);

		}
//		ka2.add(ha);
//		for (int i = 1; i <= 30000000; i++) {
//
//			ka.addKatze(kr);
//		}

	}

}
