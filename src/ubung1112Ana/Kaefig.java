package ubung1112Ana;

public class Kaefig {
	int zaehler;
	Saeugetier[] kaefig;

	public Kaefig() {
		kaefig = new Saeugetier[10];
		zaehler = 0;
	}

	public void addTier(Saeugetier T1) {
		if (zaehler < kaefig.length) {
			for (int i = 0; i < kaefig.length; i++) {
				if (kaefig[i] == null) {
					kaefig[i] = T1;
					zaehler++;
					i = kaefig.length;
				} // end of if
			} // end of for
		} // end of if
		else {
			System.out.println("Kaefig ist voll!");
		} // end of if-else
	}

	public void Scanner() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Gepard) {
				((Gepard) kaefig[i]).beissen();
				System.out.println("Das ist ein Gepard!");
			} // end of if
			else if (kaefig[i] instanceof Elefant) {
				((Elefant) kaefig[i]).Schauen();
				System.out.println("Das ist ein Elefant!");
			} // end of if-else

		} // end of for
	}

	public Gepard getGepard() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Gepard) {
				zaehler = zaehler - 1;
				Saeugetier[] kaefig2 = new Saeugetier[1];
				kaefig2[0] = kaefig[i];
				kaefig[i] = null;
				return (Gepard) kaefig2[0];
			} // end of if
		} // end of for

		return null;
	}

	public Elefant getElefant() {
		for (int i = 0; i < kaefig.length; i++) {
			if (kaefig[i] instanceof Gepard) {
				zaehler = zaehler - 1;
				Saeugetier[] kaefig2 = new Saeugetier[1];
				kaefig2[0] = kaefig[i];
				kaefig[i] = null;
				return (Elefant) kaefig2[0];
			} // end of if
		} // end of for

		return null;
	}

}