package ubung2711Sam;

public class Fahzeug {

	int people;
	int letadlo;
	int crewPreis = 8990;
	int pristaniCena = 499;
	int ticket = 264;
	double benzinPreis = 9.33;
	double benzinPreisPerPerson;

	public Fahzeug(int letadlo,int people, double benzinPreisPerPerson) {
		this.letadlo = -letadlo;
		this.people = people;
		this.benzinPreisPerPerson = benzinPreisPerPerson;
	}

	public double benzinPreis() {
		return benzinPreis;
	}

	public int crewPreis() {
		return crewPreis;
	}
	public int pristaniCena() {
		return pristaniCena;
	}

	public int ticket() {
		return ticket;
	}

	public int people() {
		return people;
	}
	public void benzinPreisPerPerson(double benzinPreisPerPerson) {
		this.benzinPreisPerPerson = benzinPreisPerPerson;
	}
	public double benzinPreisPerPerson() {
		return benzinPreisPerPerson;
	}
	public void letadlo(int letadlo) {
		this.letadlo = letadlo;
	}
	public int letadlo() {
		return letadlo;
	}
}
