package p07.p07_01;

import java.util.ArrayList;

import p06.p06_20.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		// Student class 타입의 ArrayList 선언
		ArrayList<Student> students = new ArrayList<Student>();

		// add메서드로 학생 3명 추가
		students.add(new Student(1001, "James"));
		students.add(new Student(1002, "Tomas"));
		students.add(new Student(1003, "Edward"));

		// 출력하기
		for (Student data : students) {
			System.out.println(data.getStudentName() + data.studentID);
		} // data는 주소값을 갖고 있으니까 . . 으로~~ 호출

	}

}
