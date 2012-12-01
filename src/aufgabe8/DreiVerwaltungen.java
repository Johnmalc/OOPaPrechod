package aufgabe8;

public abstract class DreiVerwaltungen {
	/*
	 * Gebuhren fur alle 3 dinge
	 */
	// Rentenfonds TODO
	public double RentenfondsGebruh = 0.05;
	// Aktienfonds -...._menge
	public int AktienfondsGebuhr = 30;
	public double AktienfondsGebuhr2 = 0.2;
	// Aktien -- microsoft
	public double AktienGebuhr = 0.5;
	
	public String name;
	public String kennnung;
	

	/*
	 * This is "Wert". This is the only method which is going to be inharitated
	 */
	public abstract double getValue();

	/*
	 * These method would be same for all instances but hardcoded
	 * Only for Aktien-Microsoft
	 */
	public abstract String setSell(int quantity);
	public abstract String setBuy(int quantity);

	public abstract double berechneGebuhr();
	/*
	 * return zakladovka * anzahl aktien bei AktienfondMenge
	 */
	public abstract double setBuyHedgefond(int zakladovka);

	/*
	 * (non-Javadoc) For each new share you have a new toString method For
	 * printing of name, identifier, quantity, price together
	 * Applies for all of them
	 */
	public abstract String toString();

	/*
	 * For array of shares. It says hallo to you.
	 * Applies for all of them
	 */
	public abstract String getSagHallo();

}
