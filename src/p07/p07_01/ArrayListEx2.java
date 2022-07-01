package p07.p07_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; /* i<7 */ lotto.size() <= 7; i++) { // 로또 사이즈가 7개 꽉 찰 때까지 돌려야 하니까.. 6번만 딱 돌리는 게 아니라!!
			int num = rand.nextInt(45) + 1; // 난수 발생 () 안에 난수 만들 범위(0부터 시작) 넣기
			if (!lotto.contains(num)) { // not 연산자 !
				lotto.add(num);
			}
		} // 그럼 for문 쓸 이유가 없네~~ while로 바꾸기

		while (lotto.size() < 7) {
			int num = rand.nextInt(45) + 1;
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		//끄집어내기~~~
		for (int i = 0; i < lotto.size(); i++) {
			System.out.print(lotto.get(i) + " ");
		}
		System.out.println();
		
		//배열일 때는 Arrays... 얘는 Collections로 정렬~~ 
		Collections.sort(lotto);
		
		//안에 내용물 보기
		for ( int data : lotto) System.out.print(data + " ");
		
		System.out.println();

	}// main

}
