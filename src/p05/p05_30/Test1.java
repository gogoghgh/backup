package p05.p05_30;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//����
		int a = 0; // �ʱⰪ. �� ����ְ� ���� �ϴ� ��쿣~~ ���� �߻�
		System.out.println(a);
		double b = a; // double b > int a : �ڵ� ����ȯ
		System.out.println(b); // 0.0 ^^
		// a = b; .. int a < double b...
		a = (int) b; // ���� ����ȯ
		char c = 'a';
		a = c; // int a > char c : �ڵ� ����ȯ
		System.out.println(a); // 97 ���
		System.out.println((char) a);
		System.out.println(c);

		int value1 = 100, value2 = 200; // �̷��� �������ε� ���� ����. �̰� �ǳ�~~
		String result = value1>value2? "value1�� ũ��":"value2�� ũ��";
		System.out.println(result);
		/*System�̶�� ���̺귯��.. �ڵ����� �����Ǿ� �ִ�!!
		Scanner ���̺귯��: ����ڷκ��� �� �Է¹޴� <-- �ڵ����� ����Ǿ� ���� �ʾƼ�
		��� ���Ͷ�~ import ��� ����
		*/
		
		Scanner sc = new Scanner(System.in);
		

	}

}
