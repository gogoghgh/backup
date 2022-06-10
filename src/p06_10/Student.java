package p06_10;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
//  설계도 완!! --> 실행은 메서드로..
//	메인메서드가 얘네들 끄집어와서 실제로 실행시켜준다,, =메모리에 올려준다
//	MainClass 만들러 고고~~~

//	메서드 만들기 //첫번째 글자는 소문자
	void printName() {
		System.out.println(studentName);
	} // 이름 프린트해주는 메서드
}
