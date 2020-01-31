package Q3;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import java.awt.*;
public class RectanglesPanel extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		Graphics2D g2=(Graphics2D)g;	 
		int x=150, y=150;
		int length=50; int width=30;
		for(int i=1;i<=10;i++){
			length +=20;
			width+=20;
			x-=10; y-=10;
			g2.draw(new Rectangle2D.Double(x, y, length, width));
		}	
	}
}
