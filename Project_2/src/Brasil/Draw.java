package Brasil;


import java.awt.*;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Draw extends JPanel {

	public static String[][] tab_data = new String[20][2]; // table which save the temperature and the time
	public static int condition = 0;

	public Draw() {
		super();
	}

	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g)
	// public void paint()
	{
		// Graphics g = getGraphics();

		float time; // X->time
		float temp; // Y->temperature
		int X; // X->time
		int Y; // Y->temperature
		String Chaine1; // will be used for string float conversion
		String Chaine2; // will be used for string float conversion

		// Graphics g = cnvs.getGraphics();
		// Graphics g ;//
		// g= cnvs.getGraphics();
		// Graphics2D g2d = (Graphics2D)G;

		/// DRAWING
		// The abscissa represent the time and the ordinate represent the temperature at
		/// this moment
		// COORDINATE SYSTEM
		g.drawLine(100, 200, 100, 700); // coordinate system - ordinate
		g.drawLine(100, 200, 90, 210); // cross - ordinate
		g.drawLine(100, 200, 110, 210); // cross - ordinate
		g.drawLine(100, 700, 700, 700); // coordinate system - abscissa
		g.drawLine(700, 700, 690, 690); // cross- abscissa
		g.drawLine(700, 700, 690, 710); // cross - abscissa
		if (condition < 20)
			for (int i = 0; i < condition; i++) {
				Chaine1 = tab_data[i][0];
				Chaine2 = tab_data[i][1];
				time = Float.parseFloat(Chaine1);
				temp = Float.parseFloat(Chaine2);
				X = (int) time;
				Y = (int) temp;
				Color Color1 = new Color(0, 6, 255); // blue
				g.setColor(Color1);
				g.fillOval(100+15*i, 100, 10, 10);
				System.out.println("boucle"+i);
			}
		else
			for (int i = 0; i < 20; i++) {
				Chaine1 = tab_data[i][0];
				Chaine2 = tab_data[i][1];
				time = Float.parseFloat(Chaine1);
				temp = Float.parseFloat(Chaine2);
				X = (int) time;
				Y = (int) temp;
				Color Color1 = new Color(0, 6, 255); // blue
				g.setColor(Color1);
				g.fillOval(X, Y, 10, 10);
			}
	}

	public void paintComponent(Graphics g) {
		// super.paintComponent(g);
		// Graphics2D g2 = (Graphics2D) g;
		// COORDINATE SYSTEM
		g.drawLine(100, 200, 100, 700); // coordinate system - ordinate
		g.drawLine(100, 200, 90, 210); // cross - ordinate
		g.drawLine(100, 200, 110, 210); // cross - ordinate
		g.drawLine(100, 700, 700, 700); // coordinate system - abscissa
		g.drawLine(700, 700, 690, 690); // cross- abscissa
		g.drawLine(700, 700, 690, 710); // cross - abscissa
	}
}
