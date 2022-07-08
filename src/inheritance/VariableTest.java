package inheritance;

public class VariableTest {
	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		System.out.print("c.jump(): ");
		c.jump();
		System.out.print("p.jump(): ");
		p.jump();

		// �ڵ�����ȯ = upcasting
		Parent p2 = new Child();
		System.out.print("p2.jump(): ");
		p2.jump(); // p.jump(), c.jump() �� �� ����? �޸𸮿� �ö� ������ �����Ѵ�!!
					// child���� �����ǵ� c.jump~~ ����,, �׸����� ���÷����� p1�� �������� �ּҰ��� �����µ� Child �ν��Ͻ� ����Ű�� ��

		// ��������ȯ = downcasting
		Child c2 = (Child) p2; // Child ����Ű�� �ִ� p2�� '�ּҰ�'�� -> c2�� �����Ϸ��ϱ�,, Child�� ��������ȯ�ؼ�!!

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
		System.out.println("����~~!~!!");
	}

}

class Child extends Parent {

	@Override
	void jump() {
		System.out.println("���� ����~!!~!!");
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
