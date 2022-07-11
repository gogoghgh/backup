package abstractEx;

public class Test {

	public static void main(String[] args) {
//		A a = new A(); 
		A a;
		// 추상 class는 객체 생성 할 수 없다~~~
		// 근데 참조변수 선언은 할 수 있다~~

		B b = new B();
		b.methodA();
		a = new B(); // 자동 형변환 (상위 <- 하위)
		a.methodA();

	}

}
