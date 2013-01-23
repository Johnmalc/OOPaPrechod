package ubung2001Druhy;

public class MyException extends Exception {
	String Ferhler;
	
	/**
	 * @param args
	 */

	public MyException() {

	}

	public MyException(String Ferhler) {
		super(Ferhler);
	}

}
