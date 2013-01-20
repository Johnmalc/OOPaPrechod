package malc3;

public class Main {

	public static void main(String[] args) {
		BautTeilA a = new BautTeilA();
		a.sageHallo();
		a.MethodeOffen();
		a.Mes();
		a.sageHallo();
		a.Jo("goda");
		a.Jo();
		System.out.println(a.Jo());


		BautTeilX b = new BautTeilX();
		b.MethodeOffen();
		b.Mes();
		b.Jo("name");
		System.out.println(b.Jo());

	}

}
