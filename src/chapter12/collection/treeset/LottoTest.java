package chapter12.collection.treeset;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		Random rand = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()<6) {  // �ߺ��� ���� ���� ������,, �ߺ� ���� 6�� ä�� ������ ����~~~
			int num = rand.nextInt(45+1);
			set.add(num);
		}
		
//		int num = rand.nextInt()
	}

}
