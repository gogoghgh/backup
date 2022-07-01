package p07.p07_01.score_print;

import java.util.ArrayList;

public class Student {
	//Student Ŭ������ ��� ����
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList �����ϱ�
	// �� Subject�� ArrayList��? �� �л��� �����ϴ� ������ ���� �� ���� �� �����Ƿ�,,
	
	//������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList �����ϱ�
	}
	
	// �޼���
	// �л��� �����ϴ� ������ -> subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //Subject �����ϱ�,, subject�� �ּҰ� ���� ����
		subject.setName(name); //���� �̸� �߰��ϱ�
		subject.setScorePoint(score); //���� �߰��ϱ�,, ���ư�~~~
		subjectList.add(subject); // �̸�, ���� �߰��� ��� -> �迭�� �����ϱ�
	}
	
	// �޼���
	// �迭 ��� �� ����ϴ�
	public void showStudentInfo() {
		int total = 0; // ����
		double avg=0; //���
		for(Subject s : subjectList) { //��� for��
			total += s.getScorePoint(); // ���� ������ ���� ���ϱ��.. ���� ����
			avg = (double)total/subjectList.size() ;
			System.out.println("�л� " + studentName+"�� " + s.getName() + "���� ������ " + s.getScorePoint()+"�� �Դϴ�.");
		}
		System.out.println("�л� " + studentName + "�� ������ " + total + " �� �Դϴ�");
		System.out.println("�л� " + studentName + "�� ��� ������ " + avg + " �� �Դϴ�");
		
	}

}//class
