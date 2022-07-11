package abstractEx;

public abstract class A {

	abstract void methodA(); /* { Abstract methods do not specify a body} */

}

class B extends A {
	@Override
	void methodA() {
		System.out.println("재정의 메서드A");
	}

}