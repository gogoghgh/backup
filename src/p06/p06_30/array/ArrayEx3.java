package p06.p06_30.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] lotto = new int[7];
		Random rand = new Random(); // ���� ���̺귯��,,,

		for (int i = 0; i < lotto.length; i++) {
			int num = rand.nextInt(45) + 1;
			System.out.println(num);
			boolean isContain = false; // �������� �ʴ´�,, �����ϸ� true
			for (int j = 0; j < i; j++) { // i-1����! ������ �Ǵϱ� .. j <=i-1 �̰ų�,,
				System.out.println(" j: " + j);
				if (num == lotto[j]) { // �ߺ��� �����ϱ� ���ؼ�,,
//					i--; 
//					continue;
					System.out.println("�ε��� j: " + j);
					isContain = true; // �ߺ��� ������ true�� �ٲ�鼭 for�� ����������
					break;
				}
				// if (isContain)
				// isContain�� true�̸� break�� ����������..
				// flase�� �ƹ� �ϵ� �� �ϰ� ��� for�� ����~
			}
			if (isContain) {
				i--;
				System.out.println("�ε��� i: " + i);
				continue;
			}
			lotto[i] = num; // �������� �ߺ����� �ʾ��� ����! lotto[i]�� �ֱ�
//			lotto[i] = rand.nextInt(45) + 1;
			// scanner nextInt�� ����ڷκ��� ���� �Է¹޴� ���������
			// random ���� nextInt�� �������� ���� ����ִ�,,, ���
			System.out.println(Arrays.toString(lotto));
		}
		Arrays.sort(lotto); // ����!!
		//Collection.sort(lotto); ???

		System.out.println(Arrays.toString(lotto));

	} // main

}
