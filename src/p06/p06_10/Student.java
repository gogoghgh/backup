package p06.p06_10;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
//  설계도 완!! --> 실행은 메서드로..
//	메인메서드가 얘네들 끄집어와서 실제로 실행시켜준다,, =메모리에 올려준다
//	MainClass 만들러 고고~~~

//	메서드 만들기 //첫번째 글자는 소문자
	void printName() { // 이름 프린트해주는 메서드
		System.out.println(studentName);
	}

	// get 메서드 만들기
	public String getStudentName() { //studentName 가져와라~
		return studentName;
	} // 손으로 하니까 안 되고 자동으로 하니까 되네 ㄷㄷ
	
	
	public static void main(String[] args) { //따로 빼는 게 좋은데,, 걍 일단 이렇게
		System.out.println("------------------------------main--------");
		Student studentAhn = new Student();
		studentAhn.studentName="안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		System.out.println();
		
		Student student1 = new Student();
//		student1.studentName = 
	}

}
