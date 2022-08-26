package thread;

import java.util.Random;

import javax.swing.JOptionPane;

public class ThreadEx1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(9) + 1; // 0���� �����̴ϱ�
		int num2 = rand.nextInt(9) + 1;

		// ī��Ʈ�ٿ�~~~
//		for (int i = 10; i > 0; i--) {
//			try {
//				Thread.sleep(1000); // 1000milliseconds = 1�� ��� ����
//				System.out.println(i + "........"); // 10->9->8->... ->1
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		// ī��Ʈ�ٿ� + dialog ���ÿ� �ϰ� ������... --> ������!!!!�� �ϸ� ��
		// �ϳ��� ���α׷� �ȿ�, cpu�κ��� �ð��� �Ҵ� �޴´ٰ�???

		// ī��Ʈ�ٿ��� ������� �����
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					try {
						Thread.sleep(1000);
						System.out.println(i + "...");
					} catch (InterruptedException e) {
						// ������ ���� ��� ������ ���ߵ���~~~ 
						break;
					} // t-c
				} // for
			} // run
		});

		t1.start();

		// dialog ... ���ٽ�����...... ��� ������� �� �ص� ������,,
//		Thread t2 = new Thread(()-> {		});

		// dialog�� ������ ����~~
		String result = JOptionPane.showInputDialog(num1 + " * " + num2 + " = ?");
		System.out.println("�Է��� ��: " + result);
		
		int answer = num1 * num2;
		
		if (Integer.parseInt(result) == answer) {
			System.out.println("�����Դϴ�^^");
		} else {
			System.out.println("���� ��");
		}
		
		t1.interrupt(); // ���� ���߸� ī���� ���߰�

	} // main

} // class
