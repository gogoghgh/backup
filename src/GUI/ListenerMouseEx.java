package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerMouseEx extends JFrame {
	public ListenerMouseEx() {
		setTitle("test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		JButton btn = new JButton("Mouse Event Test Button");
		btn.setBackground(Color.LIGHT_GRAY);
		btn.addMouseListener(new MouseListener() {  // new MouseListener 입력하고 ctrl + space!! 
			
			@Override
			public void mouseExited(MouseEvent e) {
				btn.setBackground(Color.LIGHT_GRAY);
				System.out.println("EXIT");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setBackground(Color.pink);
				System.out.println("pink입니다 ㅎ");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {}  // 필요 없는 것들은 이렇게~ 몰아놓고~~ ,,, ㅎ
		});
		add(btn);
		
		setSize(500, 500);
		setVisible(true);
		
//		MyMouseListener listener = new MyMouseListener();
//		btn.addMouseListener(listener);
//		add(btn);
	}
// -------------------------------------------------
	public static void main(String[] args) {
		new ListenerMouseEx();
	}

} //ListenerMouseEx class

// -----------------------------------------------------------------
//class MyMouseListener implements MouseListener {
//	@Override
//	public void mouseEntered(MouseEvent e) {
//		JButton btn = (JButton)e.getSource(); // down casting.. Object type -> JButton
//		btn.setBackground(Color.pink);
//	}
//	
//	@Override
//	public void mouseExited(MouseEvent e) {
//		JButton btn = (JButton)e.getSource();
//		btn.setBackground(Color.gray);
//	}
//	
//	@Override
//	public void mousePressed(MouseEvent e) {}
//	
//	@Override
//	public void mouseClicked(MouseEvent e) {}
//	
//	@Override
//	public void mouseReleased(MouseEvent e) {}
//}