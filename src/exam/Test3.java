package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��Ͻÿ�>>>");
			int num = sc.nextInt();
			numList.add(num);
		}

		// ������������ ����
		Collections.sort(numList);

		System.out.println("���� ū ��: " + numList.get(4));

	}
}// main