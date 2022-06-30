package p06.p06_02;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String op;
		double inputValue1;
		double inputValue2;
		double result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("↓↓↓ 연산자를 입력하세요 (+ - * /) ↓↓↓");
		op = sc.nextLine();
		System.out.println("↓↓↓ 정수 데이터1를 입력하세요 ↓↓↓");
		inputValue1 = sc.nextDouble();
		System.out.println("↓↓↓ 정수 데이터2 입력하세요 ↓↓↓");
		inputValue2 = sc.nextDouble();
		System.out.println("operator: " + op + " / value1: " +inputValue1 + " / value2: " + inputValue2);
		System.out.println();
		
		switch(op) {
		case "+":
			System.out.println("결과: " + inputValue1 + " + " + inputValue2 + " = " + (inputValue1 + inputValue2));
			break;

		case "-":
			System.out.println("결과: " + inputValue1 + " - " + inputValue2 + " = " + (inputValue1 - inputValue2));
			break;

		case "*":
			System.out.println("결과: " + inputValue1 + " * " + inputValue2 + " = " + (inputValue1 * inputValue2));
			break;

		case "/":
			System.out.println("결과: " + inputValue1 + " / " + inputValue2 + " = " + (inputValue1 / inputValue2));
			break;

		default:
			System.out.println("잘못 입력하셨습니다... + - * / 중 하나를 입력해주십쇼");
		}
		
	}

		// ------if 문 활용해서------//
//		if (op.equals("+")) {
			// String에서는 ==이 적용될 수도, 안 될 수도....나중에 배울거임..
			// String 비교할 경우에는, == 사용하지 않는다!! String 안에 있는 equlas 이용하기!!!!
//			System.out.println("결과: " + inputInt1 + " + " + inputInt2 + " = " + (inputInt1 + inputInt2));
//		} else if (op.equals("-")) { // (op=="-") 이런 식으로 비교 ㄴㄴ
//			System.out.println("결과: " + inputInt1 + " - " + inputInt2 + " = " + (inputInt1 - inputInt2));
//		} else if (op.equals("*")) {
//			System.out.println("결과: " + inputInt1 + " * " + inputInt2 + " = " + (inputInt1 * inputInt2));
//		} else if (op.equals("/")) {
//			System.out.println("결과: " + inputInt1 + " / " + inputInt2 + " = " + (inputInt1 / inputInt2));
//		} else
//			System.out.println("잘못 입력하셨습니다... + - * / 중 하나를 입력해주십쇼");



	}
