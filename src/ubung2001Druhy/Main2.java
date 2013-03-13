package ubung2001Druhy;


public class Main2 {

	/**
	 * @param args
	 * throws MyException
	 */
	public static void main(String[] args)  {
		System.out.println("eigene fehler kasse");

		try {
			throw new MyException("fehler von kome");

		} catch (MyException s) {
			System.out.println(s.getMessage());
			System.out.println(s.getMessage());
			System.out.println(s.toString());
		}

//		MyException a = new MyException();
//		MyException b = new MyException("fehler");
//		System.out.println(b.toString());
//		System.out.println(a.toString());

	}

}
