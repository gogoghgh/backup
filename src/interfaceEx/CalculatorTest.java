package interfaceEx;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����1 �Է����ּ��� >>>");
		int num1 = sc.nextInt();
		System.out.println("����2 �Է����ּ��� >>>");
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
		//�� ����Ʈ �޼���!! ��� �������̽��� �̹� �����Ǿ� �����Ƿ�,
		// �������̽��� ������ �߻� Ŭ���� Calculator, 
		// <-�긦 ��ӹ��� CompleteCalc Ŭ�������� �ڵ� ������ �ʿ� ����.. �� �ٷ� ȣ��
		System.out.println();
		
		//���� �޼��� =static method ����ϱ�~~
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("1~5 total: " + Calc.total(arr));
		// 									���������̽� �̷��� �ҷ��� �� �ֱ� ����~
	}

}
