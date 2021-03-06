package aufgabe9StringComparable;

public class StringL implements Comparable<Object> {
	protected String str;

	public StringL(String par) {
		this.str = par;
	}

	public int compareTo(Object arg) {
		StringL s = (StringL) arg; // type cast
		return str.length() - s.str.length();
	}

	/*
	 * public int length() // dann ginge s.length() { return str.length(); }
	 */
	public String toString() {
		return str;
	}
}
