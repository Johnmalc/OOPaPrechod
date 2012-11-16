package Aufgabe4;

import Prog1Tools.IOTools;

public class Aufgabe4VonIhm {

	// Die Adressdaten werden in einer Klasse zusammengefasst
	public static class Student {
		public String name;
		public String vorname;
		public int matrNr;
		public int semester;
		public String studiengang;
		public String mail;
		public String kommentar;
		public boolean valid;
	}

	// das eigentliche Hauptprogramm
	public static void main(String[] args) {
		final int MAX = 10;
		// Benoetigte Variablen
		Student[] studis = new Student[MAX];
		int index = 0;

		// Initialisiere Felder
		for (int i = 0; i < MAX; i++) {
			studis[i] = new Student();
			studis[i].valid = false;
		}

		// Starte das Programm mit einer �berschrift
		System.out.println("===================");
		System.out.println("Studentenverwaltung");
		System.out.println("===================");

		int auswahl = 0;
		Student stu = studis[auswahl];
		// Schleifenbeginn
		while (auswahl != 99) {
			// Menue
			System.out.println(" ");
			System.out.println("1  = Eingabe");
			System.out.println("2  = Anzeigen");
			System.out.println("3  = aktuellen Index wechseln");
			System.out.println("4  = aktuelle Studentendaten loeschen");
			System.out.println("99 = Programm beenden");
			auswahl = IOTools.readInteger("Ihre Wahl: ");
			// Fallunterscheidung
			switch (auswahl) {
			case 1: // eingeben
				int over = 0;
				if (stu.valid) {
					over = IOTools
							.readInteger("Daten vorhanden, ueberschreiben? (ja=1): ");
					if (over != 1)
						break;
				}
				stu.name = IOTools.readLine("Name: ");
				stu.vorname = IOTools.readLine("Vorname: ");
				stu.matrNr = IOTools.readInteger("Matrikelnummer: ");
				stu.semester = IOTools.readInteger("Semester: ");
				stu.studiengang = IOTools.readLine("Studiengang: ");
				stu.mail = IOTools.readLine("E-Mail: ");
				stu.kommentar = IOTools.readLine("Kommentar: ");
				stu.valid = true;
				// kein break, sofort Kontrollausgabe
			case 2: // ausgeben
				if (stu.valid) {
					System.out.println("++++++++++++++ " + index
							+ " ++++++++++++");
					System.out.print(stu.name + ", " + stu.vorname);
					System.out.println("; MatNr. " + stu.matrNr);
					System.out.print(stu.studiengang + "  ");
					System.out.println(stu.semester + ". Semester ");
					System.out.println("E-Mail: " + stu.mail);
					if (stu.kommentar.length() > 0)
						System.out.println("Kommentar: " + stu.kommentar);
				} else
					System.out.println("keine Daten fuer Index " + index + "!");
				break;
			case 3: // Index wechseln
				do {
					index = IOTools.readInteger("Wechsel zu Index "
							+ "(zwischen 0 und 19):");
				} while (index < 0 || index > 19);
				stu = studis[index];
				System.out.println("Daten " + (stu.valid ? "" : "nicht ")
						+ "vorhanden");
				break;
			case 4: // Index "loeschen"
				stu.valid = false;
				System.out.println("Daten zu Index " + index + " geloescht");
				break;
			case 99: // Programm beenden
				break;
			default: // Falsche Zahl eingegeben
				System.out.println("Eingabefehler!");
			}
		} // Schleifenende
	} // Ende des Hauptprogramms
} // Ende des Programms
    
