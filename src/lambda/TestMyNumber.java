package lambda;

public class TestMyNumber {
	public static void main(String[] args) {
		// ���ٽ��� -> �������̽��� ���� max�� ����
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		// �������̽��� ����(max)�� �޼���(getMax) ȣ��
		System.out.println(max.getMax(10, 20));
	}
}