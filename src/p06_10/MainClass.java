package p06_10;

public class MainClass {
//	�ڹٰ� ������� ������ ���� �޼���~~ =���� �޼���
//	��Դ´� = �޸𸮿� �ø���!!
	public static void main(String[] args) {
		System.out.println("Student Class---------------------------");
		Student s1; // s1�� Student Ÿ���̴�~~~ "s1 ���� ����"
		s1 = new Student(); // �޸𸮿� �÷��ִ� �۾�(="��ü ����" = ����� �� �ְ� �޸𸮿� �ø���)
//			�޸𸮿� �ö󰬰�~~
		s1.address = "�λ�� ������";
		s1.grade = 1;
		s1.studentID = 1;
		s1.studentName = "������";
//			student Ŭ���� �����ϰ� -> ���赵 ���� ���� �ͼ� -> ���ο��� ��ü �����ؼ� ����ؾ� ��

		System.out.println("�ּ�: " + s1.address);
		System.out.println("�г�: " + s1.grade);
		System.out.println("ID: " + s1.studentID);
		System.out.println("�̸�: " + s1.studentName);
		System.out.println();

		Student s2 = new Student();
		s2.address = "�λ�� ����";
		s2.grade = 3;
		s2.studentID = 2;
		s2.studentName = "�����";
		System.out.println("�ּ�: " + s2.address);
		System.out.println("�г�: " + s2.grade);
		System.out.println("ID: " + s2.studentID);
		System.out.println("�̸�: " + s2.studentName);
		System.out.println();

		System.out.println("Person Class-----------------------------------");
		Person p1 = new Person();
		p1.gender = '��';
		p1.height = 159;
		p1.married = false;
		p1.name = "������";
		p1.weight = 55;
		System.out.println("����: " + p1.gender);
		System.out.println("Ű: " + p1.height);
		System.out.println("��ȥ: " + p1.married);
		System.out.println("�̸�: " + p1.name);
		System.out.println("������: " + p1.weight);
		System.out.println();

		Person p2 = new Person();
		p2.gender = '��';
		p2.height = 163;
		p2.married = true;
		p2.name = "�����";
		p2.weight = 45;
		System.out.println("����: " + p2.gender);
		System.out.println("Ű: " + p2.height);
		System.out.println("��ȥ: " + p2.married);
		System.out.println("�̸�: " + p2.name);
		System.out.println("������: " + p2.weight);
		System.out.println();

		System.out.println("�޼��� ��Ա�------------------------");
		s1.printName(); // �޼��� ȣ��~~~ �� ���ϰ� ���� void Ÿ��
		s2.printName();

	}

}
