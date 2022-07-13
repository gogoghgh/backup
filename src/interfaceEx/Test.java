package interfaceEx;

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		A a = new C(); // Å¸ÀÔ º¯È¯ °¡³ÕÇÑ
		a.methodA();
		A b = (A) new C(); // °Á ÇÔ ºÙ¿©º½,,
		b.methodA();

		B d = new C();
		d.methodB();

//		C e = (C) new B();

	}

}
