/**
 * 
 */
package aufgabe6;

/**
 * @author Dima
 *
 */
public class Bruch {
	
	/*
	 * Variable 
	 */
	// fur Bruch 1
	public int zahler1;
	public int nenner1;
	
	// Fur Bruch 2
	public int zahler2;
	public int nenner2;
	
	/*	
	 *  Konstruktoren
	 */	
	public Bruch () {
		
	}
	
	/*
	 * Methoden
	 */
	public String getMultiplikation() {
		double ergebnisVonZahler = zahler1 * zahler2;
		double ergebnisVonNenner = nenner1 * nenner2;		
		// double beideErgebinisse =  ergebnisVonZahler / ergebnisVonNenner;
		double a = ergebnisVonZahler /  ergebnisVonNenner;
		System.out.println (ergebnisVonZahler + "/" + ergebnisVonNenner);
		//return ergebnisVonZahler + '/' + ergebnisVonNenner;
		//return (Double) beideErgebinisse;
		//int a = (Integer) null; > vrati null
		return "ergebniss ist  "  + a; // kdyz dopisu "a" tak rovnou ukaze vysledek ale z teto methody
		//return ergebnisVonZahler + '/' + ergebnisVonNenner;
	}
	
	// ukaze rovnou vysledek na dalsi radce
	public double getDoubleZahl() {
		double ergebnisVonZahler = zahler1 * zahler2;
		double ergebnisVonNenner = nenner1 * nenner2;
		double beideErgebinisse =  ergebnisVonZahler / ergebnisVonNenner;
		return beideErgebinisse;
	}
	public String setUnzuZahl1() {
		String a = "Du Idiot, mit NUll kann man nicht teilen";
		return a;
	}
	public String toStringNonApi() {
		return "(" + zahler1 + " " + '/' + " " + nenner1 + ')' ;
	}
	public String toStringNonApi2() {
		return "(" + zahler2 + " " + '/' + " " + nenner2 + ')' ;
	}
}
