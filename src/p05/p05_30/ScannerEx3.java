package p05.p05_30;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		// �������� �Է¹޾Ƽ� �� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� �Է��ϼ����");
		final double PI = 3.14; // ��� final �����.. ����� "�빮��", camel case ���� "_"�� ���� �� �������� ǥ��
		double inputR = sc.nextDouble();
		double area = inputR * inputR * PI;
		System.out.println("���� ������ " + area + "�Դϴ�.");

	}

}
