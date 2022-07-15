package sorting;

public interface Sort {
	public void ascending(int[] arr); 
				     // 설계할 때!! int[](변수 타입)만 놔두면 노노~ 
					// (int.. )만 있는 거나 마찬가지,, 
					// 변수명 암꺼나 써주삼 !!! (int a) 이것처럼~~
	public void descending(int[] arr);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다^^");
	}
}
