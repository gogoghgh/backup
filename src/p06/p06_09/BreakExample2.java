package p06.p06_09;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		for (num = 0;; num++) {
			sum += num;
			System.out.println("num: " + num + " / sum: " + sum);
			if (sum >= 100)
				break;
		}
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);

		System.out.println("---------------------");

		sum = 0;
		num = 0;

		for (num = 1;; num++) {
			sum += num;
			System.out.println("num: " + num + " / sum: " + sum);
			if (sum >= 500)
				break;
		}

		System.out.println("num: " + num);
		System.out.println("sum: " + sum);

	}

}
