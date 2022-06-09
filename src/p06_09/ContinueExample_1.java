package p06_09;

public class ContinueExample_1 {

	public static void main(String[] args) {
		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) {
			if (num % 5 != 0) {
				System.out.println("continue?= " + num);
				continue;
			}
			total += num;
			System.out.println("num= " + num + " / total = " + total);
		}
		System.out.println("1~100 5의 배수의 합은 " + total);
	}

}
