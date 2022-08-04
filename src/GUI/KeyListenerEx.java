package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame { // for GUI,, JFrame 꼭 상속
	
	KeyListenerEx(){ // 생성자에 구현
		// set~~ 4가지 기본 메서드 구현
		setTitle("타이틀입니다");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		setContentPane(p);
		// setLayout(new FlowLayout()); 
			// 늘어나는 만큼 알아서 쫙~~ 배치해주는,,? 근데 JPanel은 flow layout이 디폴트값이라,, 굳이 필요 없음
		
		JLabel lbl1 = new JLabel("getKeyCode()");
		JLabel lbl2 = new JLabel("getKeyChar()");
		JLabel lbl3 = new JLabel("getKeyText()");
		
		lbl1.setOpaque(true); // 투명하게,,
		lbl2.setOpaque(true);
		lbl3.setOpaque(true);
		
		lbl1.setBackground(Color.pink); // 배경색 넣기 
		lbl2.setBackground(Color.orange);
		lbl3.setBackground(Color.green);
		
		// key event
//		p.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {}
//		}
		
		p.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				char keyChar = e.getKeyChar();
				String keyText = e.getKeyText(keyCode);
				
				lbl1.setText(keyCode+""); // int + "" -> String 되니까^^
				lbl2.setText(keyChar+"");
				lbl3.setText(keyText);
			}
			
		});
		
		p.add(lbl1);
		p.add(lbl2);
		p.add(lbl3);
		
		setSize(500, 300);
		setVisible(true);
		
		// 이 두 개 쌍으로,, 
		p.setFocusable(true);
		p.requestFocus();
		
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	} // main
} // KLE class