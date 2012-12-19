package ubung1812Ana;

public class Hose extends Shop {
	public int Anzahl = 0;
	public double Preis;

	Hose() {

	}

	public int Einkaufen(int a) {
		System.out.println("Vielen Dank!");
		Anzahl = Anzahl + a;
		return Anzahl;
	}

}