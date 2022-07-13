package interfaceEx;

public interface A {
	// 인터페이스 구성요소
	// 상수 +멤버변수
	// 추상메서드 +default 메서드, static 메서드 +private 메서드
	abstract void methodA(); // abstract 생략 가능한
}

interface B {
	void methodB();
}

class D {
}

class C extends D implements A, B { // 여러 인터페이스 한번에 구현 가능
	@Override
	public void methodA() {
		System.out.println("methodA 오버라이딩");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 오버라이딩");
	}

}