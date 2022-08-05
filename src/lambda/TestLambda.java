package lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void showMyString(PrintString p) { 
							// 매개변수를 인터페이스(PrintString)형으로 받음
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world~~"); // 람다식을 반환하는 메서드
	}

	public static void main(String[] args) {
		// 람다식을 -> 인터페이스(PrintString)형 변수(lambdaStr)에 대입하고 
		// -> 그 변수를 사용해 람다식 구현부(showString) 호출
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		// 메서드(showMyString)의 매개변수로 람다식을 대입한 변수(lambdaStr) 전달
		showMyString(lambdaStr);
		
		showMyString(s->System.out.println(s)); // 이렇게 매개변수 자리에 람다식 바로 넣어도 ㅇㅋ
		showMyString(s->System.out.println(s + "쪼금 다르게 수정,,"));
		
		PrintString reStr = returnString(); // 변수로 반환받기
		reStr.showString("hello~~ "); // 메서드 호출
	}

}