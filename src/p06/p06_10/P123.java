package p06.p06_10;

public class P123 {

	public static void main(String[] args) {
		System.out.println("Q1-------------- if �̿��ؼ�");
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		if (operator == '+') {
			System.out.println("num1 + num2 = " + (num1 + num2));
		} else if (operator == '-') {
			System.out.println("num1 - num2 = " + (num1 - num2));
		} else if (operator == '*') {
			System.out.println("num1 * num2 = " + (num1 * num2));
		} else if (operator == '/') {
			System.out.println("num1 / num2 = " + (num1 / num2));
		} else
			System.out.println("�߸� �Է��ϼ̽��ϴ�^^");

		System.out.println("Q1-------------- switch �̿��ؼ�");
		switch (operator) {
		case '+':
			System.out.println("num1 + num2 = " + (num1 + num2));
			break;
		case '-':
			System.out.println("num1 - num2 = " + (num1 - num2));
			break;
		case '*':
			System.out.println("num1 * num2 = " + (num1 * num2));
			break;
		case '/':
			System.out.println("num1 / num2 = " + (num1 / num2));
			break;
		}

		System.out.println("Q2-------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i % 2 == 1)
					continue;
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("Q3---------------------------");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1;; j++) {
				if (i < j)
					break;
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}

		System.out.println("Q4----------------------------");
		// ���� ���: 1. �ٱ� for���� 4�� ����, �ȿ� for���� 7�� ����..
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i + j <= 4) || (j - i >= 4)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		// ���� ��
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		/* ������ ��
//		 * i=4, j=4 ->*, ������ " "
//		 * i=3, j=345 ->*, ������ " "
//		 * i=2, j=23456 ->*, ������ " "
//		 * i=1, j=1234567 ->*.
//		 * ===> * ������: i * 2 -1��!! 
//		 */
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 7; j++) {
				if (j >= i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("Q5----------------------");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
