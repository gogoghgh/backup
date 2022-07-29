package chapter12.quiz;

import java.util.HashSet;

public class StudentHashSet {
	// HashSet 선언
	private HashSet<Student> hashSet;
	
	// 메서드
	// HashSet 생성
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	// HashSet에 회원 추가
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	// 모든 학생 출력... 메서드
	public void showAllStudent() {
		for(Student student : hashSet) {
			System.out.println("student: " + student);
		}
	}
	
	
	// 모든 학생 출력.. toString 재정의?
//	@Override
//	public String toString() {
//		return  + ":" + studentName + ", " ;
//	}
}
