package object;

import java.util.Objects;

class Student {
	int studentId;
	String studentName;

	// 생성자
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// toString() 메서드 재정의
	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}

	// 자동으로 재정의한 hashCode(), equals()..
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}

	// equals() 메서드 재정의!!!!!!!!!!!!!!
//	@Override
//	public boolean equals(Object obj) { //매개변수는 Object형
//		// 안정적으로 ! 오류 안 나게 하기 위해서, instanceof 넣은거임
//		// 누가... Student형 말고 Person형이나,, Customer형이나,, 이런 거 넣으면 어떡함 ㅠ
//		// 그런 일을 미연에 방지
//		if (obj instanceof Student) { // 들어온 놈이 Student형이냐~ 맞으면~~ 중괄호 실행
//			Student std = (Student)obj; // 상위 -> 하위로 들어가니까 down casting
//										 // 형 변환 안 하면 obj. -> studentId 안 나옴 ...  
//			if (this.studentId == std.studentId) // 재정의한 equals() 메서드.. 핵심
//				return true;                     // 학생 학번이 같으면 true 반환
//			else
//				return false;
//		} // 참이면 중괄호 안에 거 실행, 
//		return false; // Student형 아니면 false 반환
//	}
	
	
	
	// hashCode() 메서드 재정의!!!!
//	@Override
//	public int hashCode() {
//		return studentId; // 해시 코드 값으로 학번을 반환하도록 재정의^^
//	}
	
	
	

} // Student class 끝

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; // 주소 복사
		Student studentSang = new Student(100, "이상원");

		System.out.println("---------------equals()---------------");
		// studentLee ---- studentLee2
		if (studentLee == studentLee2) // == 기호로 비교
			System.out.println("studentLee와 studentLee2의 주소는~~ 같습니다");
		else
			System.out.println("studentLee와 studentLee2의 주소는~~ 다릅니다");

		if (studentLee.equals(studentLee2)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일 ㄴㄴ ");
		System.out.println();

		// studentLee ---- studentSang
		if (studentLee == studentSang) // == 기호로 비교
			System.out.println("studentLee와 studentSang의 주소는~~ 같습니다");
		else
			System.out.println("studentLee와 studentSang의 주소는~~ 다릅니다");

		if (studentLee.equals(studentSang)) // equals() 메서드로 비교
			System.out.println("studentLee와 studentSang는 동일합니다");
		else
			System.out.println("studentLee와 studentSang는 동일 ㄴㄴ ");
		
		System.out.println();
		System.out.println("-----------------hashCode()---------");
	
		
		// hashCode()
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());  //재정의 전: 2055281021 -> 후: 100 
		System.out.println("studentSang의 hashCode: " + studentSang.hashCode()); //재정의 전: 1554547125 -> 후: 100
		System.out.println(); 
		
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값: " + System.identityHashCode(studentSang));
													// ㄴ 개발자가 overriding 할 수 없는!! 절대적인!! 메서드임
		

	}
}