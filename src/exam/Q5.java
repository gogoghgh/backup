package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("정수를 입력하시오>>>");
			int num = sc.nextInt();
			numList.add(num);
		}

		// 오름차순으로 정렬 (확인용)
		Collections.sort(numList);

		for (Integer numListData : numList) {
			System.out.print(numListData + " ");
		}
		System.out.println();

		System.out.println("가장 큰 수: " + numList.get(4));

		
		
		System.out.println("-------------------해진쉬 답---------------------");
		System.out.println();

		
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.print("정수를 입력하시오>>>");
			int num = sc.nextInt();

			if (max < num) {
				max = num;
			}

		}

		System.out.println("가장 큰 수 : " + max);

	}// main

}// class