import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Scomponent extends JComponent{
	
	private static  final int w = 400;
	private static  final int h = 400;
	private Image image;
	
	public Scomponent() {
		image = new ImageIcon("1.gif").getImage();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Rectangle2D rec = new Rectangle2D.Double(100,100,100,100);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(rec);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(w,h);
	}
}
