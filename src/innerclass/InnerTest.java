package innerclass;

import innerclass.OutClass.InClass;

//외부 클래스
class OutClass {
	// 멤버변수
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass; // 내부 클래스(InClass) 자료형! 변수를 먼저 선언

	// 생성자
	public OutClass() {
		inClass = new InClass();
		// 외부 클래스 디폴트 생성자.
		// 외부 클래스가 생성된 후에 -> 내부 클래스 생성 가능
	}

	// -------------------------------------------------
	// 1. 내부 클래스 시작
	class InClass {
		int inNum = 100;
		static int sInNum = 200; // 인스턴스 내부 클래스에 정적 변수 선언 불가능..
								// -> 16버전 이상부터는 사용 가능^^

		void inTest() {
			System.out.println("OutClass num: " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum: " + sNum + "(외부 클래스의 정적 변수)");
		}

		static void sTest() { // 인스턴스 내부 클래스에 정적 메서드 역시 정의 불가능
							  // -> 16버전 이상부터는 사용 가능^^
			System.out.println("static method입니다만.. + sInNum: " + sInNum);
		}
	} // InClass
	
	// -------------------------------------------------
	// 2. 정적 내부 클래스
	static class InStaticClass {
		int inNum = 100; 		// 정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200; // 정적 내부 클래스의 정적 변수

		// 정적 내부 클래스의 일반 메서드
		void inTest() {
//			num += 10; // 외부 클래스의 인스턴스 변수는 사용할 수 X
						// Cannot make a static reference to the non-static field num
			System.out.println("InStaticClass inNum = " + inNum + " (내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)");
		}

		// 정적 내부 클래스의 정적!! 메서드
		static void sTest() {
//			num += 10; // Cannot make a static reference to the non-static field inNum
//			inNum += 10; // 외부 및 내부 클래스의 인스턴스 변수는 사용할 수 없음!!
			System.out.println("OutClass sNum = " + sNum + " (외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + " (내부 클래스의 정적 변수 사용)");
		}
	} // InStaticClass

	public void usingClass() {
		inClass.inTest(); // 외부-> 내부 객체 생성 없이 사용 가능한~
	}

} // OutClass


public class InnerTest {
	public static void main(String[] args) {
		//OutClass 객체 생성
		OutClass outClass = new OutClass();
		
		System.out.println("외부 클래스 이용하여 -> 내부 클래스 기능(메서드) 호출");
		outClass.usingClass(); // 외부 객체가 -> 내부 클래스 기능 호출 ㅇㅋ
		InClass.sTest(); // static이니까 객체 생성 필요 없이 클래스 이름 달고 호출 ㅇㅋ
		System.out.println();
		
		//InClass 객체 생성,,, 
			// 굳이 굳이 하고 싶다면 이렇게 할 수 있긴 한데 잘 사용하진 않는다~
		System.out.println("------ Inner Class ------");
		OutClass.InClass inClass = outClass.new InClass(); 
		inClass.inTest();
		InClass.sTest(); // static이니까 객체 생성 필요 없이 클래스 이름 달고 호출 ㅇㅋ
		inClass.sTest(); 
		
		// -------------------------------------------------
		// 외부 클래스를 생성하지 않고 바로! 정적 내부 클래스 생성 가능
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}

}