package abstractEx;

public class Test {

	public static void main(String[] args) {
//		A a = new A(); 
		A a;
		// �߻� class�� ��ü ���� �� �� ����~~~
		// �ٵ� �������� ������ �� �� �ִ�~~

		B b = new B();
		b.methodA();
		a = new B(); // �ڵ� ����ȯ (���� <- ����)
		a.methodA();

	}

}
