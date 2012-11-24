package aufgabe7;

public abstract class Aktien {
	/*
	 * This is "Wert". This is the only method which is going to be inharitated
	 */
	public abstract String getValue();
	/*
	 * These method would be same for all instances but hardcoded
	 */
	public abstract String setSell(int quantity);
	public abstract String setBuy(int quantity);
	/*
	 * (non-Javadoc)
	 * For each new share you have a new toString method
	 * For printing of name, identifier, quantity, price together
	 */
	public abstract String toStringNon();
	/*
	 * For array of shares.
	 * It says hallo to you.
	 */
	public abstract String getSagHallo();
	
	
}
