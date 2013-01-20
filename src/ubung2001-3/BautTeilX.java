package malc3;

public class BautTeilX extends SuperKlasse {
	String name;
	
	public BautTeilX() {

	}

	@Override
	public void MethodeOffen() {
		System.out.println("TigerPower");
	}

	@Override
	public void Mes() {
		for (int i = 0; i<10; i++){
			System.out.println("dskjfhdsjkfh");
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
