package Q4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Circle extends JFrame{
	 Circle (){
		 JOptionPane JOP = new JOptionPane("input");
	
		 String inputradius = JOptionPane.showInputDialog("Enter radius:");
		 String inputx = JOptionPane.showInputDialog("Enter x-coordinate:");
		 String inputy = JOptionPane.showInputDialog("Enter y-coordinate:");
		
		 double radius = Double.parseDouble(inputradius);
		 int x = Integer.parseInt(inputx);
		 int y = Integer.parseInt(inputy);
		
		 CirclesJPanel CJP = new CirclesJPanel(radius, x, y);
		 JFrame frame = new JFrame("Circle");
		 frame.setSize(200, 250);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.add(CJP);
		 frame.setVisible(true);
	 }
	 public static void main(String args[]){
		 new Circle();
	 }      
}