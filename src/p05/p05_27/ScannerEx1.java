package p05.p05_27;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� a b c ��޳���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���>>>");
		int score = sc.nextInt();
		char grade;

		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');

		System.out.println("���: " + grade);

	}

}
