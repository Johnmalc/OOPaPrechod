package zoo;

public class Vogel {
	// Variable
	public String name;
	public int alter;
	
	public Vogel (String nameX) {
		name = nameX;
	}
	// konstruktor, ktery da jmeno rovnou pri volani funkce ()
	public Vogel() {
		name = "s";
	}
	public String sagHallo () {
		//System.out.println("TYTYTY");
		String a = "Sagt Hallo zu Euch allen";
		return a;
	}
	public void setName(String namex) {
		//name=namex;
		this.name = namex;
	}
	public String getName () {
		return name;
		
	}
	public String toStringN () {
		return name + ' ' +  sagHallo(); 
	}
}