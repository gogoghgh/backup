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
		setLayout(null); // �������� �����̰� �����״� null�� ����,, -> �ȿ� �� �ֵ� ��ġ, ������ �������ֱ�
		
		JLabel lbl = new JLabel("��´�");
		lbl.setLocation(50, 50);
		lbl.setSize(100, 20);
		p.add(lbl); // ���� lbl panel�� ���� ���̱�
		p.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				switch (keyCode) {
				case 37: // ���� �̵�
					lbl.setLocation(lbl.getX()-10, lbl.getY());
					break; //    �������� 10px �̵�(x),  y�� �״��
				
				case 38: // ���� �̵� 
					lbl.setLocation(lbl.getX(), lbl.getY()-10);
					break;
				case 39: // ������ �̵� 
					lbl.setLocation(lbl.getX()+10, lbl.getY());
					break;
				case 40: // �Ʒ��� �̵�
					lbl.setLocation(lbl.getX(), lbl.getY()+10);
					break;
				
				default:
				}// switch
			}
			
		});
		
		setSize(500, 500);
		setVisible(true);
		
		// �� �� ������
		p.setFocusable(true);
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new FlyingTextEx(); // ��ü ����
	}

}