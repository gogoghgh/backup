package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");

		int ch = System.in.read();
		        //System 클래스 → static 멤버변수 in → in은 InputStream class type,, 
				// → read() 메서드 갖고 있음(8비트씩 데이터를 읽어온다)
		Sort sort = null; // 초기값 = null

		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("지원되지 않는 기능입니다...ㅠㅠ 어떡해~~ ");
			return;
		}
		
		// 어떤 정렬 방식인지~~ 와 상관없이 
		//  ㄴ = QuickSort.~~ / HeapSort.~~ / BubbleSort.~~ 이렇게 안 하고 
		// Sort.~~~ 로 한방에!! 선언된 메서드 호출할 수 있음^^
		int[] arr = new int[10];  // 장원: 샘님,, 우리는 arr 쓰지도 않는데 왜 씁니까,,, 
		sort.ascending(arr);      // 샘: 설계도대로~~ 일달 만든 것~~ 아직 다 만들어진 건 아니지만,, 잘 돌아가나 보려고 뭐라도(println) 넣은 것,,,  '스텁' 개념으로!!
		sort.descending(arr);
		sort.description();
		
	} //main

}
