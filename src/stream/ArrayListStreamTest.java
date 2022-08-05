package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("다 Tomas");
		sList.add("가 Edward");
		sList.add("나 Jack");

		Stream<String> stream = sList.stream(); // 스트림1 생성
		stream.forEach(s -> System.out.println("s: " + s + " ")); // 배열의 요소를 하나씩 출력
		System.out.println();

		sList.stream().sorted().forEach(s -> System.out.println("s: " + s));
		// 스트림2 새로! 생성 / 정렬 / 요소 하나씩 꺼내어 출력
		// ∵ 한 번 생성한 스트림은 다시 사용 불가

	}

}
