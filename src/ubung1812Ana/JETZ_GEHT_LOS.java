package ubung1812Ana;

import Prog1Tools.IOTools;

public class JETZ_GEHT_LOS {
	public static void main(String[] args) {
		int a;
		int AnzahlMain = 0;
		do {
			System.out
					.println("--------====--------\n|    OnlineShop    |\n--------====--------");
			System.out
					.println("1. Einkaufen \n2. Anzeige des Warenkorbs \n3. Bezahlen \n4. Beenden ");
			a = IOTools.readInteger();
			switch (a) {
			case 1: { // E I N K A U F E N
				do {
					System.out
							.println("--------====---------\n|     Einkaufen     |\n--------====---------");
					System.out
							.println("Was m�chten Sie kaufen? \n1. Clissa \n2. Timpa \n3. Jeans Michigan \n0. Zur�ck ");
					a = IOTools.readInteger();

					switch (a) {
					case 1:
						Top Clissa = new Top();
						Clissa.Preis = 10.0;
						System.out.println("Wie viel St�ck? ");
						a = IOTools.readInteger();
						Clissa.Einkaufen(a);
						AnzahlMain = AnzahlMain + Clissa.Anzahl;
						break;
					case 2:
						Top Timpa = new Top();
						Timpa.Preis = 150.0;
						System.out.println("Wie viel St�ck? ");
						a = IOTools.readInteger();
						Timpa.Einkaufen(a);
						AnzahlMain = AnzahlMain + Timpa.Anzahl;
						break;
					case 3:
						Hose Jeans = new Hose();
						Jeans.Preis = 420.0;
						System.out.println("Wie viel St�ck? ");
						a = IOTools.readInteger();
						Jeans.Einkaufen(a);
						AnzahlMain = AnzahlMain + Jeans.Anzahl;
						break;
					default:

					} // end of switch
				} while (a != 0);
			}
				break;
			case 2: // W A R E N K O R B
				System.out.println("Sie haben " + AnzahlMain
						+ " Artikel bestellt.");
				break;
			case 3: // B E Z A H L E N
				//AnzahlMain = 0;
				System.out.println("Vielen Dank f�r Ihren Einkauf!" + AnzahlMain);
				break;
			default:

			} // end of switch
		} while (a != 4);
	}
}