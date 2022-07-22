package classEx;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// forName() �޼��忡�� �߻��ϴ� ���ܸ� ó����.. �̸��� ��ġ�ϴ� Ŭ������ ���� ��� ClassNotFoundException �߻�
		Person person = new Person();
		// Object�� getClass()�޼��� ����ϱ�
		Class pClass1 = person.getClass();
		System.out.println("pClass1.getName(): " + pClass1.getName());

		// ���� class ���� �����ϱ�
		Class pClass2 = Person.class;
		System.out.println("pClass2.getName(): " + pClass2.getName());

		// Ŭ���� �̸����� ��������
		Class pClass3 = Class.forName("classEx.Person"); // ���⼭ �̸� Ʋ���� ������ ���� �߻�~ ClassNotFoundException
		System.out.println("pClass3.getName(): " + pClass3.getName());
	}

}
