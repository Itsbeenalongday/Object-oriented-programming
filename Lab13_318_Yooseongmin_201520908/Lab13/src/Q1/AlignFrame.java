package Q1;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AlignFrame extends JFrame{
        private JCheckBox snap, show;
        private JPanel panel1, panel2, panel3, panel4, panel5;
        private JLabel labelx, labely;
		private JTextField textx, texty;
       
		public AlignFrame(){
        	super("Align");        
        	super.setLayout(new FlowLayout(FlowLayout.CENTER,10, 5));
        	super.setSize(300, 140);
        	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	this.panel1 = new JPanel();
        	this.snap = new JCheckBox("Snap to Grid");
        	this.show = new JCheckBox("Show Grid");
        	panel1.setLayout(new GridLayout(2,1));
        	panel1.add(snap);
        	panel1.add(show);

        	this.panel2 = new JPanel();
        	textx = new JTextField("8 ");
        	labelx = new JLabel("X:");
        	panel2.add(labelx);
        	panel2.add(textx);
        	panel2.setLayout(new FlowLayout());

        	this.panel3 = new JPanel();
        	texty = new JTextField("8 ");
        	labely = new JLabel("Y:");
        	panel3.add(labely);
        	panel3.add(texty);
        	panel3.setLayout(new FlowLayout());
        	
        	this.panel4 = new JPanel();
        	panel4.setLayout(new BorderLayout());
        	panel4.add(panel2, BorderLayout.NORTH);
        	panel4.add(panel3, BorderLayout.SOUTH);
        	
        	this.panel5 = new JPanel();
        	panel5.setLayout(new GridLayout(3,1,10,5));
        	panel5.add(new JButton("OK"));
        	panel5.add(new JButton("Cancel"));
        	panel5.add(new JButton("Help"));
        	
        	super.add(panel1);
        	super.add(panel4);
        	super.add(panel5);
        	super.setVisible(true);		
        }
}