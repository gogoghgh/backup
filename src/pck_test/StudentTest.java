package pck_test;

import p06_14.Student; //다른 패키지에 있는 애를 사용할거니까 import!! ctrl shift o

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
//		studentLee.address << private 접근 제어자가 붙어있어서,, 같은 클래스 내가 아니라 못 씀
//								default, protected, public은 다 쓸 수 있음
//		System.out.println(studentLee.grade); 
		// default 멤변인 grade도,, 다른 패키지로 갔을 때는 역시나 못 쓴다~~
		System.out.println(studentLee.studentID);
		// public 멤변인 ID는 쓸 수 있다~~
		// public 뺀 나머지 3개는 다른 패키지에선 못 쓴다~~~
		System.out.println(studentLee.getStudentName());
	}

}
