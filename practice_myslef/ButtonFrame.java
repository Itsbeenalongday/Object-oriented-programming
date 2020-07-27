import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonFrame extends JFrame{
	private JPanel buttonPanel;
	public static int width = 200;
	public static int height = 200;
	
	public ButtonFrame() {
		setSize(width,height);
		JButton yellowButton = new JButton("yellow");
		JButton blueButton = new JButton("blue");
		JButton redButton = new JButton("red");
		
		buttonPanel = new JPanel();
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
		add(buttonPanel);
		
		 JCheckBox ch1 = new JCheckBox();
	     JCheckBox ch2 = new JCheckBox();
	     
	     buttonPanel.add(ch1);
	     buttonPanel.add(ch2);
	     
	     
		/*
		ColorAction yellowAction = new ColorAction(Color.yellow);
		ColorAction blueAction = new ColorAction(Color.blue);
		ColorAction redAction = new ColorAction(Color.red);
		*/
		
		yellowButton.addActionListener(yellowAction -> buttonPanel.setBackground(Color.YELLOW));
		blueButton.addActionListener(blueAction -> buttonPanel.setBackground(Color.blue));
		redButton.addActionListener(redAction -> buttonPanel.setBackground(Color.red));
	}
	/*
	public class ColorAction implements ActionListener{
		
		private Color backgroundColor;
		
		ColorAction(Color c){
			backgroundColor = c;
		}
		
		public void actionPerformed(ActionEvent event) {
			buttonPanel.setBackground(backgroundColor);
		}
	}
	*/
}
