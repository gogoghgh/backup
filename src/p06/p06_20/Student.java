package p06.p06_20;

public class Student {
	public static int serialNum = 1000; // static ������ �ν��Ͻ� ������ ��� ���� ����! ������
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
