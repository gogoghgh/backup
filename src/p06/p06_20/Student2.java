package p06.p06_20;

public class Student2 {
	private static int serialNum = 1000; // private ������ ����
	int studentID;
	String studentName;
	int grade;
	String address;

	// ������
	public Student2() {
		serialNum++; // ������ ���� ��= ��ü ���� �� ������ �ø��� �ѹ� ++
		studentID = serialNum;
	}

	// �޼���
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// static�� serialNum �����ϱ�,, ���ͼ��� �޼��嵵 static����
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
