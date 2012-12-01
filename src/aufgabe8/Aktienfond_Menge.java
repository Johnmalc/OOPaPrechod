package aufgabe8;

public class Aktienfond_Menge extends DreiVerwaltungen {

	String name = "My hedge Fund";
	String identifier = "MhF";
	public double kapital;
	public double zakladovka;
	public double aktienAnzahl;
	public double differenz;

	public Aktienfond_Menge(double kapitalX, double zakladovkaX,
			double aktienAnzahl) {
		this.kapital = kapitalX;
		this.zakladovka = zakladovkaX;
	}

	@Override
	public double getValue() {
		double newValue = kapital * zakladovka;
		double newRounded = Math.round(newValue);
		return newRounded;
	}

	@Override
	public String toString() {
		return name + " " + identifier + " " + kapital + "" + zakladovka;
	}

	@Override
	public String getSagHallo() {
		String a = name + " sagt Aufwiedersehen";
		return a;
	}

	@Override
	public double berechneGebuhr() {
		double berechnung = getValue() + (AktienfondsGebuhr2 * getValue())
				+ AktienfondsGebuhr;
		return berechnung;
	}
	@Override
	public double setBuyHedgefond(int zakladovka) {
		double newV = zakladovka * aktienAnzahl;
		return newV;
	}
	public double getDefferenz () {
		double differenz = berechneGebuhr() - getValue();
		return differenz;
	}

	/*
	 * (non-Javadoc)
	 * @see aufgabe8.DreiVerwaltungen#setSell(int)
	 * Not used here
	 */
	@Override
	public String setSell(int quantity) {
		return null;
	}

	@Override
	public String setBuy(int quantity) {
		return null;
	}
	
}
