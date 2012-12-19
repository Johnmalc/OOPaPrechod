/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung1812Sam;

/**
 * public void addAnimal(Animal a){ // Your method above for(int x=0; x <
 * animals.length; x++){ animals[x] = a; } }
 * 
 * 
 * @author petrovd
 */
public class Warenkorb {
	Artikel[] ar = new Artikel[2];
	int zahler;

	public void add(Artikel a) {
		if (zahler < ar.length) {
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] != null) {
					ar[i] = a;
					zahler++;
				}
			}
		} else {
			System.out.println("Eoror 33333");
		}
	}

	public String toString() {
		return "Sie haben in Warenkorb einen Artikel";

	}

}
