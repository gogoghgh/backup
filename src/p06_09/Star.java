package p06_09;

// �� ��� ����..
public class Star {

	public static void main(String[] args) {
		System.out.println("--------------���簢��");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------�����ﰢ��");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------�����ﰢ��(��)");
		for (int i = 0; i < 5; i++) {
//			for (int j = 5; i < j; j--) { �ɱ� �ƽ��� ������ ��^^;;������
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------�Ƕ�̵�(����)"); // ����������� ���Դ�!!!!!!! �̰� �ǳ� ����
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if ((i + j < 3) || (j - i > 3)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 19; j++) {
				if ((i + j < 9) || (j - i > 9)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------�Ƕ�̵�(����..)");
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------�Ƕ�̵�(��)");
//		for (int i = 0; i < 4; i++) {
//			for (int j=0; j < )
//		}
		for (int i = 4; i > 0; i--) { // �Ʒ��� �ﰢ��
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}