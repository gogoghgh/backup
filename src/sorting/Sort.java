package sorting;

public interface Sort {
	public void ascending(int[] arr); 
				     // ������ ��!! int[](���� Ÿ��)�� ���θ� ���~ 
					// (int.. )�� �ִ� �ų� ��������,, 
					// ������ �ϲ��� ���ֻ� !!! (int a) �̰�ó��~~
	public void descending(int[] arr);
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�^^");
	}
}
