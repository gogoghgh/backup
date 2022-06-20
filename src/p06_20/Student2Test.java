package p06_20;

public class Student2Test {

	public static void main(String[] args) {
		Student2 studentLee = new Student2(); // serialNum ++
		studentLee.setStudentName("이지원");
		System.out.println(Student2.getSerialNum());
		// serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		// 그치그치,, 아무래도,, static하니까,,,
		System.out.println(studentLee.studentName + "  학번: " + studentLee.studentID);

		Student2 studentSon = new Student2();
		studentSon.setStudentName("손수경");
		System.out.println(Student2.getSerialNum());
		// serialNum 값을 가져오기 위해 get() 메서드를 클래스 이름으로 직접 호출
		System.out.println(studentSon.studentName + "  학번: " + studentSon.studentID);
	}

}
