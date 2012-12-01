package aufgabe8;

public class Microsoft extends DreiVerwaltungen {

	public String name = "Microsoft";
	public String identifier = "MICR";
	public double price;
	public int quantity;
	public int youHaveAlready;
	public int newQuantity;

	public Microsoft(double priceX, int quantityX, int r) {
		this.price = priceX;
		this.youHaveAlready = r;
		this.quantity = quantityX;
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
	public double getValue() {
		double newValue = price * quantity;
		double newRounded = Math.round(newValue);
		return newRounded;
	}

	@Override
	public String toString() {
		return name + " " + identifier + " " + price + " " + quantity + " "
				+ youHaveAlready;
	}

	@Override
	public String getSagHallo() {
		String a = name + " sagt Aufwiedersehen";
		return a;
	}

	@Override
	public double berechneGebuhr() {
		double berechnung = getValue() + AktienGebuhr * getValue();
		return berechnung;
	}

	@Override
	public double setBuyHedgefond(int zakladovka) {
		// TODO Auto-generated method stub
		return 0;
	}
}
