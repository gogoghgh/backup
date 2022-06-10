package p06_10;

public class MainClass {
//	자바가 만들어준 유일한 실행 메서드~~ =메인 메서드
//	써먹는다 = 메모리에 올린다!!
	public static void main(String[] args) {
		System.out.println("Student Class---------------------------");
		Student s1; // s1은 Student 타입이다~~~ "s1 변수 선언"
		s1 = new Student(); // 메모리에 올려주는 작업(="객체 생성" = 써먹을 수 있게 메모리에 올린다)
//			메모리에 올라갔고~~
		s1.address = "부산시 금정구";
		s1.grade = 1;
		s1.studentID = 1;
		s1.studentName = "유가현";
//			student 클래스 설계하고 -> 설계도 갖고 메인 와서 -> 메인에서 객체 생성해서 사용해야 함

		System.out.println("주소: " + s1.address);
		System.out.println("학년: " + s1.grade);
		System.out.println("ID: " + s1.studentID);
		System.out.println("이름: " + s1.studentName);
		System.out.println();

		Student s2 = new Student();
		s2.address = "부산시 진구";
		s2.grade = 3;
		s2.studentID = 2;
		s2.studentName = "김순자";
		System.out.println("주소: " + s2.address);
		System.out.println("학년: " + s2.grade);
		System.out.println("ID: " + s2.studentID);
		System.out.println("이름: " + s2.studentName);
		System.out.println();

		System.out.println("Person Class-----------------------------------");
		Person p1 = new Person();
		p1.gender = '여';
		p1.height = 159;
		p1.married = false;
		p1.name = "유가현";
		p1.weight = 55;
		System.out.println("성별: " + p1.gender);
		System.out.println("키: " + p1.height);
		System.out.println("결혼: " + p1.married);
		System.out.println("이름: " + p1.name);
		System.out.println("몸무게: " + p1.weight);
		System.out.println();

		Person p2 = new Person();
		p2.gender = '여';
		p2.height = 163;
		p2.married = true;
		p2.name = "김순자";
		p2.weight = 45;
		System.out.println("성별: " + p2.gender);
		System.out.println("키: " + p2.height);
		System.out.println("결혼: " + p2.married);
		System.out.println("이름: " + p2.name);
		System.out.println("몸무게: " + p2.weight);
		System.out.println();

		System.out.println("메서드 써먹기------------------------");
		s1.printName(); // 메서드 호출~~~ 뭐 리턴값 없는 void 타입
		s2.printName();

	}

}
