package aufgabe9StringComparable;

public class Com implements Comparable<String> {
	String slovo;
	String slovo2;
	String slovo3;
	String compateslovo;

	public Com(String slovo, String slovo2, String slovo3) {
		this.slovo = slovo;
		this.slovo2 = slovo2;
		this.slovo2 = slovo3;
	}

	@Override
	public int compareTo(String compateslovo) {

		int pocetznaku = ((String)compateslovo).length();
		return slovo;
		
	}


}
