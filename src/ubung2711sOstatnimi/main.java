package ubung2711.SOstatnimi;

/**
 * 
 * Beschreibung
 * 
 * @version 1.0 vom 27.11.2012
 * @author
 */

public class main {

	public static void main(String[] args) {
		Flugzeug Mouse = new Flugzeug(2500000, 105, 9.6);
		for (int i = 1; i < 131; i++) {
			System.out.println(i);

			Flugzeug Spider = new Flugzeug(3000000, i, 9.4);

			double n = Spider.gettreibstoff();
			int pass = Spider.getpanzahl();
			double treibpro = Spider.gettreibstoff();
			int andock = Spider.getandock();
			Berechnung Beree = new Berechnung();
			System.out.println(Beree.kosten(pass, n, treibpro, andock));

			double ticket = Spider.getticket();
			double gewinn = (Beree.gewinn(ticket, pass) - Beree.kosten(pass, n,
					treibpro, andock));
			if (gewinn > 0) {
				System.out.println("Der Flug lohnt sich");
			} else {
				System.out.println("Der Flug lohnt sich nicht");
			}
			System.out.println(Beree.gewinn(ticket, pass));
		}
	}
} // end of main
