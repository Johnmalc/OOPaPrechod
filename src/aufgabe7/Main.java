package aufgabe7;

import java.util.Arrays;
import Prog1Tools.IOTools;

public class Main {

	/**
	 * @author johnmalc
	 * @author Heiko
	 */
	public static void main(String[] args) {
		/*
		 * Object for GS Print Wert from method Get Value
		 */
		int a = IOTools.readInt();
		int d = IOTools.readInt();
		// 1. price 2. quantity
		GoldmanSachs share = new GoldmanSachs(a, d);
		System.out.println(share.toStringNon());
		// "wert insgesamt"
		System.out.println(share.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share.setBuy(50));
		System.out.println(share.setSell(20));
		
		System.out.println("\n");
		System.out.println("\n");
		
		/*
		 * Object for Microsoft
		 */
		// 1. price 2. quantity
		Microsoft share2 = new Microsoft(170, 200);
		System.out.println(share2.toStringNon());
		// "wert insgesamt"
		System.out.println(share2.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share2.setBuy(50));
		System.out.println(share2.setSell(20));

		System.out.println("\n");
		System.out.println("\n");

		/*
		 * Object for Google
		 */
		// 1. price 2. quantity
		Google share3 = new Google(10, 30);
		System.out.println(share3.toStringNon());
		// "wert insgesamt"
		System.out.println(share3.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share3.setBuy(50));
		System.out.println(share3.setSell(20));

		System.out.println("\n");
		System.out.println("\n");

		/*
		 * Object for Volkswagen
		 */
		// 1. price 2. quantity
		Volkswagen share4 = new Volkswagen(100, 1000);
		System.out.println(share4.toStringNon());
		// "wert insgesamt"
		System.out.println(share4.getValue());
		/*
		 * "Verkaufen und kaufen"
		 */
		System.out.println(share4.setBuy(50));
		System.out.println(share4.setSell(20));
		
		
		
		/*
		 * Array 
		 */
//		Aktien[] shares = new Aktien [4];
//		shares[0] = new Google(10,30);
//		
//		System.out.println(Arrays.toString(shares));
	
		
		
		
		
		
		
		

	}

}
