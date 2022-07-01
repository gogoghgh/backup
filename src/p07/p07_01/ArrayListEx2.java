package p07.p07_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random rand = new Random();

		for (int i = 0; /* i<7 */ lotto.size() <= 7; i++) { // �ζ� ����� 7�� �� �� ������ ������ �ϴϱ�.. 6���� �� ������ �� �ƴ϶�!!
			int num = rand.nextInt(45) + 1; // ���� �߻� () �ȿ� ���� ���� ����(0���� ����) �ֱ�
			if (!lotto.contains(num)) { // not ������ !
				lotto.add(num);
			}
		} // �׷� for�� �� ������ ����~~ while�� �ٲٱ�

		while (lotto.size() < 7) {
			int num = rand.nextInt(45) + 1;
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		//�������~~~
		for (int i = 0; i < lotto.size(); i++) {
			System.out.print(lotto.get(i) + " ");
		}
		System.out.println();
		
		//�迭�� ���� Arrays... ��� Collections�� ����~~ 
		Collections.sort(lotto);
		
		//�ȿ� ���빰 ����
		for ( int data : lotto) System.out.print(data + " ");
		
		System.out.println();

	}// main

}
