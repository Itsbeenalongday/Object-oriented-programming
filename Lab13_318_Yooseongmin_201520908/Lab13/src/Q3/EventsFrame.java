package Q3;
import java.awt.Color;
import java.awt.BorderLayout;
  // containers 
import javax.swing.JFrame;
import javax.swing.JPanel;
  // GUI elemenets that should be added to containers 
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JButton;
// Event Listner Interfaces  
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;


public class EventsFrame extends JFrame implements ActionListener, ItemListener, MouseListener, 
					MouseMotionListener, KeyListener, ListSelectionListener{
	private JPanel panel1;
	private JScrollPane scrollPane;
	private JTextArea outputJTextArea;
	private JComboBox<String> comboBox;
	private JRadioButton radioButton;
	private JList<String> list;
	private JButton clearJButton;
	
	private String[] names = {"Anteater", "Caterpillar", "Centipede", "Fire Fly"};
	
	// set up GUI and register event handlers
	public EventsFrame(){
		super("Events");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(375,325);
		// create GUI components
		outputJTextArea = new JTextArea(10, 30);
		outputJTextArea.setLineWrap(true);
		outputJTextArea.setEditable(false);
		outputJTextArea.setBackground(Color.WHITE);
		outputJTextArea.setForeground(Color.BLACK);
		
		// add the output area to a scroll pane 
		// so the user can scroll the output
		scrollPane = new JScrollPane(outputJTextArea);
		
		// comboBox listens for item and key events
		comboBox = new JComboBox<String>(names);
		comboBox.addItemListener(this);
		comboBox.addKeyListener(this);

		// radioButton listens for action events
		radioButton = new JRadioButton("Select Me", false);
		radioButton.addActionListener(this);
		
		// list listens for list selection events
		list = new JList<String>(names);
		list.addListSelectionListener(this);
		
		// clear button for clearing the output area
		clearJButton = new JButton("Clear");
		clearJButton.addActionListener(

        new ActionListener(){
            public void actionPerformed(ActionEvent event){
            	outputJTextArea.setText("");
            }
         });

		// application listens to its own key and mouse events
		addMouseMotionListener(this);
		addMouseListener(this);
		
		panel1 = new JPanel();
		panel1.add(comboBox);
		panel1.add(radioButton);
		panel1.add(list);
		panel1.add(clearJButton);
		
      	// add components to container
		add(scrollPane, BorderLayout.CENTER);
		add(panel1, BorderLayout.SOUTH);
		super.setVisible(true);
	} 
	
	// ActionListener event handlers
	public void actionPerformed(ActionEvent event){
		display("ActionEvent", event);
	} 

	// ItemListener event handlers
	public void itemStateChanged(ItemEvent event){
		display("ItemEvent", event);
	} 
	
	// MouseListener event handlers
	public void mouseClicked(MouseEvent event){
		display("MouseEvent", event);
	} 
	
	public void mouseEntered(MouseEvent event){
		display("MouseEvent", event);
	} 
	
	public void mouseExited(MouseEvent event){
		display("MouseEvent", event);
	} 
	
	public void mousePressed(MouseEvent event){
		display("MouseEvent", event);
	}

	public void mouseReleased(MouseEvent event){
		display("MouseEvent", event);
	} 

	// MouseMotionListener event handlers
	public void mouseDragged(MouseEvent event){
		display("MouseEvent", event);
	} 

	public void mouseMoved(MouseEvent event){
		display("MouseEvent", event);
	}

	// KeyListener event handlers
	public void keyPressed(KeyEvent event){
		display("KeyEvent", event);
	}

	public void keyReleased(KeyEvent event){
		display("KeyEvent", event);
	}

	public void keyTyped(KeyEvent event){
		display("KeyEvent", event);
	} 

	// ListSelectionListener event handlers
	public void valueChanged(ListSelectionEvent event){
		display("ListSelectionEvent", event);
	} 
	
	// display event occurred to output
	public void display(String eventName, Object event){
		outputJTextArea.append(String.format("%s occurred\n%S\n\n", eventName, event.toString()));
	} 
}