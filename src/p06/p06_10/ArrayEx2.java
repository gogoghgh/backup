package p06.p06_10;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
//		����: ����ڰ� �̸� 3�� �Է��ϴ� String [] name �����..
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸��� �Է��ϼ��� >>");
			name[i] = sc.next();
			System.out.println(name[i] + "�� �氡�氡");
			System.out.println("---------------------------------");
		}

//		��� Ȯ��
		for (int i = 0; i < 3; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}

	}

}
