package p05_30;

public class Test3 {
	public static void main(String[] args) {
		int score = 77;

		if (score >= 90 && score <= 100) {
			System.out.println("A등급");
		} else if (score >= 80 && score < 90) {
			System.out.println("B등급");
		} else if (score >= 70 && score < 80) {
			System.out.println("C등급");
		} else if (score >= 60 && score < 70) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		// while(true){ } <-- 조건이 참이면 무한대로 돌겠다 ㄷㄷㄷ..

	}
}
