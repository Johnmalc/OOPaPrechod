package aufgabe9StringComparator;

import java.util.Comparator;

public class Sort implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// here to change the order, change both of them
		if (o1.length() < o2.length()) {
			return -1;
		} else if (o1.length() > o2.length()) {
			return 1;
		} else {
			return 0;
		}
	}
}