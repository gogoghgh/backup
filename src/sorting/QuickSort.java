package sorting;

public class QuickSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description(); // ���� Ŭ���� ȣ�� ���� �ϰ� + �� �ؿ� ������ �߰�
		System.out.println("My name is QuickSort~~~");
	}
}
