package p05.p05_27;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// 점수 입력받아서 a b c 등급내기
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요>>>");
		int score = sc.nextInt();
		char grade;

		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');

		System.out.println("등급: " + grade);

	}

}
