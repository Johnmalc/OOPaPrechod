package aufgabe8;

public class Rentefonds extends DreiVerwaltungen {
	
	String name = "Rentefonds";
	String identifier = "RF";
	public int quantity;

	
	
	public Rentefonds (int quantityX) {
		this.quantity=quantityX;
	}

	@Override
	public double getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String setSell(int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setBuy(int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double berechneGebuhr() {
		double a = (RentenfondsGebruh * quantity) + quantity;
		double b = Math.round(a);
		return b;
	}

	@Override
	public double setBuyHedgefond(int zakladovka) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSagHallo() {
		// TODO Auto-generated method stub
		return null;
	}

}
