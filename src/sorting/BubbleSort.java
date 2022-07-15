package sorting;

public class BubbleSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description(); // 상위 클래스 호출 먼저 하고 + 그 밑에 재정의 추가
		System.out.println("My name is BubbleSort~~~");
	}
}
