package p05.p05_30;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//복습
		int a = 0; // 초기값. 안 집어넣고 선언만 하는 경우엔~~ 오류 발생
		System.out.println(a);
		double b = a; // double b > int a : 자동 형변환
		System.out.println(b); // 0.0 ^^
		// a = b; .. int a < double b...
		a = (int) b; // 수동 형변환
		char c = 'a';
		a = c; // int a > char c : 자동 형변환
		System.out.println(a); // 97 출력
		System.out.println((char) a);
		System.out.println(c);

		int value1 = 100, value2 = 200; // 이렇게 연속으로도 선언 가능. 이게 되네~~
		String result = value1>value2? "value1이 크다":"value2가 크다";
		System.out.println(result);
		/*System이라는 라이브러리.. 자동으로 내포되어 있는!!
		Scanner 라이브러리: 사용자로부터 값 입력받는 <-- 자동으로 내장되어 있지 않아서
		어디서 들고와라~ import 써야 했죠
		*/
		
		Scanner sc = new Scanner(System.in);
		

	}

}
