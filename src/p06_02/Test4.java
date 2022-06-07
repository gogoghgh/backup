package p06_02;

public class Test4 {

//	public static void main(String[] args) {
//		int sum = 0;
//		int i = 1; // while 안에 얘가 들어가면,, i= 계~~~속 1이니까 무한대로 돎;;
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
			System.out.println("++전 i: " +i);
			sum += i;
			i++;
			System.out.println("++후 i: " +i+" / sum: " + sum);
			System.out.println("-----------------------------");
		}
		
		System.out.println(sum);
	}

}
