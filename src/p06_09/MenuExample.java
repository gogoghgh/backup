package p06_09;

import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴� ����");
		int num = 1;
		int sum = 0;
		// boolean flag = true;
		int menuNum;
		System.out.println("1��: 1~10���� �հ�   |   2��: ����");

		do {
			menuNum = sc.nextInt();
			if (menuNum == 1) {
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("���� " + sum + "�Դϴ�");
			} else if (menuNum != 2) {
				System.out.println("�޴� ��ȣ�� �����ϼ���");
			}
		} while (menuNum != 2);

		System.out.println("���α׷� ����");
	}

}
