package p06_27;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[3]; // array1[0], array1[1], array1[2], array1.length=3
//		int inputInt;
		int sum = 0;
		int max = Integer.MIN_VALUE; // static 멤버변수여서,, 객체 생성 안 하고도 쓸 수 있음
		int min = Integer.MAX_VALUE;

		// 3번 입력받아 배열변수에 저장..
		// 저장받은 값을 화면에 출력
		for (int i = 0; i < array1.length; i++) {
			System.out.println("정수를 입력하시오 >>>>>>>");
//			inputInt=sc.nextInt();
//			array1[i] = inputInt;
//			그냥 바로 해도 되잖아~~~ inputInt 필요 X, sum도 여기에 적음 됨 ^^
			array1[i] = sc.nextInt();
			// 합계 구하기
			sum += array1[i];

			// 최댓값 구하기
			// max가 갖고 있는 값보다 더 크면~~ 걔를 max에 대입..
			// 안 작으면? 걍 패스~
			if (array1[i] > max) {
				max = array1[i];
			}

			// 최솟값 구하기
			if (array1[i] < min) { //
				min = array1[i];
			}

		} // for

		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "]: " + array1[i]);
		}
		System.out.println();

//		for (int i = 0; i < array1.length; i++) {
//			sum += array1[i];
//		}

		System.out.println("sum: " + sum);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println();

	} // main

}