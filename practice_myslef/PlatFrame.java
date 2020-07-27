import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PlatFrame extends JFrame{
	private JPanel platPanel;
	
	public PlatFrame() {
		platPanel = new JPanel();
		add(platPanel);
		
		int[] arr = {1,2,3,4,5};
		
		UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
		
		for(UIManager.LookAndFeelInfo info : infos) {
			makeButton(info.getName(),info.getClassName());
		}
		
		add(platPanel);
		
		pack();
	}
	
	public void makeButton(String name, String className) {
		JButton button = new JButton(name);
		platPanel.add(button);
		
		button.addActionListener(event -> 
		{
			try {
				UIManager.setLookAndFeel(className);
				//SwingUtilities.updateComponentTreeUI(this);
				//pack();
			}catch(Exception e) {
				e.printStackTrace();
			}
		});
	}
}
