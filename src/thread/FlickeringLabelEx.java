package thread;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabelEx extends JFrame {

	FlickeringLabelEx() {
		setTitle("myLabel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(new FlickeringLabel("����")); // ������
		add(new JLabel("����X"));
		add(new FlickeringLabel("���⵵ ����")); // ������

		setSize(500, 300);
		setVisible(true);
	}

	/////////////////// ���� ///////////////////////
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

} // FlickeringLabelEx

////////////////////////////////////////////////////
// ������� �����~~~~~~
class FlickeringLabel extends JLabel implements Runnable {
	// ���̺� ��ӹ޾ұ� ������ ��� ���̺�,,
	// �θ�� �ϳ��ۿ� �� ���ϱ�,,, Runnable�� implements �� ��!! 
	// �θ� ���� ���� �����ϱ�~~~

	// �����ڿ� �⺻ ���� �־��ֱ�
	FlickeringLabel(String text) {
		super(text);
		setOpaque(true); // �������ϰ� ����ڴ�
		Thread t1 = new Thread(this);
		t1.start(); // == run�޼��� ����
	}

	@Override
	public void run() {
		int n = 0; // n= 0 == yellow .... n=1 == green...

		// �� �����ϰ� �ٲܰŶ� ���� ���̺귯�� ����
		// while�� ���� ����
		Random rand = new Random();
		
		// ���Ѵ�� ���鼭 ��� -> �ʷ� -> �� -> �� -> ...���� �ݺ�
		while (true) {
			int r = rand.nextInt(256);
			int g = rand.nextInt(256);
			int b = rand.nextInt(256);
			
			if (n == 0) {
//				setBackground(Color.yellow);  // ��
				setBackground(new Color(r, g, b)); // ��
				n = 1;
				System.out.print("r: " + r + " / ");
				System.out.print("g: " + g + " / ");
				System.out.println("b: " + b + " / ");
			} else {
//				setBackground(Color.green);
				setBackground(new Color(r, g, b)); // ��
				n = 0;
				System.out.print("r: " + r + " / ");
				System.out.print("g: " + g + " / ");
				System.out.println("b: " + b + " / ");
			}

			// �ð��� �ֱ� ����
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try-catch

		} // while
	}// run()

}// FlickeringLabel