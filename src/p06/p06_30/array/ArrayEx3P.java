package p06.p06_30.array;

import java.util.Random;

public class ArrayEx3P {

	public static void main(String[] args) {
		int[] lotto = new int[7];
		Random rand = new Random();

		for (int i = 0; i < lotto.length; i++) {
			int num = rand.nextInt(45) + 1;
			System.out.println(num);
			boolean isContain = false;

			for (int j = 0; j < i; j++) {
				System.out.println("j: " + j);
				if (num == lotto[j]) { // �ߺ��̶��???
					System.out.println("�ߺ� j: " + j);
					isContain = true;
					break;
				}
			}
			if (isContain) { // isContain�� true���~~ �ߺ��̶��~
				i--; // ���� �Ϸ� �ϰ� �ٽ� ������ �ϴϱ� i--
				System.out.println("�ߺ� i: " + i);
				continue;
			}
		}
	} // main

}
