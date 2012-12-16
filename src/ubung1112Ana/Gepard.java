package ubung1112Ana;

class Gepard extends Saeugetier {
	boolean Boese = false;

	Gepard() {

	}

	Gepard(int a, String n, boolean B) {
		super(a, n);
		this.Boese = B;
	}

	public void beissen() {
		System.out.println("Auu!");
	}

}