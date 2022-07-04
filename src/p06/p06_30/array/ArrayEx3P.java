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
				if (num == lotto[j]) { // 중복이라면???
					System.out.println("중복 j: " + j);
					isContain = true;
					break;
				}
			}
			if (isContain) { // isContain이 true라면~~ 중복이라면~
				i--; // 없던 일로 하고 다시 돌려야 하니까 i--
				System.out.println("중복 i: " + i);
				continue;
			}
		}
	} // main

}
