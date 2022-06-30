package p06.p06_10;

public class P123 {

	public static void main(String[] args) {
		System.out.println("Q1-------------- if 이용해서");
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
			System.out.println("잘못 입력하셨습니다^^");

		System.out.println("Q1-------------- switch 이용해서");
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
		// 접근 방식: 1. 바깥 for문은 4번 돌고, 안에 for문은 7번 돌고..
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if ((i + j <= 4) || (j - i >= 4)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		// 구글 답
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		/* 선생님 답
//		 * i=4, j=4 ->*, 나머지 " "
//		 * i=3, j=345 ->*, 나머지 " "
//		 * i=2, j=23456 ->*, 나머지 " "
//		 * i=1, j=1234567 ->*.
//		 * ===> * 개수는: i * 2 -1개!! 
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
