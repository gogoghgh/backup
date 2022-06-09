package p06_09;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 200;
		int sum = 0;

		while (num <= 300) {
			sum += num;
			num++;
			System.out.println("num: " + num + " / sum: " + sum);
		}
		System.out.println("200~300의 합은 " + sum + "입니다.");
		System.out.println("---------------");

	}

}
