package p06_02;

public class Test2 {
	public static void main(String[] args) {
//		// ---�ݺ��� ����---//
//		int i;
//		for (i = 1; i <= 10; i++) {
//			System.out.println(i + " Hello~~");
//		}
//
//		//----1���� 10���� ���ϱ�----//
//		int sum = 0;
//		for (i = 1; i <= 100; i++) {
//			sum += i;
//			System.out.println("i = " + i + " / sum = " + sum);
//		} 

		int i;
		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				System.out.println("i= " + i + " / Hello^^~~");
		}

		System.out.println("----------------");
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			if(i%2 == 0) {
			sum += i;
			System.out.println("i= " + i + " / sum= " + sum);
			}
		}

	}

}
