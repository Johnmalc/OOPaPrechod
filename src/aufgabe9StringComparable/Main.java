package aufgabe9StringComparable;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * Realisieren Sie ein Programm, das Strings nach Länge sortiert.
	 *  Verwenden
	 * Sie dazu die Methode sort aus java.util. Dieser Methode wird ein Array
	 * übergeben, der Klassenelemente mit der modifizierten Sortierung enthält.
	 * Diese Sortierung erhalten Sie, indem Sie in einer Klasse das Interface
	 * Comparable mit der gewünschten Sortiermethode implementieren (compareTo).
	 * Hinweis: Diese Klasse braucht einen Konstruktor, dem man Strings
	 * übergeben kann, Methoden toString und length werden Sie auch brauchen.
	 * 
	 * Die Methode compareTo hat einen Parametertyp Object, den sie erst mit
	 * type cast in den gewünschten Typ wandeln müssen (geht später mit generics
	 * viel eleganter).
	 *  Diese Klasse sollten Sie dann wie üblich in einer
	 * main-Methode testen. Überlegen Sie sich, ob Sie in main die Strings
	 * interaktiv einlesen wollen.
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Sort[] myArray = new Sort[4];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = new Sort(scan.nextLine());
		}

		Arrays.sort(myArray);

		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}

}
