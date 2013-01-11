package aufgabe10;

import Prog1Tools.*;

public class Aufg10 implements Plottable {
	private static double a, b; // geht nicht als Parameter

	public double inf() {
		return 0;
	}

	public double sup() {
		return 2 * Math.PI;
	}

	public double x(double t) {
		return a * Math.sin(t);
	}

	public double y(double t) {
		return b * Math.cos(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length > 0) {
			a = Double.parseDouble(args[0]);
		} else {
			a = IOTools.readDouble("erste Halbachse: ");
		}
		if (args.length > 1) {
			// b = Double.valueOf(args[1]); //unboxing
			b = Double.parseDouble(args[1]);
		} else {
			b = IOTools.readDouble("zweite Halbachse: ");
		}

		System.out.println(a + " " + b);

		Aufg10 a11 = new Aufg10();
		Plotter p = new Plotter(a11, "Ellipse");
		// Plotter p = new Plotter (new Aufg11(),"Ellipse");
		p.adjustGrid(1, 1);
		p.showGrid(true);
		p.setNumOfPoints(99);
		p.setVisible(true);
	}
}
