package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // ����Ÿ���� Runnable�� �޼���
		int num = 100; // �������� i, num

			// 3. ���� ���� Ŭ����...... �޼��� �ȿ� ��ġ��
			class MyRunnable implements Runnable {
				int localNum = 10; // ���� ���� Ŭ������ �ν��Ͻ� ����
	
				@Override
				public void run() {
//					num = 200; // �������������� ��final~~ ����ڷ� �ٲ�Ƿ� ���� ������ �� �����ڡ�
//					i = 100; // �ڸŰ����� i�� ���� ����ó�� �ڻ��!!�ڷ� �ٲ�Ƿ� ���� ������ �� �����ڡ�
					System.out.println("i: " + i); // �� �ִ´�� ���~
					System.out.println("num: " + num);
					System.out.println("localNum: " + localNum); // ���� ���� Ŭ������ �ν��Ͻ� ����
					System.out.println("outNum: " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
					System.out.println("Outer.sNum: " + Outer.sNum + "(�ܺ� Ŭ���� ���� ����)");
				}// run
			}// MyRunnable class
		return new MyRunnable();  // ����Ÿ���� Runnable�� �޼���!!
									// MyRunnable  <-- implements -- Runnable
									// ��								߾ 
									// �ڵ�����ȯ~ upcasting~~ �Ǵϱ� ������
	}// getRunnable Method
}// Outer class

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);   // �޼��� ȣ��
		runner.run();
	}
}