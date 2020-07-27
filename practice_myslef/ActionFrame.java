import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ActionFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int width = 300;
	private static final int height = 200;
	
	public ActionFrame() {
		setSize(width,height);
		buttonPanel = new JPanel();

		ColorAction yellowAction = new ColorAction("나는",Color.yellow);
		ColorAction blueAction = new ColorAction("필요하다",Color.blue);
		ColorAction redAction = new ColorAction("이쁜여자",Color.red);
		setLayout(new BorderLayout());
		buttonPanel.add(BorderLayout.EAST,new JButton(yellowAction));
		buttonPanel.add(BorderLayout.WEST,new JButton(blueAction));
		buttonPanel.add(BorderLayout.SOUTH,new JButton(redAction));
	
		add(buttonPanel);
		
		InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
		imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
		imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");
		
		ActionMap amap = buttonPanel.getActionMap();
		amap.put("panel.yellow", yellowAction);
		amap.put("panel.blue", blueAction);
		amap.put("panel.red", redAction);
	}
	
	public class ColorAction extends AbstractAction{
		
		public ColorAction(String name, Color c) {
			putValue(Action.NAME,name);
			putValue(Action.SHORT_DESCRIPTION,"Set panel color to "+name.toLowerCase());
			putValue("color",c);
		}
		
		public void actionPerformed(ActionEvent event) {
			Color c = (Color)getValue("color");
			buttonPanel.setBackground(c);
		}
	}
}
