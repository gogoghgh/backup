package p06_20;

public class Student2_1 {
	public static int serialNum = 1000; // static ������ �ν��Ͻ� ������ ��� ���� ����! ������
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student2_1() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
