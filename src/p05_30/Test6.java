package p05_30;

public class Test6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " hello");
			}
			/*
			 * i++ �ڸ��� i+=2.. �̷��� �� ����~~ �������� ������,, �� i++�� ���.. Ȧ¦�� ������ ������,, �ϸ� ���� �ȿ��ٰ�
			 * if���� ����
			 */
		}

		// 1~10���� ���� ���? �� �ܿ��!! �� ����.. ��, ������ �� �ܿ��
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum = sum+i;
		}
			System.out.println(sum); // �Һ����� �ڵ�!! 1~10, 1~100, 1~10000���� ���ϵ�.. �� �̰�
		
			/*
			 * i = 1, sum = sum + i = (0) + 1 = 1 
			 * i = 2, sum = sum + i = (0 + 1) + 2 = 3 
			 * i = 3, sum = sum + i = (0 + 1 + 2) + 3 = 6...
			 * ...
			 * i = 10, sum = sum + i = (0 + 1 + 2 + 3+ ... + 8 + 9) + 10 = 55
			 */
			
		int product = 1;
		for(i = 1; i <=10; i++) {
			product = product*i;
		}
		System.out.println(product);
	
		
		/*������ scope: ���� i�� for�ȿ��� �����ϸ�, for�� �ȿ����� i ���� ��ȿ��.. 
		���� ������ ������ ���� ���ΰ�??!
		for�� �ȿ����� ���� �� ����~ �ϸ� for�� �ȿ��� �����ϰ�, 
		��� ���� ������ for�� �ۿ�, ���� �޼��� �ؿ� �����ϱ� */
		
	
	}
	
	
}
