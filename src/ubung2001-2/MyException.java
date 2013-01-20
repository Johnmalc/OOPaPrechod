package malc2;

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
