package p06.p06_20;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); // serial ++
		studentLee.setStudentName("������");
//		System.out.println(studentLee.serialNum); // static ���� = Ŭ���� ����~~�ϱ�,, �̷��� �� ����
		System.out.println(Student.serialNum); // �̷��� ����!!!
		System.out.println(studentLee.studentName + "  �й�: " + studentLee.studentID);

		Student studentSon = new Student(); // serial ++
		studentSon.setStudentName("�ռ���");
		System.out.println(Student.serialNum); // 1002
		System.out.println(studentSon.studentName + "  �й�: " + studentSon.studentID);

		Student studentYou = new Student(); // serial ++
		studentYou.setStudentName("������");
		System.out.println(Student.serialNum); // 1003
		System.out.println(studentYou.studentName + "  �й�: " + studentYou.studentID);
		// static ����� ����, �����������ٴ� <<< Ŭ������.static �̸�~~ ���� ����ϱ�!! �̰� �´�~~

	}

}
