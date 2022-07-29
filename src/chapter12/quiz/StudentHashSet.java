package chapter12.quiz;

import java.util.HashSet;

public class StudentHashSet {
	// HashSet ����
	private HashSet<Student> hashSet;
	
	// �޼���
	// HashSet ����
	public StudentHashSet() {
		hashSet = new HashSet<Student>();
	}
	
	// HashSet�� ȸ�� �߰�
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	// ��� �л� ���... �޼���
	public void showAllStudent() {
		for(Student student : hashSet) {
			System.out.println("student: " + student);
		}
	}
	
	
	// ��� �л� ���.. toString ������?
//	@Override
//	public String toString() {
//		return  + ":" + studentName + ", " ;
//	}
}
