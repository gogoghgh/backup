package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("�� Tomas");
		sList.add("�� Edward");
		sList.add("�� Jack");

		Stream<String> stream = sList.stream(); // ��Ʈ��1 ����
		stream.forEach(s -> System.out.println("s: " + s + " ")); // �迭�� ��Ҹ� �ϳ��� ���
		System.out.println();

		sList.stream().sorted().forEach(s -> System.out.println("s: " + s));
		// ��Ʈ��2 ����! ���� / ���� / ��� �ϳ��� ������ ���
		// �� �� �� ������ ��Ʈ���� �ٽ� ��� �Ұ�

	}

}
