package aufgabe4;

import Prog1Tools.IOTools;

public class aufageb {

	/**
	 * Schreiben Sie ein Programm, das Studentendaten für maximal 10 Studenten
	 * (Name, Vorname, Matr.Nr., Studiengang, Semester, eMail) verwaltet
	 * (ähnlich dem Beispielprogramm für die Adressen). Die Ausgabe von Daten
	 * soll nur gemacht werden, wenn gültige Daten eingegeben wurden. Die
	 * Eingabe bei einem Index, für den bereits Daten vorliegen, soll erst nach
	 * Sicherheitsabfrage erfolgen. Nach der Eingabe von Daten soll sofort die
	 * Ausgabe erfolgen. Es sollen auch die Daten eines Studenten gelöscht
	 * werden können, danach sollen bei diesem Index auch keine Daten mehr
	 * angezeigt werden. Hilfe: Sie brauchen eine Kennung, ob an einer
	 * Indexposition gültige Daten vorliegen. Diese Kennung sollte zu Beginn
	 * initialisiert werden.
	 * 
	 * https://github.com/Johnmalc/PAD/blob/master/5/2%20Klasse%20%28Daten%29/4/
	 * AdressBuch_v1.java
	 * 
	 * 
	 */

	public static class Kontakt {
		String name;
		String vorname;
		String studiengang;
		String email;
		int semester;
		int matrikel;
		boolean besetzung;
	}

	public static void main(String[] args) {
		// arrray
		Kontakt[] kontakten = new Kontakt[10];
		
		// Kontakt kontakten[Speicherposition] = null;
		int Speicherposition;
		int yourChoice = 0;

		// for a menu, a convection
		boolean fertigMitProgramm = false;
		System.out.println("\n");
		
		// repead action after your input
		while (yourChoice != 3) {

			System.out.println("Menu 1  : Eingabe");
			System.out.println("Menu 2  : Schuler Daten bearbeiten (Loschen)");
			System.out.println("Menu 3  : Programm beenden ");

			yourChoice = IOTools.readInt("Your choice for menu, please");

			// choose a number and procced
			switch (yourChoice) {

			// eingabe ausgabe
			case 1:
				System.out.println("");
				Speicherposition = IOTools
						.readInt("Geben Sie die Speicher-Position ein:");
				if ((Speicherposition < 10) && (Speicherposition >= 0)) {
					if (kontakten[Speicherposition] != null) { //abfrage ob besetzt oder nicht
						if (kontakten[Speicherposition].besetzung) {
							String over_write = IOTools
									.readLine("Die Position ist schon besetzt.\n"
											+ "Waehlen Sie Y fuer Ueberschreiben oder N fuer andere Position zu waehlen");
							if (over_write.equals("Y")) {
								System.out
										.println("Geben Sie jetzt ihre daten ein");

								kontakten[Speicherposition].name = IOTools
										.readLine("Name eingeben");
								kontakten[Speicherposition].vorname = IOTools
										.readLine("Vorname eingeben");
								kontakten[Speicherposition].studiengang = IOTools
										.readLine("Studiengang eingeben");
								kontakten[Speicherposition].email = IOTools
										.readLine("Email eingeben");
								kontakten[Speicherposition].semester = IOTools
										.readInt("Semester eingeben");
								kontakten[Speicherposition].matrikel = IOTools
										.readInt("Matrikel Nummer eingeben");
								kontakten[Speicherposition].besetzung = true;

								System.out.println("");
								System.out
										.println(kontakten[Speicherposition].name);
								System.out
										.println(kontakten[Speicherposition].vorname);
								System.out
										.println(kontakten[Speicherposition].studiengang);
								System.out
										.println(kontakten[Speicherposition].semester);
								System.out
										.println(kontakten[Speicherposition].matrikel);
								System.out.println("");
							}
						}
					} else {
						kontakten[Speicherposition] = new Kontakt();
						System.out.println("Geben Sie jetzt ihre daten ein");
						//System.out.println(kontakten[Speicherposition].name);
						kontakten[Speicherposition].name = IOTools
								.readLine("Name eingeben");
						kontakten[Speicherposition].vorname = IOTools
								.readLine("Vorname eingeben");
						kontakten[Speicherposition].studiengang = IOTools
								.readLine("Studiengang eingeben");
						kontakten[Speicherposition].email = IOTools
								.readLine("Email eingeben");
						kontakten[Speicherposition].semester = IOTools
								.readInt("Semester eingeben");
						kontakten[Speicherposition].matrikel = IOTools
								.readInt("Matrikel Nummer eingeben");
						kontakten[Speicherposition].besetzung = true;
						
						// Ausgabe
						System.out.println("");
						System.out.println(kontakten[Speicherposition].name);
						System.out.println(kontakten[Speicherposition].vorname);
						System.out
								.println(kontakten[Speicherposition].studiengang);
						System.out
								.println(kontakten[Speicherposition].semester);
						System.out
								.println(kontakten[Speicherposition].matrikel);
						System.out.println("");
					}
				}

				break;

			// Schuller wechseln = array uberschreiben
			case 2:
				Speicherposition = IOTools
						.readInt("Geben Sie die Speicher-Position zu ueberschreiben ein:");
				if ((Speicherposition < 10) && (Speicherposition >= 0)) {
					System.out.println("Geben Sie jetzt ihre daten ein");
					kontakten[Speicherposition] = new Kontakt();
					kontakten[Speicherposition].name = IOTools
							.readLine("Name eingeben");
					kontakten[Speicherposition].vorname = IOTools
							.readLine("Vorname eingeben");
					kontakten[Speicherposition].studiengang = IOTools
							.readLine("Studiengang eingeben");
					kontakten[Speicherposition].email = IOTools
							.readLine("Email eingeben");
					kontakten[Speicherposition].semester = IOTools
							.readInt("Semester eingeben");
					kontakten[Speicherposition].matrikel = IOTools
							.readInt("Matrikel Nummer eingeben");
					kontakten[Speicherposition].besetzung = true;
					System.out.println("");
					System.out.println(kontakten[Speicherposition].name);
					System.out.println(kontakten[Speicherposition].vorname);
					System.out.println(kontakten[Speicherposition].studiengang);
					System.out.println(kontakten[Speicherposition].semester);
					System.out.println(kontakten[Speicherposition].matrikel);
					System.out.println("");
				}

				// Fertig
			case 3:
				fertigMitProgramm = true;

				break;

			// user's input = error = Fertig
			default:
				System.out
						.println("You cannot write a text (String) or number bigger than "
								+ yourChoice);
			}
		}

	}
}