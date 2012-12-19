package ubung1812Heiko;

import Prog1Tools.IOTools;

public class Shop {

	public static void main(String[] args) {

		Artikel[] Aspeicher = new Artikel[] { new Top("Clissa", 11.99),
				new Top("Timpa", 15.99), new Jeans("Michigan", 34.99) };

		String quest = "y";
		String wieder;
		String noch;
		do {
			int frage = IOTools
					.readInt("Was moechten sie tun? 1.Kaufen 2.Warenkorb anzeigen (Zahl eingeben)");
			switch (frage) {
			case 1:
				do {
					int weiter = IOTools
							.readInt("Was moechten sie kaufen? 1.Top Clissa 2.Top Timpa 3.Jeans Michigan");
					switch (weiter) {
					case 1:
						int meng = IOTools
								.readInt("Wieviele moechten sie kaufen?");
						Aspeicher[0].kaufen(meng);
						break;
					case 2:
						int menge = IOTools
								.readInt("Wieviele moechten sie kaufen?");
						Aspeicher[1].kaufen(menge);
						break;
					case 3:
						int mengen = IOTools
								.readInt("Wieviele moechten sie kaufen?");
						Aspeicher[2].kaufen(mengen);
						break;
					}
					wieder = IOTools
							.readString("Moechten sie weiter einkaufen?(y/n)");

				} while (wieder.equals(quest));
				break;
			case 2:
				int pruef = 0;
				for (int i = 0; i < Aspeicher.length; i++) {
					if (Aspeicher[i].getMenge() == pruef) {
					} else {
						System.out.println(Aspeicher[i].warenkorb());
					} // end of if
				}
				break;

			}
			noch = IOTools
					.readString("Moechten sie eine weitere Aktion ausfhren?(y/n)");
		} while (noch.equals(quest));

		int pruefer = 0;
		double betrag = 0;

		for (int i = 0; i < Aspeicher.length; i++) {

			if (Aspeicher[i].getMenge() == pruefer) {
			} else {
				System.out.println(Aspeicher[i].warenkorb());
				betrag += Aspeicher[i].getBetrag();
			}

		}
		System.out.println("Der Wert ihres Warenkorbs betraegt " + betrag
				+ ". Bitte ueberweisen sie diesen Betrag");
	}
}