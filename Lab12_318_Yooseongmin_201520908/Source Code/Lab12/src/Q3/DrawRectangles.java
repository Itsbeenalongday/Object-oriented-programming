package Q3;
import javax.swing.JFrame;

public class DrawRectangles extends JFrame{
	DrawRectangles(){
		RectanglesPanel rp = new RectanglesPanel();
		this.setTitle("Nested Rectangles");
		this.setSize(400, 400);
		this.add(rp);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String arg[]) {
		new DrawRectangles();
	}
}