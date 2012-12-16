package aufgabe10;

import Prog1Tools.IOTools;
import Prog1Tools.Plottable;
import Prog1Tools.Plotter;

public class KreisPlotAna implements Plottable {
	double a;
	double b;

	KreisPlotAna(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double inf() // Ab diesem Wert beginnt der Parameterbereich
	{
		return 0;
	}

	public double sup() // Bis zu diesem Wert geht der Parameterbereich
	{
		return 2 * Math.PI;
	}

	public double x(double t) // X-Koordinate x(t) zum Parameter t aus [inf,sup]
	{// Double a = new Double(1);
		return Math.sin(t) * a;
	}

	public double y(double t) // Y-Koordinate y(t) zum Parameter t aus [inf,sup]
	{// Double b = new Double(1);
		return b * Math.cos(t);
	}

	public static void main(String[] args) {
		System.out.println("a: ?");
		double a = IOTools.readDouble();
		System.out.println("b: ?");
		double b = IOTools.readDouble();

		Plotter p = new Plotter(new KreisPlotAna(a, b), "Kreisplot");
		p.adjustGrid(0.2, 0.2); // Legt fest, in welchen Zwischenabst�nden
								// Markierungen in das Gitter eingef�gt werden
								// sollen.
		p.showGrid(true); // Macht das Koordinatensystem sichtbar oder
							// unsichtbar.
		p.setNumOfPoints(99); // Setzt die Anzahl der Zwischenpunkte, mit denen
								// die Kurve gezeichnet werden soll.
		p.setVisible(true); // Macht den Plot sichtbar oder unsichtbar.
		System.out.print("zum Beenden bitte das ");
		System.out.println("Grafikfenster schliessen.");

	}

}
