package sorting;

public class HeapSort implements Sort {
	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	@Override
	public void description() {
		Sort.super.description(); // ���� Ŭ���� ȣ�� ���� �ϰ� + �� �ؿ� ������ �߰�
		System.out.println("My name is HeapSort~~~");
	}
}
