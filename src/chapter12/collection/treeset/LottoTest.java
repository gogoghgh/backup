package chapter12.collection.treeset;

import java.util.Random;
import java.util.TreeSet;

public class LottoTest {

	public static void main(String[] args) {
		Random rand = new Random();
		TreeSet<Integer> set = new TreeSet<>();
		
		while(set.size()<6) {  // 중복이 생길 수도 있으니,, 중복 없이 6개 채울 때까지 돌려~~~
			int num = rand.nextInt(45+1);
			set.add(num);
		}
		
//		int num = rand.nextInt()
	}

}
