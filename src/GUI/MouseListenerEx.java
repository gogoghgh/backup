package GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListenerEx extends JFrame {
	// JFrame,, ȭ�鿡 �������� �Ƕ���!! (menu bar ���� + content pane �������� �����Ǿ� ����)
	MouseListenerEx() {
		// �����ڿ� �� 4���� �ֱ�~!! �⺻ �⺻
		// 1.setTitle   2.setDefaultCloseOperation   3.setSize   4.setVisible
		setTitle("�׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // jframe X ��ư ������~~ // �� JFrame. �� �ϰ� �ٷ� �ص� ����?
		JPanel panel = new JPanel(); // frame ���� panel�� �������,,,
		JLabel lbl = new JLabel("���� ����~~~"); // frame ���� -> panel ���� -> label ���� ���̱�
											// ���������� final�� ������... �� �� �ٲ� .... 
											// �͸� Ŭ�������� �������� ����� ���� final!!! 
		panel.addMouseListener(new MouseListener() {  // �͸� Ŭ������ MouseListener �������̽� ����,,
							// new MouseAdapter() -> �ϸ� �� ���� �޼���� �� ��� �� 
			@Override
			public void mousePressed(MouseEvent e) {
				//���콺�� ������? ����ڰ� Ŭ���� ��ġ�� �˾ƿ���(OS�� ���� ��������)!!
				int x = e.getX(); // ����ڰ� ����(press) x�� ��ǥ �˾ƿͼ� -> int x ������ ����
				int y = e.getY(); // ����ڰ� ����(press) y�� ��ǥ �˾ƿͼ� -> int y ������ ����
				lbl.setLocation(x, y); // OS�κ��� �Ѱܹ��� x, y���� -> �츮�� ���� label ��ġ�� ����
										// �׷��� ���콺�� Ŭ���ϴ� ������ ���� label�� ����ٴ�`~~
			}
			// �� ���� �޼���� ^^;; 
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}			
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {}
		});  // addMouseListener �޼��� ��
		setContentPane(panel);
		setLayout(null); 
			// null ���̾ƿ��� ��쿡��, ���� ��ǥ(setLocation)�� ũ��(setSize) ������ ������� ��!! 
			// ��������,, ����: ������ ��ġ ���� ����
		lbl.setLocation(50, 50); // ���� ��ǥ
		lbl.setSize(100, 20); // label ũ��
		panel.add(lbl);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MouseListenerEx();

	}// main
}// MLE class