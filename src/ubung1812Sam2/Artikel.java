/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1812Sam2;

/**
 * 
 * @author petrovd
 */
public abstract class Artikel {
	String bezeichnung;
	int menge;
	int id;
	double preis;

	public abstract void einkaufen(int menge);

	// vielleicht gar nicht notig
	public abstract String toString();

	public abstract double bezahlen(int menge);

}
