package p06_14;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");
//		studentLee.address << private ���� �����ڰ� �پ��־,, ���� Ŭ���� ���� �ƴ϶� �� ��
//								default, protected, public�� �� �� �� ���� 
		System.out.println(studentLee.getStudentName());
	}

}
