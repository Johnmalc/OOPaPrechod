package ubung0801Ctvrty;

public class Schiff implements In {
	String name;

	public Schiff() {
	}

	public Schiff addBuch() {
		Buch bu = new Buch();
		return this;
	}

	public Schiff addKatze() {
		Katze bu = new Katze();
		return this;
	}

	public Schiff printlnad(String namel) {
		this.name = namel;
		return this;
	}
}
