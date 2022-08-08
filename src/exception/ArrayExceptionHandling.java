package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try { 
			// ���ܰ� �߻��� �� �����Ƿ�, try ��Ͽ� �ۼ�
			for(int i = 0; i <=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]); 
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// ���ܰ� �߻��ϸ� catch ��� ����
			System.out.println(e);
			System.out.println("���� ó�� �κ�");
		}
		System.out.println("���α׷� ����");

		
		System.out.println("--------- ArithmeticException ���α׷� ����---------");
		int num = 100;
		int num2 = 0;

		try {
			int a = num / num2;
		} catch (ArithmeticException e) {
			System.out.println("0���� ����");
			e.printStackTrace(); // ��� ���������� �˷��ִ� �޼���
			System.out.println(e.getLocalizedMessage()); // � �����޽��������� String ������~~ �ٲ㼭
		}

		System.out.println("���� ��");

	}

}
