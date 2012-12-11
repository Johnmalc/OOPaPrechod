package ubung1112Sam;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 11.12.2012
 * @author
 */

public class Kaffig extends Saugetrier {
	int kapazitat = 0;
	int zahler;
	Saugetrier[] rop = new Saugetrier[kapazitat];

	public Kaffig(String name, int beine, int kapizitat) {
		super(name, beine);
		this.kapazitat = kapizitat;
		zahler = 0;
	}

	// add funkce - je velice potrebna
	public void addTier(Saugetrier temp) {
	if (zahler < rop.length) {
			for (int i = 0; i < kapazitat; i++) {
				if (rop[i] == null) {
					rop[i] = temp;
					zahler++;
				}
			}
		} else {
			System.out.println("Is over kapazity");
		}
	}

	public void getVypise() {
		for (int i = 0; i < rop.length; i++) {
			if (rop[i] instanceof Gepard) {
				System.out.println("DAs");
				((Gepard) rop[i]).getBeissen();
			}
			if (rop[i] instanceof Elephant) {
				((Elephant) rop[i]).getKussen();
			}
		}
	}

	public Gepard getGepart() {
		for (int i = 0; i < rop.length; i++)
			if (rop[i] instanceof Gepard) {
				return (Gepard) rop[i];
			}
		return null;
	}
	public Elephant getElephant() {
		for (int i = 0; i < rop.length; i++)
			if (rop[i] instanceof Elephant) {
				return (Elephant) rop[i];
			}
		return null;
	}
} // end of Kaffig
