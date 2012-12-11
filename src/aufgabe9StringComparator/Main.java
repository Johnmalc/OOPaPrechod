package aufgabe9StringComparator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @see http
	 *      ://www.javamex.com/tutorials/collections/sorting_comparator_example
	 *      .shtml
	 * 
	 *      Realisieren Sie ein Programm, das Strings nach Länge sortiert.
	 *      Verwenden Sie dazu die Methode sort aus java.util. Dieser Methode
	 *      wird ein Array übergeben, der Klassenelemente mit der modifizierten
	 *      Sortierung enthält. Diese Sortierung erhalten Sie, indem Sie in
	 *      einer Klasse das Interface Comparable mit der gewünschten
	 *      Sortiermethode implementieren (compareTo). Hinweis: Diese Klasse
	 *      braucht einen Konstruktor, dem man Strings übergeben kann, Methoden
	 *      toString und length werden Sie auch brauchen. Die Methode compareTo
	 *      hat einen Parametertyp Object, den sie erst mit type cast in den
	 *      gewünschten Typ wandeln müssen (geht später mit generics viel
	 *      eleganter). Diese Klasse sollten Sie dann wie üblich in einer
	 *      main-Methode testen. Überlegen Sie sich, ob Sie in main die Strings
	 *      interaktiv einlesen wollen.
	 * 
	 * 
	 * 
	 *      a negative number if our object comes before the one passed in; a
	 *      positive number if our object comes after the one passed in;
	 *      otherwise, zero (meaning they're equal in terms of ordering).
	 * 
	 *      a negative number if (and only if) o1 comes before o2; a positive
	 *      number if (and only if) o1 comes after o2; else 0.
	 * 
	 * Note that the magnitude of the number doesn't matter. 
	 * The aim isn't to say "how different" the two objects are, 
	 * just in which direction. So often, we may as well use
	 *  -1 and 1 to mean "before" and "after" respectively. 
	 * 
	 * 
	 * Source : http://www.java-blog-buch.de/d-objekte-sortieren-comparator-und-comparable/
	 * 
	 * negativer Rückgabewert: Der erste Parameter ist untergeordnet
	 *0 als Rückgabewert: Beide Parameter werden gleich eingeordnet
	 *positiver Rückgabewert: Der erste Parameter ist übergeordnet
	 * 
	 * 
	 * Der Unterschied besteht darin, dass ein Comparator nicht von der zu vergleichenden Klasse 
	 * implementiert werden muss. Dadurch können Sie auch einfach Objekte von
	 * Klassen vergleichen, die
	 * Sie nicht selbst geschrieben haben oder verändern dürfen. 
	 * 
	 * Der Vorteil eines Comparators liegt darin, dass das Kriterium, nach welchem sortiert
	 * werden soll, einfach ausgetauscht werden kann.
	 * 
	 * 
	 * This interface defines the method compare which performs pairwise comparison
	 * of the elements and returns -1 if the
	 * element is smaller then the compared element, 0 if it is equal and 1 if it is larger. 
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		try {
		@SuppressWarnings("resource")
		Scanner slovaInter = new Scanner(System.in);
		System.out.println("Geben sie das Word");
		String slovoInter1 = slovaInter.nextLine();
		System.out.println("Geben sie das Word");
		String slovoInter2 = slovaInter.nextLine();
		System.out.println("Geben sie das Word");
		String slovoInter3 = slovaInter.nextLine();
		
		String slovaArray[] = { slovoInter1, slovoInter2, slovoInter3 };
		
		Arrays.sort(slovaArray, new Sort());
		for (int i = 0; i < slovaArray.length; i++) {
			System.out.println(slovaArray[i]);
		}
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}catch (ClassCastException d) {
			System.out.println(d.getMessage());
		}

}
	}
