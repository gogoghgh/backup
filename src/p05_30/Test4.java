package p05_30;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// String season = "��";

		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϴ� ������ �Է��ϼ���>>");

		String inputSeason = sc.next();

		switch (inputSeason) {
		/*
		 * �� �� �ȿ� ���� or ��!!�� ��... �Ұ�����: boolean, �Ǽ� Ÿ��, ����longŸ�� ������: char, String,
		 * ����..
		 */
		case "spring", "��", "������":
			System.out.println("������");
			break;
		case "summer", "����", "���":
			System.out.println("����");
			break;
		case "fall", "����", "��":
			System.out.println("����");
			break;
		case "winter", "�ܿ�", "����":
			System.out.println("�߿�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�..."); // ���� ���̽� �ܿ� ������ ������ default��..
		}

	}

}
