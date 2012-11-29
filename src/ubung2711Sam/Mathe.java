package ubung2711Sam;

public class Mathe {

	public double kostet(Fahzeug temp) {

		double cena = ((0.8 * temp.benzinPreis() * temp.benzinPreisPerPerson() + temp
				.people())
				+ (temp.benzinPreis() + temp.benzinPreisPerPerson() + temp
						.people()) + 2 * temp.crewPreis() + 2 * temp
				.pristaniCena());
		return cena;
	}

	public double gewinn(Fahzeug temp) {
		double vyhra = temp.ticket() * temp.people()
				+ (temp.ticket() * temp.people() * 0.8);
		return vyhra;
	}

	public double mojeOpravdovaVyhra(Fahzeug temp) {
		return gewinn(temp) - kostet(temp) ;
	}
}
