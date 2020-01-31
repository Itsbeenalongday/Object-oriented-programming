package Q2;
import javax.swing.JFrame;

public class Concentric extends JFrame{
	Concentric(){
		CirclesJPanel cp = new CirclesJPanel();
		this.setTitle("Concentric Circles");
		this.setSize(250, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(cp);
	}
	public static void main(String args[])
	{
		new Concentric();
	} 
}
