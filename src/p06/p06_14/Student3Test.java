package p06.p06_14;

public class Student3Test {

	public static void main(String[] args) {
		Student3 s3 = new Student3(); // 객체 생성 완
		s3.studentID = 12345;
		s3.studentName = "가현스";
//		s3.koreanScore = 90;
		
		Subject kSub = new Subject();
		kSub.SubjectName = "국어";
		kSub.scorePoint = 90;
		Subject mSub = new Subject();
		mSub.SubjectName = "수학";
		mSub.scorePoint = 99;
		// 이 단계 먼저 거쳐야 --> s3.korean = kSub; 할 수있음
		// 당근.. 인터프리터는 위-> 아래로 한줄한줄이니까
		
		s3.korean = kSub;
		s3.math = mSub;
		
		System.out.println("국어 점수 "+ s3.korean.scorePoint); //90 출력!!
		System.out.println("s3.studentID = " + s3.studentID);
		System.out.println("s3.studentName = " + s3.studentName);
		System.out.println("s3.korean = " + s3.korean); // '참조' 데이터형이라서 주소값이 출력됨..
		System.out.println("s3.math = " + s3.math); // p06_14 -> Subject class 의~~~ ->
		System.out.println("s3.korean.scorePoint = " + s3.korean.scorePoint); // 0 출력 -> 초기값
		System.out.println("s3.math.scorePoint = " + s3.math.scorePoint);
		System.out.println("s3.math.SubjectName = " + s3.math.SubjectName); // null 출력 -> 초기값 --> 이었는데 위에 값 넣어놔서 수학 출력됨..
		System.out.println("s3.korean.SubjectName = " + s3.korean.SubjectName);
		
		//최종!!! 
		// s3 객체 생성 -> Student3 멤변 중에 koreanScore에 90점 대입하고 싶은데 안 됨,, 
		// koreanScore는 Subject 클래스 타입이라서!!!
		// Subject 클래스 설계도 보고 kSub, mSub라는 참조변수 만들어서 new 해서 각각 객체 생성
		// 
		
//		s3.korean = new Subject();
//		s3.math = new Subject();
//		'Subject 클래스 타입'인 korean 멤버 변수,, 기본 타입은 아니죠~ 개발자가 설계한 타입임
//		Subject 클래스 타입의 값은? 객체임.. new subject임.. 객체 생성한 subject...?
//		//Subject ... = new Subject(); 니까!!!
//					 	 ㄴ 대입한 이게 값임..... = kSub, mSub도 Subject 클래스 타입이다~~~ 그러니까 들어갈 수 있음


	}

}
