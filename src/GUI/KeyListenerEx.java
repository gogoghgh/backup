package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListenerEx extends JFrame { // for GUI,, JFrame �� ���
	
	KeyListenerEx(){ // �����ڿ� ����
		// set~~ 4���� �⺻ �޼��� ����
		setTitle("Ÿ��Ʋ�Դϴ�");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		setContentPane(p);
		// setLayout(new FlowLayout()); 
			// �þ�� ��ŭ �˾Ƽ� ��~~ ��ġ���ִ�,,? �ٵ� JPanel�� flow layout�� ����Ʈ���̶�,, ���� �ʿ� ����
		
		JLabel lbl1 = new JLabel("getKeyCode()");
		JLabel lbl2 = new JLabel("getKeyChar()");
		JLabel lbl3 = new JLabel("getKeyText()");
		
		lbl1.setOpaque(true); // �����ϰ�,,
		lbl2.setOpaque(true);
		lbl3.setOpaque(true);
		
		lbl1.setBackground(Color.pink); // ���� �ֱ� 
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
				
				lbl1.setText(keyCode+""); // int + "" -> String �Ǵϱ�^^
				lbl2.setText(keyChar+"");
				lbl3.setText(keyText);
			}
			
		});
		
		p.add(lbl1);
		p.add(lbl2);
		p.add(lbl3);
		
		setSize(500, 300);
		setVisible(true);
		
		// �� �� �� ������,, 
		p.setFocusable(true);
		p.requestFocus();
		
	}
	
	public static void main(String[] args) {
		new KeyListenerEx();
	} // main
} // KLE class