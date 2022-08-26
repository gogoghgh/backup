package thread;

public class ThreadEx2 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.setDaemon(true);
		t2.setDaemon(true);

//		t1.run(); // run하면 걍,, 메인 메서드 한줄씩 내려가는 그거랑 똑같음
//		t2.run();
		
		t1.start(); // start로 해야 스레드처럼 동작되는거군~ 알아챔
		t2.start();

		System.out.println("main  종료");
	}

}

////////////////////////////////////////////////////
class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + (i + 1) + "] GoGoSing");
			
			// 너무 빨라서^^;; 
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