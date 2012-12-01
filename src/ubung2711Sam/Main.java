package ubung2711Sam;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Fahzeug Spider = new Fahzeug(3000_000,130, 9.66);
		//Fahzeug Mouse = new Fahzeug(-2500_000, 105, 11);

		Mathe SpiderM = new Mathe();
		Mathe MouseM = new Mathe();
		 for (int i = 1; i <= 130; i++) {
		 Fahzeug Mouse = new Fahzeug(2500_000,i, 11);
		
		 System.out.println(i);
		 System.out.println(Mouse.benzinPreis());
		System.out.println(Mouse.crewPreis());
		 System.out.println(Mouse.benzinPreisPerPerson());
		 System.out.println(Mouse.pristaniCena());
		 System.out.println(Mouse.ticket());
		 System.out.println("Spider stoji " + MouseM.kostet(Mouse));
		 System.out
		 .println("Spider by vyhral " + MouseM.gewinn(Mouse));
		 System.out.println("Spider opravdu ziskal "
		 + MouseM.mojeOpravdovaVyhra(Mouse));
		 System.out.println("\n");
		
		 if (MouseM.mojeOpravdovaVyhra(Mouse) > 0) {
		 System.out.println("Es lohna");
		 }else {
		 System.out.println("Es lohna  nicht");
		 }

		// for(int anzahlfluge=0; MouseM.mojeOpravdovaVyhra(Mouse)
		// <=0;anzahlfluge++){
		// double a = MouseM.gewinn(Mouse)+MouseM.kostet(Mouse);
		// System.out.println(a);
		//
		// }

		 }

		// for (int anzahlfluge = 0; Mouse.letadlo() <= 0; anzahlfluge++) {
		// Mouse.letadlo(Mouse.letadlo) + MouseM.kostet(Mouse);
		// System.out.println(anzahlfluge);
		//
		// }
		// System.out.println(Mouse.benzinPreis());
		// System.out.println(Mouse.crewPreis());
		// System.out.println(Mouse.benzinPreisPerPerson());
		// System.out.println(Mouse.pristaniCena());
		// System.out.println(Mouse.ticket());
		// System.out.println("Mouse stoji " + MouseM.kostet(Mouse));
		// System.out.println("Mouse by vyhral " + MouseM.gewinn(Mouse));
		// System.out.println("Mouse opravdu ziskal " +
		// MouseM.mojeOpravdovaVyhra());
	}

}
