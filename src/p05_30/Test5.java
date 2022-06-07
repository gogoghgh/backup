package p05_30;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// switch로 a b c d f 등급 내기
		// int score = 99;
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요 ↓");
		int inputScore = sc.nextInt();

		switch (inputScore / 10) {
		case 10: // 브레이크 없고 식도 없네? 밑으로 쭉죽 내려가~~ 케이스 9에서 A등급 찍히고, 브레이크 걸려서 --> switch문 빠져나옴
			/*
			 * case 10: System.out.println("A등급"); break; case 9, 10이 같네,,, 비효율적이야,, 지우자~~~
			 */
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		default:
			System.out.println("F등급");
		}
		// case 10, 9 : ... java 12버전부터는 쉼표로 연결도 가능~~
		// case 10, 9 -> ... 화살표 들어가면 break 없애야 함
		/*
		 * System.out.println( switch( ) { case 10,9 -> " "; case 8 -> " "; ,... default
		 * -> " "; } ); 이렇게 쓰기도 함!! println이 겉에 나가서 감싸고 있는 형태.. 왜? 일일이 쓰기 귀찮아서
		 */

	}

}
