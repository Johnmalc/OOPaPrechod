/**
 * 
 */
package aufgabe6;
/**
 * @author Johnmalc Aufgabe 6 : 
 * 		   Teilaufgabe 1 : zahler und nenner spreichern
 *         Teilaufgabe 2 : Konstruktor erzeugen; 
 *         Test ob beide Bruch als bruch erzeugt, 3 und 8
 *         Teilaufgabe 3 : To string methode 
 *         
 *         Multiplizieren :
 *         		- (Zahler 1 * zahler 2 ) / (nenner1 * nenner2)
 *				- return ergebnis als Bruch und als dezimzahl
 *        
 *         Entwerfen Sie eine Klasse Bruch, bei der Sie Zähler und Nenner
 *         getrennt speichern. 
 *         Implementieren Sie eine Methoden zum Multiplizieren von 
 *         zwei Brüchen, diese sollen wieder einen Bruch liefern. 
 *         
 *         Des weiteren eine Methode, die den Wert des Bruches als double liefert. 
 *         
 *         Schreiben Sie setter-Methoden, die u.a. unzulässige Werte für 
 *         den Nenner verhindern. 
 *         Schreiben Sie auch eine Methode, die eine Instanz von Bruch als String 
 *         in der Form: "(3 / 8)" ausgibt.
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bruch zeigBruch = new Bruch();
		zeigBruch.zahler1 = 4;
		zeigBruch.nenner1 = 0;
		zeigBruch.zahler2 = 5;
		zeigBruch.nenner2 = 0;
		
		// ukaze bruchy obou trid
		System.out.println(zeigBruch.toStringNonApi());
		System.out.println(zeigBruch.toStringNonApi2());
		
		// ukaze decimal zahl ergebniss
		System.out.println(zeigBruch.getMultiplikation());
		
		// als decimal Zahl 
		System.out.println(zeigBruch.getDoubleZahl());
		
		// unzullassige zahlen
		if(zeigBruch.nenner1 == 0) {
			System.out.println(zeigBruch.setUnzuZahl1());

		}
		if(zeigBruch.nenner2 == 0) {
			System.out.println(zeigBruch.setUnzuZahl1());
		}
	}
}
