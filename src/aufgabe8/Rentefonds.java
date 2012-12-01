package aufgabe8;

public class Rentefonds extends DreiVerwaltungen {
	
	String name = "Rentefonds";
	String identifier = "RF";
	public int quantity;
	public int newQuantity;
	public int verkauf;
	public double price;

	
	
	public Rentefonds (int quantityX, double priceX, int verkaufX) {
		this.quantity=quantityX;
		this.price = priceX;
		this.verkauf = verkaufX;
	}

	@Override
	public double getValue() {
		double value =  quantity * price;
		double newv= Math.round(value);
		return newv;
	}

	@Override
	public String setBuy(int quantity) {
		newQuantity = quantity + this.quantity;
		return "Now you have (newquantity)" + newQuantity + "\n"
				+ "Now you have bought " + name + " for " + price
				+ ". You own " + newQuantity + ".";
	}

	@Override
	public String setSell(int quantity) {
		newQuantity = this.quantity - quantity;
		return "Now you have sold " + name
				+ " for " + price + ". You own " + newQuantity + ".";
	}

	@Override
	public double berechneGebuhr() {
		double a = (RentenfondsGebruh * quantity) + quantity;
		return a;
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
