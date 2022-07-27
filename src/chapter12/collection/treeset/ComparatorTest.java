package chapter12.collection.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1; // 내림차순으로 정렬
	}

}

public class ComparatorTest {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		// TreeSet 생성자의 매개 변수로 정렬 방식을 지정
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println("set: " + set);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(4);
		list.add(200);
		list.add(10);
		Collections.sort(list); // 오름차순 정렬
//		Collections.sort(list, new MyComparator()); // 내림차순 정렬하려고..
		System.out.println("list: " + list);
	}
}

class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 - o2);
//		return (o1 - o2) * -1; // 내림차순 정렬
	}
}