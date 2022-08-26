package thread;

import java.util.Random;

import javax.swing.JOptionPane;

public class ThreadEx1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(9) + 1; // 0부터 시작이니까
		int num2 = rand.nextInt(9) + 1;

		// 카운트다운~~~
//		for (int i = 10; i > 0; i--) {
//			try {
//				Thread.sleep(1000); // 1000milliseconds = 1초 잠시 쉬는
//				System.out.println(i + "........"); // 10->9->8->... ->1
//				
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		// 카운트다운 + dialog 동시에 하고 싶은데... --> 스레드!!!!로 하면 됨
		// 하나의 프로그램 안에, cpu로부터 시간을 할당 받는다고???

		// 카운트다운을 스레드로 만들기
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					try {
						Thread.sleep(1000);
						System.out.println(i + "...");
					} catch (InterruptedException e) {
						// 구구단 문제 결과 나오면 멈추도록~~~ 
						break;
					} // t-c
				} // for
			} // run
		});

		t1.start();

		// dialog ... 람다식으로...... 얘는 스레드로 안 해도 ㅇㅋ넴,,
//		Thread t2 = new Thread(()-> {		});

		// dialog로 구구단 질문~~
		String result = JOptionPane.showInputDialog(num1 + " * " + num2 + " = ?");
		System.out.println("입력한 답: " + result);
		
		int answer = num1 * num2;
		
		if (Integer.parseInt(result) == answer) {
			System.out.println("정답입니다^^");
		} else {
			System.out.println("오답 ㅠ");
		}
		
		t1.interrupt(); // 정답 맞추면 카운팅 멈추게

	} // main

} // class
