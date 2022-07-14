package interfaceEx;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력해주세요 >>>");
		int num1 = sc.nextInt();
		System.out.println("정수2 입력해주세요 >>>");
		int num2 = sc.nextInt();

		CompleteCalc calc = new CompleteCalc();
		System.out.println("add: " + num1 + " + " + num2 +" = " + calc.add(num1, num2));
		System.out.println("substract: " + num1 + " - " + num2 +" = " + calc.substract(num1, num2));
		System.out.println("times: " + num1 + " * " + num2 +" = " + calc.times(num1, num2));
		System.out.println("divide: " + num1 + " / " + num2 +" = " + calc.divide(num1, num2));
		System.out.println("square: " + num1 + " * " + num1 +" = " + calc.square(num1));
		
		calc.showinfo();
		System.out.println();
		
		calc.description(); 
		//ㄴ 디폴트 메서드!! 얘는 인터페이스에 이미 구현되어 있으므로,
		// 인터페이스를 구현한 추상 클래스 Calculator, 
		// <-얘를 상속받은 CompleteCalc 클래스에서 코드 구현할 필요 없음.. 걍 바로 호출
		System.out.println();
		
		//정적 메서드 =static method 사용하기~~
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("1~5 total: " + Calc.total(arr));
		// 									ㄴ인터페이스 이렇게 불러올 수 있군 오오~
	}

}
