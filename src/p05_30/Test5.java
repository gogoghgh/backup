package p05_30;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// switch�� a b c d f ��� ����
		// int score = 99;
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� ��");
		int inputScore = sc.nextInt();

		switch (inputScore / 10) {
		case 10: // �극��ũ ���� �ĵ� ����? ������ ���� ������~~ ���̽� 9���� A��� ������, �극��ũ �ɷ��� --> switch�� ��������
			/*
			 * case 10: System.out.println("A���"); break; case 9, 10�� ����,,, ��ȿ�����̾�,, ������~~~
			 */
		case 9:
			System.out.println("A���");
			break;
		case 8:
			System.out.println("B���");
			break;
		case 7:
			System.out.println("C���");
			break;
		case 6:
			System.out.println("D���");
			break;
		default:
			System.out.println("F���");
		}
		// case 10, 9 : ... java 12�������ʹ� ��ǥ�� ���ᵵ ����~~
		// case 10, 9 -> ... ȭ��ǥ ���� break ���־� ��
		/*
		 * System.out.println( switch( ) { case 10,9 -> " "; case 8 -> " "; ,... default
		 * -> " "; } ); �̷��� ���⵵ ��!! println�� �ѿ� ������ ���ΰ� �ִ� ����.. ��? ������ ���� �����Ƽ�
		 */

	}

}
