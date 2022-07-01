package p07.p07_01.score_print;

import java.util.ArrayList;

public class Student {
	//Student 클래스의 멤버 변수
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; // ArrayList 선언하기
	// 왜 Subject를 ArrayList로? 한 학생이 수강하는 과목은 여러 개 있을 수 있으므로,,
	
	//생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // ArrayList 생성하기
	}
	
	// 메서드
	// 학생이 수강하는 과목을 -> subjectList 배열에 하나씩 추가하는 메서드
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //Subject 생성하기,, subject는 주소값 갖고 있음
		subject.setName(name); //과목 이름 추가하기
		subject.setScorePoint(score); //점수 추가하기,, 나아가~~~
		subjectList.add(subject); // 이름, 점수 추가한 놈들 -> 배열에 저장하기
	}
	
	// 메서드
	// 배열 요소 값 출력하는
	public void showStudentInfo() {
		int total = 0; // 총점
		double avg=0; //평균
		for(Subject s : subjectList) { //향상 for문
			total += s.getScorePoint(); // 과목별 점수들 누적 더하기로.. 총점 내기
			avg = (double)total/subjectList.size() ;
			System.out.println("학생 " + studentName+"의 " + s.getName() + "과목 성적은 " + s.getScorePoint()+"점 입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 점 입니다");
		System.out.println("학생 " + studentName + "의 평균 점수는 " + avg + " 점 입니다");
		
	}

}//class
