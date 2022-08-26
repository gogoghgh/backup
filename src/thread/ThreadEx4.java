package thread;

public class ThreadEx4 {

	public static void main(String[] args) { // 메인 스레드
		Thread t1 = new Thread(new Runnable() { // t1 스레드  --> 스레드 총 2개가 돌면서~

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
		
		// join 메서드
		try {
			t1.join(); // 메인이 t1.join() 실행시킴.. 메인이 주최자
						// main: t1 니가 끝날 때까지 기다릴게,, 니 끝나고 내 할게
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
