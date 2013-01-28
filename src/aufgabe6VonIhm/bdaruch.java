package aufgabe6VonIhm;

public class bdaruch {
	int zaehler;
	int nenner;

	public bdaruch() {
		zaehler = 10;
		nenner = 2;

	}

	public int getZaehler() {
		return zaehler;

	}

	public int getNenner() {
		return nenner;

	}

	public double bruchZuDezimal() {
		return (double) zaehler / nenner;

	}

	public String toString() {
		return "(" + (zaehler + "/" + nenner) + ")";

	}

	public void setZaehlerkommaNenner(int neuerZaehler, int neuerNenner) {

		while (neuerNenner < 1) {
			System.out
					.println("Nenner muss groe�er als 0 sein!! Nenner wird auf 1 gesetzt");
			neuerNenner++;

		} // end of if

		zaehler = neuerZaehler;
		nenner = neuerNenner;

	}

	public void multiply(int zaehlerM, int nennerM) {

		zaehler = zaehler * zaehlerM;
		nenner = nenner * nennerM;

	}

}