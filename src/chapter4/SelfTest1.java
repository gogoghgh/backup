package chapter4;

import java.util.Scanner;

public class SelfTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���>>");
		int score = sc.nextInt();
		char grade;
		if (score>=90 && score <=100) {
			grade = 'A';
			System.out.println("���: " + grade);
		} 
		else if (score>=80 && score < 90) {
			grade = 'B';
			System.out.println("���: " + grade);
		}
		else if (score >=70 && score <80) {
			grade = 'C';
			System.out.println("���: " + grade);
		}
		else if (score >=60 && score <70) {
			grade = 'D';
			System.out.println("���: " + grade);
		}
		else {
			grade = 'F';
			System.out.println("���: " + grade);
		}
	}

}
