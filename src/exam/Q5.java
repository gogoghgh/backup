package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��Ͻÿ�>>>");
			int num = sc.nextInt();
			numList.add(num);
		}

		// ������������ ���� (Ȯ�ο�)
		Collections.sort(numList);

		for (Integer numListData : numList) {
			System.out.print(numListData + " ");
		}
		System.out.println();

		System.out.println("���� ū ��: " + numList.get(4));

		
		
		System.out.println("-------------------������ ��---------------------");
		System.out.println();

		
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��Ͻÿ�>>>");
			int num = sc.nextInt();

			if (max < num) {
				max = num;
			}

		}

		System.out.println("���� ū �� : " + max);

	}// main

}// class