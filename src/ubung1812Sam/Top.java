/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1812Sam;

/**
 * 
 * @author petrovd
 */
public class Top extends Artikel {
	String farbe;

	public Top(int menge) {
		this.menge = menge;
		this.preis = 21.6;
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
