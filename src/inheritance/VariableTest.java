package inheritance;

public class VariableTest {
	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		System.out.print("c.jump(): ");
		c.jump();
		System.out.print("p.jump(): ");
		p.jump();

		// 자동형변환 = upcasting
		Parent p2 = new Child();
		System.out.print("p2.jump(): ");
		p2.jump(); // p.jump(), c.jump() 중 뭐 실행? 메모리에 올라간 점프를 실행한다!!
					// child에서 재정의된 c.jump~~ 실행,, 그림으로 떠올려보삼 p1은 참조변수 주소값을 가지는데 Child 인스턴스 가리키는 중

		// 수동형변환 = downcasting
		Child c2 = (Child) p2; // Child 가리키고 있는 p2의 '주소값'을 -> c2에 대입하려니까,, Child로 수동형변환해서!!

//		c.method();
//		System.out.println();
//		
//		c.methodChild();
//		System.out.println();
	}

}

class Parent {
//	String x = "parent";

	void jump() {
		System.out.println("점프~~!~!!");
	}

}

class Child extends Parent {

	@Override
	void jump() {
		System.out.println("점프 점프~!!~!!");
	}

//	String x = "child";

//	void method() {
//		String x = "local";
//		System.out.println("x: " + x);
//		System.out.println("this.x: " + this.x);
//		System.out.println("super.x: " + super.x);
//	}
//	
//	void methodChild() {
//		System.out.println("x: " + x);
//		System.out.println("super.x: " + super.x);
//	}

}
