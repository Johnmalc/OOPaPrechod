package malc3;

public abstract class SuperKlasse {
	String name= "Superkalsse";
	
//	public SuperKlasse() {
//
//	}
	
	public abstract void MethodeOffen();
	public abstract void Mes();
	public abstract String Jo();
	public abstract void Jo(String name);
	
	public void sageHallo(){
		System.out.println("ich bin: " + name);
	}

}
