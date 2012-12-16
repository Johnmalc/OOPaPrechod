package aufgabe10;

import Prog1Tools.Plottable;
import Prog1Tools.Plotter;

/**
 * 
 * Schreiben Sie ein Programm, das mit der Klasse Plotter aus Prog1Tools eine
 * Ellipse zeichnet. Die Halbachsen a und b (Fließkomma) sollen entweder als
 * Parameter beim Aufruf mitgegeben werden können (Parameter von main) oder
 * andernfalls im Programm abgefragt werden. Hilfe: Parameterdarstellung einer
 * Ellipse: a*sin(t),b*cos(t) Zahl aus Argument-String: mit Methode aus
 * Wrapper-Klasse Double
 */
public class KreisPlotMoje implements Plottable {
	static double a = 20;
	static double b = 65;

	public static void main(String[] args) {
		Plotter p = new Plotter(new KreisPlotMoje(a, b), "dsffdg");

		p.adjustGrid(1, 1);
		p.showGrid(false);
		p.setNumOfPoints(90);
		p.setVisible(true);
	}

	public KreisPlotMoje(double a, double b) {
		KreisPlotMoje.a = a;
		KreisPlotMoje.b = b;
	}

	@Override
	public double inf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sup() {
		// TODO Auto-generated method stub
		return 2 * Math.PI;
	}

	@Override
	public double x(double t) {
		// TODO Auto-generated method stub
		return a * Math.sin(t);
	}

	@Override
	public double y(double t) {
		// TODO Auto-generated method stub
		return b * Math.cos(t);
	}

}
