package p06.p06_02;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		String op;
		double inputValue1;
		double inputValue2;
		double result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �����ڸ� �Է��ϼ��� (+ - * /) ����");
		op = sc.nextLine();
		System.out.println("���� ���� ������1�� �Է��ϼ��� ����");
		inputValue1 = sc.nextDouble();
		System.out.println("���� ���� ������2 �Է��ϼ��� ����");
		inputValue2 = sc.nextDouble();
		System.out.println("operator: " + op + " / value1: " +inputValue1 + " / value2: " + inputValue2);
		System.out.println();
		
		switch(op) {
		case "+":
			System.out.println("���: " + inputValue1 + " + " + inputValue2 + " = " + (inputValue1 + inputValue2));
			break;

		case "-":
			System.out.println("���: " + inputValue1 + " - " + inputValue2 + " = " + (inputValue1 - inputValue2));
			break;

		case "*":
			System.out.println("���: " + inputValue1 + " * " + inputValue2 + " = " + (inputValue1 * inputValue2));
			break;

		case "/":
			System.out.println("���: " + inputValue1 + " / " + inputValue2 + " = " + (inputValue1 / inputValue2));
			break;

		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�... + - * / �� �ϳ��� �Է����ֽʼ�");
		}
		
	}

		// ------if �� Ȱ���ؼ�------//
//		if (op.equals("+")) {
			// String������ ==�� ����� ����, �� �� ����....���߿� ������..
			// String ���� ��쿡��, == ������� �ʴ´�!! String �ȿ� �ִ� equlas �̿��ϱ�!!!!
//			System.out.println("���: " + inputInt1 + " + " + inputInt2 + " = " + (inputInt1 + inputInt2));
//		} else if (op.equals("-")) { // (op=="-") �̷� ������ �� ����
//			System.out.println("���: " + inputInt1 + " - " + inputInt2 + " = " + (inputInt1 - inputInt2));
//		} else if (op.equals("*")) {
//			System.out.println("���: " + inputInt1 + " * " + inputInt2 + " = " + (inputInt1 * inputInt2));
//		} else if (op.equals("/")) {
//			System.out.println("���: " + inputInt1 + " / " + inputInt2 + " = " + (inputInt1 / inputInt2));
//		} else
//			System.out.println("�߸� �Է��ϼ̽��ϴ�... + - * / �� �ϳ��� �Է����ֽʼ�");



	}
