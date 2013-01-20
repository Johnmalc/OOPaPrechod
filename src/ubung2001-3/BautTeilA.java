package malc3;

public class BautTeilA extends SuperKlasse {
	String name;

	public BautTeilA() {

	}

	@Override
	public void MethodeOffen() {
		System.out.println("Fisch ");
	}

	@Override
	public void Mes() {
		for (int i = 0; i<5; i++){
			System.out.println("Blafsgfdgfgdbna");
		}
	}

	@Override
	public String Jo() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void Jo(String name) {
		this.name = name;
	}

}
