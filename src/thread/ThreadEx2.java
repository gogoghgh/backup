package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.setDaemon(true);
		t2.setDaemon(true);

//		t1.run(); // run�ϸ� ��,, ���� �޼��� ���پ� �������� �װŶ� �Ȱ���
//		t2.run();
		
		t1.start(); // start�� �ؾ� ������ó�� ���۵Ǵ°ű�~ �˾�è
		t2.start();

		System.out.println("main  ����");
	}

}

////////////////////////////////////////////////////
class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + (i + 1) + "] GoGoSing");
			
			// �ʹ� ����^^;; 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + (i + 1) + "] Come on~~~");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}