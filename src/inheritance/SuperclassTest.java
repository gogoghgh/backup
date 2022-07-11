package inheritance;

public class SuperclassTest {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.toString());
		System.out.println(sub.hashCode());
		System.out.println(sub.equals(sub));
		System.out.println(sub.getClass());
		System.out.println("sub.valueSub: " + sub.valueSub + ", sub.valueSuper: " + sub.valueSuper);
		sub.methodSub();
		sub.methodSuper();

		Super s1 = new Sub();
		s1.valueSuper = 500;
		// s1.valueSub = 600; s1은 상위 타입이라,, 하위 Sub 타입에서 쓸 수 있는 멤버 개수가 다르다~
		s1.methodSuper();

		sub = (Sub) s1; // 수동 형변환 = down casting ... 상위 -> 하위로,,
		sub.methodSub();
		sub.methodSuper();
//		Sub s2 = (Sub)(new Super()); // 수동 형변환, 다운캐스팅...  //오류!! 메모리 할당받은 게 없어서

		if (sub instanceof Sub) {
			System.out.println("sub는 Sub타입");
		}
		if (s1 instanceof Sub) {
			System.out.println("s1 == Sub타입");
		}
		if (sub instanceof Super) {
			System.out.println("sub == Super타입");
		}
		if (s1 instanceof Super) {
			System.out.println("s1 == Super타입");
		}
		if (s1 instanceof Object) {
			System.out.println("s1 == Object타입");
		}

	}

}

class Super {
	Super(int valueSuper) {
		this.valueSuper = valueSuper;
	} // 매개변수 있는! 생성자 만들었다면
		// 디폴트 생성자 걍 무조건 같이 만들어놓기!!! 습관처럼

	Super() {
		System.out.println("슈퍼생성자");
	}

	int valueSuper = 200;

	void methodSuper() {
		System.out.println("슈퍼메서드 실행");
	}
}

class Sub extends Super {
	// Sub(){ super(); } // 우리 눈에는 안 보이지만 자동적으로 생겨나는 생성자^^
	int valueSub = 300;

	void methodSub() {
		System.out.println("서브메서드 실행");
	}

	@Override
	void methodSuper() {
		System.out.println("슈퍼메서드 재정의 실행");
	}
}