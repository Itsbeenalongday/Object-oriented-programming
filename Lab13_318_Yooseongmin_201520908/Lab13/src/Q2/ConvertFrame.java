package Q2;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class ConvertFrame extends JFrame{
	private JLabel label1, label2;
	private JTextField text;
	
	public ConvertFrame(){
		super("Temperature converter");
		super.setSize(225, 90);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.label1 = new JLabel("Enter Fahrenheit temperature:");
		super.add(label1, new BorderLayout().NORTH);
		
		this.text = new JTextField();
		super.add(text, new BorderLayout().CENTER);
		
		this.label2 = new JLabel("Temperature in Celsius is:");
		super.add(label2, new BorderLayout().SOUTH);
		
		text.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double Fahrenheit = Double.parseDouble(text.getText());
				double Celsius = (Fahrenheit-32)/1.8;
				
				String origin = "Temperature in Celsius is:";
				label2.setText(origin+Celsius);
			}
		});
		super.setVisible(true);
	}
}