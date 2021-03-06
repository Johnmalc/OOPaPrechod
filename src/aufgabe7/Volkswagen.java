package aufgabe7;

public class Volkswagen extends Aktien {
	public String name = "Volkswagen";
	public String identifier = "VW";
	public double price;
	public int quantity;
	public int newQuantity;

	public Volkswagen(double priceX, int quantityX) {
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
	public String getValue() {
		double newValue = price * quantity;
		String a = "The value of the share is " + newValue;
		return a;
	}
	@Override
	public String toStringNon() {
		return name + " " + identifier + " " + price + " " + quantity;
	}
	@Override
	public String getSagHallo() {
		String a = name + " sag Hallo";
		return a;
	}
}
