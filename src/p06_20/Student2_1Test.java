package p06_20;

public class Student2_1Test {

	public static void main(String[] args) {
		Student2_1 studentLee = new Student2_1(); // serial ++
		studentLee.setStudentName("������");
//		System.out.println(studentLee.serialNum); // static ���� = Ŭ���� ����~~�ϱ�,, �̷��� �� ����
		System.out.println(Student2_1.serialNum); // �̷��� ����!!!
		System.out.println(studentLee.studentName + "  �й�: " + studentLee.studentID);

		Student2_1 studentSon = new Student2_1(); // serial ++
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2_1.serialNum); // 1002
		System.out.println(studentSon.studentName + "  �й�: " + studentSon.studentID);

		Student2_1 studentYou = new Student2_1(); // serial ++
		studentYou.setStudentName("������");
		System.out.println(Student2_1.serialNum); // 1003
		System.out.println(studentYou.studentName + "  �й�: " + studentYou.studentID);
		// static ����� ����, �����������ٴ� <<< Ŭ������.static �̸�~~ ���� ����ϱ�!! �̰� �´�~~

	}

}
