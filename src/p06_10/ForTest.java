package p06_10;

public class ForTest {

	public static void main(String[] args) {
		System.out.println("----------------");
		for (int i = 100; i <= 105; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");
		int sum = 0;
		for (int i = 1;; i++) {
			if (sum > 20000) // sum�� 2���� ���� ��, for�� ����������
				break;
			sum += i;
			System.out.println("sum: " + sum + " / i: " + i);
		}
		System.out.println(sum);

		System.out.println("----------------"); // �ڵ� ������.. ^^; �� �Ѿ��~~
		for (int i = 1; i <= 2; i++) {
			System.out.print("i= " + i + " / j= ");
			for (int j = 1; j <= 3; j++) {
				System.out.print(j);
				if (j < 3) {
					System.out.print(", ");
				}
				// if(j>2) break;
				// System.out.print(", "); <<�̷��Ե� ǥ�� ����
			}
			System.out.println();
		}

		System.out.println("-----------------");

	}

}
