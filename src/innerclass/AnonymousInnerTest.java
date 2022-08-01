package innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		// MyRunnable 클래스 이름을 빼고!! 클래스를 바로 생성하는 방법
		// 4. 익명 내부 클래스.. Runnable 인터페이스 생성
		return new Runnable() {
			@Override
			public void run() {
//				num=200; // Local variable num defined in an enclosing scope must be final or effectively final
//				i=10;    // 지역변수들은 final,,,, 
				System.out.println("i: " + i);
				System.out.println("num: " + num); 
			} // run() 
		};  // Runnable class
	}// getRunnable

	// 인터페이스나 추상 클래스형 변수를 선언하고, 클래스를 생성해 대입하는 방법
	Runnable runner = new Runnable() { // 익명 내부 클래스를 변수에 대입
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수,, run()메서드");
		}
	}; // Runnable runner.... 클래스 끝에 ;를 씀
}//Outer2 class


public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}