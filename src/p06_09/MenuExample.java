package p06_09;

import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 시작");
		int num = 1;
		int sum = 0;
		// boolean flag = true;
		int menuNum;
		System.out.println("1번: 1~10까지 합계   |   2번: 종료");

		do {
			menuNum = sc.nextInt();
			if (menuNum == 1) {
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("합은 " + sum + "입니다");
			} else if (menuNum != 2) {
				System.out.println("메뉴 번호를 정정하세요");
			}
		} while (menuNum != 2);

		System.out.println("프로그램 종료");
	}

}
