package exam;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14;

		System.out.println("원의 반지름 값을 입력하시오>>>");
		int r = sc.nextInt();
		
		double result = PI * r * r;

		System.out.println("원의 넓이: " + result);
	}

}