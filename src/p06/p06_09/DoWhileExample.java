package p06.p06_09;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;

		do {
			sum += num;
			num++;
		} while (num <= 10);

		System.out.println("1~10 합은 " + sum + "입니다^_^");
	}

}
