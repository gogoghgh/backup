package exam;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14;

		System.out.println("���� ������ ���� �Է��Ͻÿ�>>>");
		int r = sc.nextInt();
		
		double result = PI * r * r;

		System.out.println("���� ����: " + result);
	}

}