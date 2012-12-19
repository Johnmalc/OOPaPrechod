package ubung1812Ana;

public class Top extends Shop {
	public int Anzahl;
	public double Preis;

	Top() {

	}

	public int Einkaufen(int a) {
		System.out.println("Schon im Warenkorb!");
		Anzahl = Anzahl + a;
		return Anzahl;
	}

}