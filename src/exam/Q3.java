package exam;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ��Ģ���� ���α׷��� �ʿ��� �����ڸ� �Է��Ͻÿ�.");
		System.out.print("(+, -, *, /) >> ");
		String op = sc.next();

		System.out.print("������ ������ �Է��Ͻÿ� >> ");
		int num1 = sc.nextInt();

		System.out.print("������ ������ �Է��Ͻÿ� >> ");
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
			System.out.println("������ �Է� ����: +, -, *, / �� �ϳ��� �Է����ּ���..");
			break;
		}// switch
		
		System.out.println(num1 + op + num2 + "=" + result);

		System.out.println("���α׷� ����");
		
	}// main
}