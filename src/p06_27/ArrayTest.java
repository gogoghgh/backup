package p06_27;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array1 = new int[3]; // array1[0], array1[1], array1[2], array1.length=3
//		int inputInt;
		int sum = 0;
		int max = Integer.MIN_VALUE; // static �����������,, ��ü ���� �� �ϰ� �� �� ����
		int min = Integer.MAX_VALUE;

		// 3�� �Է¹޾� �迭������ ����..
		// ������� ���� ȭ�鿡 ���
		for (int i = 0; i < array1.length; i++) {
			System.out.println("������ �Է��Ͻÿ� >>>>>>>");
//			inputInt=sc.nextInt();
//			array1[i] = inputInt;
//			�׳� �ٷ� �ص� ���ݾ�~~~ inputInt �ʿ� X, sum�� ���⿡ ���� �� ^^
			array1[i] = sc.nextInt();
			// �հ� ���ϱ�
			sum += array1[i];

			// �ִ� ���ϱ�
			// max�� ���� �ִ� ������ �� ũ��~~ �¸� max�� ����..
			// �� ������? �� �н�~
			if (array1[i] > max) {
				max = array1[i];
			}

			// �ּڰ� ���ϱ�
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