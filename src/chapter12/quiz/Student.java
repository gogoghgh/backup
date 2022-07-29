package chapter12.quiz;

import java.util.HashSet;

public class Student {
	private String studentID;
	private String studentName;
	
	// 생성자
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	// 메서드
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	//toString 재정의?
	@Override
	public String toString() {
		return studentID + ":" + studentName ;
	}
	
	
	
}
