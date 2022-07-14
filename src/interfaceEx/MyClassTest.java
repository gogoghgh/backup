package interfaceEx;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		// mClass(하위) -> 상위 인터페이스 X형으로 대입하면
		// 인터페이스 X에 선언한 메서드만 호출 가능.. 당근이지
		System.out.println();
		
		Y yClass = mClass;
		yClass.y();
		// mClass(하위) -> 상위 인터페이스 Y형으로 대입하면
		// 인터페이스 Y에 선언한 메서드만 호출 가능
		System.out.println();
		
		MyInterface iClass = mClass;
		iClass.myMethod(); //MyInterface 지꺼니까 당근 ㅇㅋ
		iClass.x(); // X, Y 상속받았으니 ㅇㅋ
		iClass.y();
		// mClass -> 구현한 인터페이스형 변수(iClass)에 대입하면
		// 인터페이스가 상속한 모든 메서드 호출 가능
	}

}
