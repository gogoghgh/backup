package p06.p06_09;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("1~10 합?  " + sum);
		System.out.println("--------------");

		for (i = 1; i <= 10; i++) {
			System.out.println("안녕하세요 " + i);
		}
	}

}
