package p06_20;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2(); // serialNum ++
		studentLee.setStudentName("������");
		System.out.println(Student2.getSerialNum());
		// serialNum ���� �������� ���� get() �޼��带 Ŭ���� �̸����� ���� ȣ��
		// ��ġ��ġ,, �ƹ�����,, static�ϴϱ�,,,
		System.out.println(studentLee.studentName + "  �й�: " + studentLee.studentID);

		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student2.getSerialNum());
		// serialNum ���� �������� ���� get() �޼��带 Ŭ���� �̸����� ���� ȣ��
		System.out.println(studentSon.studentName + "  �й�: " + studentSon.studentID);
	}

}
