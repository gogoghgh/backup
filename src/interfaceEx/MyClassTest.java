package interfaceEx;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		// mClass(����) -> ���� �������̽� X������ �����ϸ�
		// �������̽� X�� ������ �޼��常 ȣ�� ����.. �������
		System.out.println();
		
		Y yClass = mClass;
		yClass.y();
		// mClass(����) -> ���� �������̽� Y������ �����ϸ�
		// �������̽� Y�� ������ �޼��常 ȣ�� ����
		System.out.println();
		
		MyInterface iClass = mClass;
		iClass.myMethod(); //MyInterface �����ϱ� ��� ����
		iClass.x(); // X, Y ��ӹ޾����� ����
		iClass.y();
		// mClass -> ������ �������̽��� ����(iClass)�� �����ϸ�
		// �������̽��� ����� ��� �޼��� ȣ�� ����
	}

}
