package review;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� >> ");
		int inputNum = sc.nextInt();

		for (int i = 10; inputNum >= i; i--) {
			System.out.println(i);
		}

	}// main

}
