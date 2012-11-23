package aufgabe7;

public class GoldmanSachs extends Aktien {
	public String name = "GoldmanSachs";
	public String identifier = "GS";
	public double price;
	public int quantity;
	public int newQuantity;

	public GoldmanSachs(double priceX, int quantityX) {
		this.price = priceX;
		this.quantity = quantityX;

	}
	@Override
	public String setBuy(int quantity) {
		newQuantity = quantity + this.quantity;
		return "You have " + newQuantity + ". You bought " + quantity + "."
				+ "\n" + "Now you have bought " + name + " for " + price
				+ ". You own " + newQuantity + ".";

	}
	@Override
	public String setSell(int quantity) {
		newQuantity = this.quantity - quantity;
		return "You have " + newQuantity + ". You sold " + quantity + "."
				+ "\n" + "Now you have sold " + name + " for " + price
				+ ". You own " + newQuantity + ".";
	}

	@Override
	public double getValue() {
		double newValue = price * quantity;
		return newValue;
	}

	@Override
	public String toStringNon() {
		// TODO Auto-generated method stub
		return name + " " + identifier + " " + price + " " + quantity;
	}

}
