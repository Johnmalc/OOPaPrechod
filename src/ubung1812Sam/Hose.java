/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1812Sam;

/**
 * 
 * @author petrovd
 */
public class Hose extends Artikel {
	int grose;
	String farbe;

	public Hose(int menge) {
		this.menge = menge;
		this.preis = 66;

	}

	@Override
	public void einkaufen(int menge) {
		this.menge = menge;
	}

	@Override
	public String toString() {
		return "Sie haben Hose fur " + preis + " gekauft. Anzahl : " + menge;
	}

	@Override
	public double bezahlen(int menge) {
		double summe = menge * preis;
		return summe;
	}

}
