package ubung0801Ctvrty;

public class Main extends Schiff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		In ar = new Schiff();
		for (int i = 0; i < 20; i++) {
			ar.addBuch();
		}
		ar.addKatze();
		// method chaining
		ar.addBuch().addKatze().notify();
		ar.addKatze().printlnad("dksfj");
		
	}

}
