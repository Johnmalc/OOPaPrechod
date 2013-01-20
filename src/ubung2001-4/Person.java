package malc4;

public class Person extends SuperKlasse implements Int, Int2 {

	String name;

	public Person() {
		name = "Dima";

	}

	@Override
	public void Lesen() {
		System.out.println("Ich kann lesen");
	}

	@Override
	public void schwimmen() {
		System.out.println("Ich schwimme");

	}

	@Override
	public void sagHallo() {
		System.out.println("hallo" + name);
	}

}
