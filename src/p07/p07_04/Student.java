package p07.p07_04;

public class Student extends Person {
	int grade;

	public Student() {
//		super(); //이게 원래 디폴트 생성자의 모습!! super가 안에 들어있다~~
		//젤 먼저 부모 생성자 설계도를 호출한다!!! 자식이 첫번째 하는 일,, 
		//   설계도 사용하는 게 아니라 호출~~
		super("김길동", 11111);
		System.out.println("Student 디폴트 생성자입니다^^");
	}
}
