package p06_14;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
//		studentLee.address << private 접근 제어자가 붙어있어서,, 같은 클래스 내가 아니라 못 씀
//								default, protected, public은 다 쓸 수 있음 
		System.out.println(studentLee.getStudentName());
	}

}
