package Q2;

//This program draws concentric circles using Graphics2D
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.*;

public class CirclesJPanel extends JPanel{
	// draw eight concentric circles separated by 10 pixels
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		for (int topLeft = 0; topLeft < 80; topLeft += 10)
		{
			int radius = 160 - (topLeft * 2);
			g2.draw(new Ellipse2D.Double(topLeft, topLeft, radius, radius));
		}
	}
}
