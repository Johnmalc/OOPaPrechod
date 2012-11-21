/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ubung2011;

/**
 * 
 * @author petrovd
 */
public class Zinsen {

	public static void main(String[] args) {
		// mit For loop

		double CurrMoney = 10000, TotalMoney;
		int years = 10;
		for (int i = 0; i < years; i++) {
			CurrMoney = CurrMoney + (CurrMoney * 0.02);
		}
		TotalMoney = CurrMoney;
		System.out.println(TotalMoney);

		// call by value
		System.out.println(hi(10000, 0.02, 10));

		// shortened
		double CurrMoneyd = 10000, TotalMoneyd, yearsd = 10;
		TotalMoneyd = CurrMoneyd * (1 + (Math.pow((0.02), years)));
		System.out.println(TotalMoneyd);

	}

	public static double hi(double kapital, double zins, int jahr) {
		if (jahr == 0) {
			return kapital;
		} else {
			return (1 + zins) * hi(kapital, zins, jahr - 1);
		}
	}
}
