package p05.p05_27;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� >>>");
		int input = sc.nextInt();
		System.out.println("result: " + (input + 50));
		System.out.println("result: " + input + 50);
		/*
		 * ���� sc�� Scanner��!! ������. Scanner(�̹� �����ϰ� �ִ� ���̺귯��(= ����� ����
		 * �ִ�,,)(=System.out.println ������ System�� ����)) ����,, ����ڷκ��� ������ �Է¹޴� ���~~ in -->
		 * Ű����κ��� �Է¹޴� ��ĳ�ʸ� ����ڴ�..... ���⼭ �����ϰ� �ٲ� �� �ִ� �� sc(������) ��.... ��Ű�� �ؿ�, Ŭ���� ��
		 * ��ġ��!! import ����� �Ἥ ��ĳ�� ��� �� ���̺귯�� ��ġ ����ؾ� ��. �ٵ� ������ �� �ʿ� ���� ��Ŭ�������� ����Ű �Ἥ ~~
		 * ctrl+shift+o �ڡڡڡڡ� sc.next���� �޼���� = ����ڷκ��� ~~���� ������ �Է¹޴� ��� �Է¹޾Ƽ� --> ���� -->
		 * ���? ������~
		 */

	}

}
