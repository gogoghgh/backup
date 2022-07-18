package object;
// clone() �޼���� �ν��Ͻ� �����ϱ�

class Point { // ������ �ǹ��ϴ� Point Ŭ����
	int x;
	int y;

	// ������
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
	}

	@Override
	public String toString() {
		return "x = " + x + ",  y = " + y;
	}
} // Point class

class Circle implements Cloneable { // �ڡڡ� ��ü�� �����ص� �ȴٴ� �ǹ̷�
									// cloneable �������̽�(=mark interface.. �� ��..)�� �Բ� ����
	Point point; // Point�� �������� point
	int radius; // ������..

	// ������
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}

	// overriding
	@Override
	public String toString() {
		return "������ " + point + "�̰�,  �������� " + radius + "�Դϴ�";
	}

	@Override // Object�� ���ϵ�
	protected Object clone() throws CloneNotSupportedException { // clone()�޼��� ����� �� �߻��� �� �ִ� ������.. ���� ó��
		return super.clone(); // super = Object class,, �� Ŭ�� �޼��� ���ݾ� �װ� �� �״�� ��� ��
								// circle.clone() -> circle �ּҰ� ī��~~
	}

} // Circle class

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException { // clone()�޼��� ����� �� �߻��� �� �ִ� ������.. ���� ó��
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		// clone() �޼��� ����ؼ� circle �ν��Ͻ��� -> copyCircle�� ������
		// �ڡ� (Circle) �ٿ��� �ٿ�ĳ����!! �ֳĸ� clone�� ���� Object ���̶�,,

		System.out.println("circle: " + circle);
		System.out.println("copyCircle: " + copyCircle);
		System.out.println();
		System.out.println("System.identityHashCode(circle): " + System.identityHashCode(circle));
		System.out.println("System.identityHashCode(copyCircle): " + System.identityHashCode(copyCircle));
	}

}
