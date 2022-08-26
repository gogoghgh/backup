package thread;

public class ThreadEx4 {

	public static void main(String[] args) { // ���� ������
		Thread t1 = new Thread(new Runnable() { // t1 ������  --> ������ �� 2���� ���鼭~

			@Override
			public void run() {
				for (int i = 100; i <= 110; i++) {
					System.out.println(Thread.currentThread().getName() + " / i: " + i);

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // t-c

				} // for
			} // run
		});
		
		t1.start();
		
		// join �޼���
		try {
			t1.join(); // ������ t1.join() �����Ŵ.. ������ ������
						// main: t1 �ϰ� ���� ������ ��ٸ���,, �� ������ �� �Ұ�
		} catch (Exception e) {	}
		
		
		for(int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName() + " / i: " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // t-c
		}
		

	} // main

}
