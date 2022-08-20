package exam;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 사칙연산 프로그램에 필요한 연산자를 입력하시오.");
		System.out.print("(+, -, *, /) >> ");
		String op = sc.next();

		System.out.print("연산할 정수를 입력하시오 >> ");
		int num1 = sc.nextInt();

		System.out.print("연산할 정수를 입력하시오 >> ");
		int num2 = sc.nextInt();
		
		int result = 0;
		switch (op) {
		case "+": {
			result = num1 + num2;
			break;
		}
		case "-": {
			result = num1 - num2;
			break;
		}
		case "*": {
			result = num1 * num2;
			break;
		}
		case "/": {
			result = num1 / num2;
			break;
		}
		default:
			System.out.println("연산자 입력 오류: +, -, *, / 중 하나를 입력해주세요..");
			break;
		}// switch
		
		System.out.println(num1 + op + num2 + "=" + result);

		System.out.println("프로그램 종료");
		
	}// main
}