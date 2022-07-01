package p06.p06_30.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] lotto = new int[7];
		Random rand = new Random(); // 랜덤 라이브러리,,,

		for (int i = 0; i < lotto.length; i++) {
			int num = rand.nextInt(45) + 1;
			System.out.println(num);
			boolean isContain = false; // 포함하지 않는다,, 포함하면 true
			for (int j = 0; j < i; j++) { // i-1까지! 돌려야 되니까 .. j <=i-1 이거나,,
				System.out.println(" j: " + j);
				if (num == lotto[j]) { // 중복값 제거하기 위해서,,
//					i--; 
//					continue;
					System.out.println("인덱스 j: " + j);
					isContain = true; // 중복값 나오면 true로 바뀌면서 for문 빠져나오기
					break;
				}
				// if (isContain)
				// isContain이 true이면 break로 빠져나오기..
				// flase면 아무 일도 안 하고 계속 for문 돈다~
			}
			if (isContain) {
				i--;
				System.out.println("인덱스 i: " + i);
				continue;
			}
			lotto[i] = num; // 난수들이 중복되지 않았을 때만! lotto[i]에 넣기
//			lotto[i] = rand.nextInt(45) + 1;
			// scanner nextInt는 사용자로부터 정수 입력받는 기능이지만
			// random 에서 nextInt는 랜덤으로 숫자 골라주는,,, 기능
			System.out.println(Arrays.toString(lotto));
		}
		Arrays.sort(lotto); // 정렬!!
		//Collection.sort(lotto); ???

		System.out.println(Arrays.toString(lotto));

	} // main

}
