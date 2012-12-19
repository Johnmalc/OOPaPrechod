package aufgabe10;

import java.awt.Graphics;
import java.awt.Graphics2D;
import math.geom2d.conic.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariantaSellipse2D extends JPanel {
	private static final long serialVersionUID = 1L;

	public VariantaSellipse2D() {
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		/*
		 * Define center by coordinate, plus major and minor semi axis
		 * http://geom-java.sourceforge.net/api/index.html
		 */
		Ellipse2D elipsa = new Ellipse2D(100, 100, 60, 20);
		elipsa.draw(g2);

	}

	public static void main(String[] args) {
		JPanel panel = new VariantaSellipse2D();
		JFrame frame = new JFrame("Ellipse");
		frame.setContentPane(panel);
		frame.setSize(250, 250);
		frame.setVisible(true);
	}

}