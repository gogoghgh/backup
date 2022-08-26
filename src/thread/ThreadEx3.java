package thread;

public class ThreadEx3 {

	public static void main(String[] args) {
//		Thread t1 = new Thread(new MyRunnable1());
//		Thread t2 = new Thread(new MyRunnable2());
//		t1.start();
//		t2.start();
		
		Thread t1 = new Thread(() -> { //람다식으로
				for (int i = 0; i < 10; i++) {
					System.out.println("[" + (i + 1) + "] GO");

						// 너무 빨라서^^;;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}//try-catch
				}//for
		});
		
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("[" + (i + 1) + "] Come");
					
						// 너무 빨라서^^;;
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}//try-catch
				}//for
			}//run
		});
		
		t1.start();
		t2.start();
		
	}//main

}

/////////////////////////////////////////////////////////

class MyRunnable1 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + (i + 1) + "] GO");

			// 너무 빨라서^^;;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + (i + 1) + "] Come");

			// 너무 빨라서^^;;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
