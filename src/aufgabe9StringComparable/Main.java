package aufgabe9StringComparable;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Com sl[] = new Com[3];
		
		Com main = new Com("mma", "jssnf", "dsfdds");
		Com second = new Com("mamam", "dima", "papa");
		Com third = new Com("doma", "kofe", "matric");
		
		sl[0] = main;
		sl[1] = second;
		sl[2] = third;
		
		Arrays.sort(sl);
		
		for (int i = 0; i  < sl.length; i++) {
			System.out.println(sl[i]);
		}

	}

}
