package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx extends JFrame {
	FlyingTextEx(){
		setTitle("flying");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		setContentPane(p);
		setLayout(null); // 동적으로 움직이게 만들테니 null로 지정,, -> 안에 들어갈 애들 위치, 사이즈 결정해주기
		
		JLabel lbl = new JLabel("잠온다");
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		p.add(lbl); // 만든 lbl panel에 갖다 붙이기
		p.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case 37: // 왼쪽 이동
					lbl.setLocation(lbl.getX()-10, lbl.getY());
					break; //    왼쪽으로 10px 이동(x),  y는 그대로
				
				case 38: // 위쪽 이동 
					lbl.setLocation(lbl.getX(), lbl.getY()-10);
					break;
				case 39: // 오른쪽 이동 
					lbl.setLocation(lbl.getX()+10, lbl.getY());
					break;
				case 40: // 아래쪽 이동
					lbl.setLocation(lbl.getX(), lbl.getY()+10);
					break;
				
				default:
				}// switch
			}
			
		});
		
		setSize(500, 500);
		setVisible(true);
		
		// 두 개 쌍으로
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new FlyingTextEx(); // 객체 생성
	}

}