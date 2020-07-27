import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String args[]) {
		
		 Thread mainThread = Thread.currentThread();  // 현재 쓰레드 얻기
		 mainThread.setName("main-thread");  // 쓰레드 이름 설정
	
		EventQueue.invokeLater( () ->
		{
		 ActionFrame frame = new ActionFrame();
		frame.setTitle("유성민 섹스");
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		});
		
		 System.out.println(mainThread.getName());
	}
	
	
}
