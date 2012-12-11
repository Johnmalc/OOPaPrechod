package ubung1112Lisa;
/*
 * u ni je to bez eztends tady 
 */
public class Kaefig {
	Saeugetier[] kaefig;
	int zaehler;

	public Kaefig() {
		kaefig = new Saeugetier[8];
		zaehler = 0;
	}

	public void addTier(Saeugetier T1) {
		if (zaehler < kaefig.length) {
			for (int i = 0; i < kaefig.length; i++) {
				if (kaefig[i] == null) {
					kaefig[i] = T1;
					zaehler++;
				} // end of if
			} // end of for
		} // end of if

		else {
			System.out.println("Kaefig ist voll");
		} // end of if-else
	}

	public void Scanner() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Gepard) {
				((Gepard) kaefig[i]).getPunkte();
				System.out.println("Das ist ein Gepard");
			} // end of if

			else if (kaefig[i] instanceof Elefant) {
				((Elefant) kaefig[i]).getLaenge();
				System.out.println("Das ist ein Elefant");
			}
		} // end of for
	}

	public Gepard getGepard() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Gepard) {
				kaefig[i] = null;
				return (Gepard) kaefig[i];
			} // end of if

		} // end of for
		return null;
	}

	public Elefant getElefant() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Elefant) {
				kaefig[i] = null;
				return (Elefant) kaefig[i];
			} // end of if

		} // end of for
		return null;
	}

} // end of class Kaefig
