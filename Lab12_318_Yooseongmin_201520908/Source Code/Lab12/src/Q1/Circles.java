package Q1;
import javax.swing.JFrame;
import java.awt.*;

public class Circles extends JFrame{
	Circles(){
		CirclesJPanel cp = new CirclesJPanel();
		this.setTitle("Concentric Circles");
		this.setSize(200, 250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(cp);
	}
	public static void main(String args[]){
		new Circles();
		
	}
}

