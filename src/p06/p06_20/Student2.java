package p06.p06_20;

public class Student2 {
	private static int serialNum = 1000; // private 변수로 변경
	int studentID;
	String studentName;
	int grade;
	String address;

	// 생성자
	public Student2() {
		serialNum++; // 생성자 만들 때= 객체 생성 할 때마다 시리얼 넘버 ++
		studentID = serialNum;
	}

	// 메서드
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// static한 serialNum 변수니까,, 게터세터 메서드도 static으로
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}

}
