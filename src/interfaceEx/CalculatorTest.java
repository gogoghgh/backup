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
	}

}
