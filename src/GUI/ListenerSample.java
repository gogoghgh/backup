package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListenerSample extends JFrame {

	ListenerSample() {
		setTitle("���� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		// ���̷��԰� �ʼ� 4����!!

		setLayout(new FlowLayout()); // flow layout: ����������,, frame�� add�ϴ� ��ŭ ��~~~ �þ
//		add(new JButton("��"));
//		add(new JButton("��"));
//		add(new JButton("��"));
//		add(new JButton("��"));
//		add(new JButton("��"));
//		add(new JButton("��"));
//		add(new JButton("��"));

		JButton btn1 = new JButton("Action");

		add(btn1);

		// ��ư���ٰ� �� �׼� �����ʸ� �����ϰڴ�~ add�ϰڴ�~
		btn1.addActionListener(new ActionListener() { // 4. �͸� ���� Ŭ���� �Ἥ �ٷ� ����!!
														// actionlistener �������̽� ctrl space �ϴϱ� �ٷ� Ʋ ������,,
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = btn1.getText(); // btn1�� ��������,, btn1�� ���� �ִ� text���� ������ ��
				if (s.equals("Action")) {
					btn1.setText("�׼�...^^");
				} else
					btn1.setText("Action");
//				System.out.println("s: " + s);
			}
		});

	}

	public static void main(String[] args) {
		new ListenerSample();
	}

}
