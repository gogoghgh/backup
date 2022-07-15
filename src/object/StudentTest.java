package object;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", "2201");
		Student s2 = new Student("홍길동", "2201");
		Student s3 = new Student("김길동", "2204");
		
		// toString 재정의
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// equals 재정의		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		
	}

}
