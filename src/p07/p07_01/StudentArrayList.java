package p07.p07_01;

import java.util.ArrayList;

import p06.p06_20.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		// Student class Ÿ���� ArrayList ����
		ArrayList<Student> students = new ArrayList<Student>();

		// add�޼���� �л� 3�� �߰�
		students.add(new Student(1001, "James"));
		students.add(new Student(1002, "Tomas"));
		students.add(new Student(1003, "Edward"));

		// ����ϱ�
		for (Student data : students) {
			System.out.println(data.getStudentName() + data.studentID);
		} // data�� �ּҰ��� ���� �����ϱ� . . ����~~ ȣ��

	}

}
