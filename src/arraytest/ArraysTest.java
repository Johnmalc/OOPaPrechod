package arraytest;

public class ArraysTest extends Aktien {
		public String name = "Google";
		public String identifier = "Goog";
		public double price;
		public int quantity;
		public int newQuantity;

		public ArraysTest(double priceX, int quantityX) {
			this.price = priceX;
			this.quantity = quantityX;
			newQuantity = quantity + this.quantity;
			System.out.println( "You have " + newQuantity + ". You bought " + quantity + "."
					+ "\n" + "Now you have bought " + name + " for " + price
					+ ". You own " + newQuantity + ".");
			int newQuantity2 = this.quantity - quantity;
			System.out.println( "You have " + newQuantity2 + ". You sold " + quantity + "."
					+ "\n" + "Now you have sold " + name + " for " + price
					+ ". You own " + newQuantity2 + ".");
			double newValue = price * quantity;
			System.out.println(name + " " + identifier + " " + price + " " + quantity);

		}

//		@Override
//		public String setSell(int quantity) {
//			newQuantity = this.quantity - quantity;
//			System.out.println( "You have " + newQuantity + ". You sold " + quantity + "."
//					+ "\n" + "Now you have sold " + name + " for " + price
//					+ ". You own " + newQuantity + ".");
//		}

//		@Override
//		public double getValue() {
//			double newValue = price * quantity;
//			return newValue;
//		}

//		@Override
//		public String toStringNon() {
//			// TODO Auto-generated method stub
//			System.out.println(name + " " + identifier + " " + price + " " + quantity);
//		}

	}
