package malc;
import Prog1Tools.IOTools;


public class Aufgabe4 {

	/**
	 * @param args
	 */
	public static class Daten {
		String name;
		String vorname;
		String studiengang;
		String email;
		int semester;
		int matrikel;
		
		// boolean fur ob die Position besetzt ist oder nicht
		boolean IsTaken;
		
	}
	public static void main(String[] args) {
		Daten[] kontakten = new Daten[10];
		
		// nur fur anfang, seit 2 wirde ich immer etwas eingeben
		int choice = 0;
		
		int position;
		
		// boolen fur exit 
		boolean ProgrammFertig = false;
		
		// wenn 3 while loop will stop, alles andere wird wiederholt
		while(choice != 3) {
			
			System.out.println("-----Menu-----");
			System.out.println("1: Eingabe");
			System.out.println("2: Daten uberschreiben");
			System.out.println("3: Programm beenden");
			
			choice = IOTools.readInt("Ihre Zahl eingeben");

			switch(choice) {
			
			case 1 :
				System.out.println("");
				
				position = IOTools.readInt("Geben sie ihre gewunschte Speicherposition");

				// die Position kann nicht kleiner 10 und >= 0 sein
				if((position < 10) && (position >= 0)) {
					
					// referenziert auf nicht; wenn hier etwas ware, dann uberspringt weiter
					// Must be
					
					if(kontakten[position] != null) {
						
						if(kontakten[position].IsTaken) {
							
							String text = IOTools.readLine("Sind sie sicher, dass sie diese Position uberschreiben mochten ?\n" +
										"Schreiben Sie OK fur JA (uberschreiben) oder NEIN fur andere position zu machen");
							
								if(text.equals("OK")) {
									System.out.println("Ihre Daten bitte jetzt");				

									kontakten[position].name = IOTools.readLine("Ihre Name");
									kontakten[position].vorname = IOTools.readLine("Ihre Vorname");
									kontakten[position].matrikel = IOTools.readInt("Ihres Matrikel-Nummer");
									kontakten[position].studiengang = IOTools.readLine("Ihren Studiengang");
									kontakten[position].email = IOTools.readLine("Ihres Email");
									kontakten[position].semester = IOTools.readInt("Ihres Semester");
									
									// wenn uber "OK" und ist neue Daten eingefugt > dann uberschrieben > besetzt
									kontakten[position].IsTaken = true;
									
									System.out.println(kontakten[position].name);
									System.out.println(kontakten[position].vorname);
									System.out.println(kontakten[position].matrikel);
									System.out.println(kontakten[position].studiengang);
									System.out.println(kontakten[position].email);
									System.out.println(kontakten[position].semester);
									System.out.println("");
								}
							}
						}else {
							kontakten[position] = new Daten();
							
							System.out.println("Ihre Daten bitte jetzt");				

							kontakten[position].name = IOTools.readLine("Ihre Name");
							kontakten[position].vorname = IOTools.readLine("Ihre Vorname");
							kontakten[position].matrikel = IOTools.readInt("Ihres Matrikel-Nummer");
							kontakten[position].studiengang = IOTools.readLine("Ihren Studiengang");
							kontakten[position].email = IOTools.readLine("Ihres Email");
							kontakten[position].semester = IOTools.readInt("Ihres Semester");
							
							kontakten[position].IsTaken = true;
							
							System.out.println(kontakten[position].name);
							System.out.println(kontakten[position].vorname);
							System.out.println(kontakten[position].matrikel);
							System.out.println(kontakten[position].studiengang);
							System.out.println(kontakten[position].email);
							System.out.println(kontakten[position].semester);	
							System.out.println("");

					}
				}
				
				break;
				
			case 2 :
				position = IOTools.readInt("Geben sie ihre Position, die uberschreiben werden sollte"); 
				
				if((position < 10) && (position >= 0)) {
					
					kontakten[position] = new Daten();
					
					String zumUberSchreiben = new String("Geben sie neue Daten zum Uberschreiben");
					System.out.println(zumUberSchreiben);
					
					kontakten[position].name = IOTools.readLine("Ihre Name");
					kontakten[position].vorname = IOTools.readLine("Ihre Vorname");
					kontakten[position].matrikel = IOTools.readInt("Ihres Matrikel-Nummer");
					kontakten[position].studiengang = IOTools.readLine("Ihren Studiengang");
					kontakten[position].email = IOTools.readLine("Ihres Email");
					kontakten[position].semester = IOTools.readInt("Ihres Semester");
					
					kontakten[position].IsTaken = true;
					
					System.out.println(kontakten[position].name);
					System.out.println(kontakten[position].vorname);
					System.out.println(kontakten[position].matrikel);
					System.out.println(kontakten[position].studiengang);
					System.out.println(kontakten[position].email);
					System.out.println(kontakten[position].semester);
				
				}				
			case 3 : 
				// Programm beenden
				ProgrammFertig = true;
				
				break;
				
			default: 
				System.out.println("Sie mussen zahl eingeben von 1 bis 3. Wiederholen Sie das noch einamal");
			}
		}
	}
}
