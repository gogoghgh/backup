package interfaceEx;

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		A a = new C(); // Ÿ�� ��ȯ ������
		a.methodA();
		A b = (A) new C(); // �� �� �ٿ���,,
		b.methodA();

		B d = new C();
		d.methodB();

//		C e = (C) new B();

	}

}
