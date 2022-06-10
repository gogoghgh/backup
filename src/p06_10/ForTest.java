package p06_10;

public class ForTest {

	public static void main(String[] args) {
		System.out.println("----------------");
		for (int i = 100; i <= 105; i++) {
			System.out.println(i);
		}
		System.out.println("----------------");
		int sum = 0;
		for (int i = 1;; i++) {
			if (sum > 20000) // sum이 2억이 넘을 때, for문 빠져나오삼
				break;
			sum += i;
			System.out.println("sum: " + sum + " / i: " + i);
		}
		System.out.println(sum);

		System.out.println("----------------"); // 코드 지저분.. ^^; 걍 넘어가삼~~
		for (int i = 1; i <= 2; i++) {
			System.out.print("i= " + i + " / j= ");
			for (int j = 1; j <= 3; j++) {
				System.out.print(j);
				if (j < 3) {
					System.out.print(", ");
				}
				// if(j>2) break;
				// System.out.print(", "); <<이렇게도 표현 가능
			}
			System.out.println();
		}

		System.out.println("-----------------");

	}

}
