package p06_02;

public class Test4 {

//	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1; // while �ȿ� �갡 ����,, i= ��~~~�� 1�̴ϱ� ���Ѵ�� ��;;
//		while (i <= 10) {
//			sum += i;
//			i++;
//			System.out.println("i: " + i + "/ sum: " + sum);
//		}
//
//		System.out.println(sum);
//	}
	
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i<=10) {
			System.out.println("++�� i: " +i);
			sum += i;
			i++;
			System.out.println("++�� i: " +i+" / sum: " + sum);
			System.out.println("-----------------------------");
		}
		
		System.out.println(sum);
	}

}
