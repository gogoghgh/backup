package p06.p06_14;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "�̻��";
		studentLee.setStudentName("�̻��");
//		studentLee.address << private ���� �����ڰ� �پ��־,, ���� Ŭ���� ���� �ƴ϶� �� ��
//								default, protected, public�� �� �� �� ����
//		System.out.println(studentLee.grade); 
		// default �⺯�� grade��,, �ٸ� ��Ű���� ���� ���� ���ó� �� ����~~
		System.out.println(studentLee.studentID);
		// public �⺯�� ID�� �� �� �ִ�~~
		// public �� ������ 3���� �ٸ� ��Ű������ �� ����~~~
		System.out.println(studentLee.getStudentName());
	}

}
