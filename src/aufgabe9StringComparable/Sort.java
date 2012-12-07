package aufgabe9StringComparable;

public class Sort implements Comparable<Object>  {
	public String aa;

	/**
	 * @param args
	 */
	public Sort (String aX) {
		this.aa = aX;
	}

	@Override
	public int compareTo(Object obj) {
		// the most important thing
		// Die Methode compareTo hat einen Parametertyp Object, den sie erst mit type cast in den
		// gewünschten Typ wandeln müssen (geht später mit generics viel eleganter).
		Sort temp = (Sort) obj;
		
		if(temp.lenght() < this.lenght()) {
			return -1;
		}else if(temp.lenght() > this.lenght()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString () {
		return aa;
	}
	public int lenght() {
		return aa.length();
	}
}
