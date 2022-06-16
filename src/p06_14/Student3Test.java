package p06_14;

public class Student3Test {

	public static void main(String[] args) {
		Student3 s3 = new Student3(); // 객체 생성 완
		s3.studentID = 12345;
		s3.studentName = "가현스";

		Subject kSub = new Subject();
		kSub.SubjectName = "국어";
		Subject mSub = new Subject();
		mSub.SubjectName = "수학";

//		s3.korean = new Subject();
//		s3.math = new Subject();
//				//'Subject타입'인 korean 멤버 변수,, 기본 타입은 아니죠~ 개발자가 설계한 타입임
//				//subject타입의 값은? 객체임.. new subject임.. 객체 생성한 subject...?
//		//Subject ... = new Subject(); 니까!!!
//					// 	 ㄴ 대입한 이게 값임.....
		s3.korean = kSub;
		s3.math = mSub;

		System.out.println(s3.studentID);
		System.out.println(s3.studentName);
		System.out.println(s3.korean); // '참조' 데이터형이라서 주소값이 출력됨..
		System.out.println(s3.math); // p06_14 -> Subject class 의~~~ ->
		System.out.println(s3.korean.scorePoint); // 0 출력 -> 초기값
		System.out.println(s3.math.SubjectName); // null 출력 -> 초기값 --> 이었는데 위에 값 넣어놔서 수학 출력됨..
		System.out.println(s3.korean.SubjectName);

	}

}
