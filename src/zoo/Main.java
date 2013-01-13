package zoo;

public class Main {

	/**
	 * @param args
	 */
	public static final int [] ar= {5,4};
	public static void main(String[] args) {
		Bar B1 = new Bar("Haus");
		Vogel B2= new Vogel("Haus");
		Bar B21 = new Bar();

		B1.setName("sdf"); // overwrites the old name with this one
		System.out.println(B1.getName());
		// prints two new objects
		System.out.println(B21.getName());
		System.out.println(B21.sagHallo());
		
		B2.setName("Vdfs");
		System.out.println(B2.getName());
		System.out.println(B2.sagHallo());


		/*
		 * Array mit Objekten
		 */
		// int [] alter = new int [5];
		Bar[] GB = new Bar[5];
		// alter[1] = 4;
		// vypise cislo 4 na pozici 1
		// System.out.println(Arrays.toString(alter));

		Bar B3 = new Bar("susi");
		Bar B4 = new Bar("dog");
		Bar B5 = new Bar("cat");
		Bar B6 = new Bar("pudl");
		Bar B7 = new Bar("kolibrik");
		GB[0] = B3; // z principu jakakoliv pozice mozna
		GB[1] = B4;
		GB[2] = B5;
		GB[3] = B6;
		GB[4] = B7;
		for (int i = 0; i < 5; i++) {
			GB[i] = new Bar("Damy ");
			//GB[i] = new Bar("Vogel");
			//System.out.println(B3.getName());
		}

		Bar Ba = GB[1];

		for (int i = 0; i < GB.length; i++) {
			if (GB[i] == null) {
				System.out.println("Fheler");
			} else {
				GB[i].sagHallo();
				System.out.println(GB[i].toStringN());

			}
		}
	}
}
