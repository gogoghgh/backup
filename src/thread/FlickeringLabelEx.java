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
		add(new FlickeringLabel("깜빡")); // 스레드
		add(new JLabel("깜빡X"));
		add(new FlickeringLabel("여기도 깜빡")); // 스레드

		setSize(500, 300);
		setVisible(true);
	}

	/////////////////// 메인 ///////////////////////
	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

} // FlickeringLabelEx

////////////////////////////////////////////////////
// 스레드로 만들기~~~~~~
class FlickeringLabel extends JLabel implements Runnable {
	// 레이블 상속받았기 때문에 얘는 레이블,,
	// 부모는 하나밖에 못 오니까,,, Runnable을 implements 한 것!! 
	// 부모가 둘일 수는 없으니까~~~

	// 생성자에 기본 정보 넣어주기
	FlickeringLabel(String text) {
		super(text);
		setOpaque(true); // 불투명하게 만들겠다
		Thread t1 = new Thread(this);
		t1.start(); // == run메서드 실행
	}

	@Override
	public void run() {
		int n = 0; // n= 0 == yellow .... n=1 == green...

		// 색 랜덤하게 바꿀거라서 랜덤 라이브러리 생성
		// while문 위에 쓰기
		Random rand = new Random();
		
		// 무한대로 돌면서 노랑 -> 초록 -> 노 -> 초 -> ...무한 반복
		while (true) {
			int r = rand.nextInt(256);
			int g = rand.nextInt(256);
			int b = rand.nextInt(256);
			
			if (n == 0) {
//				setBackground(Color.yellow);  // 구
				setBackground(new Color(r, g, b)); // 신
				n = 1;
				System.out.print("r: " + r + " / ");
				System.out.print("g: " + g + " / ");
				System.out.println("b: " + b + " / ");
			} else {
//				setBackground(Color.green);
				setBackground(new Color(r, g, b)); // 신
				n = 0;
				System.out.print("r: " + r + " / ");
				System.out.print("g: " + g + " / ");
				System.out.println("b: " + b + " / ");
			}

			// 시간차 주기 위해
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // try-catch

		} // while
	}// run()

}// FlickeringLabel