package innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // 리턴타입이 Runnable인 메서드
		int num = 100; // 지역변수 i, num

			// 3. 지역 내부 클래스...... 메서드 안에 위치함
			class MyRunnable implements Runnable {
				int localNum = 10; // 지역 내부 클래스의 인스턴스 변수
	
				@Override
				public void run() {
//					num = 200; // ★지역변수덜은 ★final~~ 상수★로 바뀌므로 값을 변경할 수 없음★★
//					i = 100; // ★매개변수 i도 지역 변수처럼 ★상수!!★로 바뀌므로 값을 변경할 수 없음★★
					System.out.println("i: " + i); // 걍 있는대로 써라~
					System.out.println("num: " + num);
					System.out.println("localNum: " + localNum); // 지역 내부 클래스의 인스턴스 변수
					System.out.println("outNum: " + outNum + "(외부 클래스 인스턴스 변수)");
					System.out.println("Outer.sNum: " + Outer.sNum + "(외부 클래스 정적 변수)");
				}// run
			}// MyRunnable class
		return new MyRunnable();  // 리턴타입이 Runnable인 메서드!!
									// MyRunnable  <-- implements -- Runnable
									// 下								上 
									// 자동형변환~ upcasting~~ 되니까 ㅇㅋ임
	}// getRunnable Method
}// Outer class

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);   // 메서드 호출
		runner.run();
	}
}