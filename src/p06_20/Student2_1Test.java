package p06_20;

public class Student2_1Test {

	public static void main(String[] args) {
		Student2_1 studentLee = new Student2_1(); // serial ++
		studentLee.setStudentName("이지원");
//		System.out.println(studentLee.serialNum); // static 변수 = 클래스 변수~~니까,, 이렇게 안 쓰고
		System.out.println(Student2_1.serialNum); // 이렇게 쓴다!!!
		System.out.println(studentLee.studentName + "  학번: " + studentLee.studentID);

		Student2_1 studentSon = new Student2_1(); // serial ++
		studentSon.setStudentName("손수경");
		System.out.println(Student2_1.serialNum); // 1002
		System.out.println(studentSon.studentName + "  학번: " + studentSon.studentID);

		Student2_1 studentYou = new Student2_1(); // serial ++
		studentYou.setStudentName("가현스");
		System.out.println(Student2_1.serialNum); // 1003
		System.out.println(studentYou.studentName + "  학번: " + studentYou.studentID);
		// static 사용할 때는, 참조변수보다는 <<< 클래스명.static 이름~~ 으로 사용하기!! 이게 맞다~~

	}

}
