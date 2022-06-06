package p05_30;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// String season = "봄";

		Scanner sc = new Scanner(System.in);
		System.out.println("좋아하는 계절을 입력하세요>>");

		String inputSeason = sc.next();

		switch (inputSeason) {
		/*
		 * ㄴ 이 안에 수식 or 값!!이 들어감... 불가넝한: boolean, 실수 타입, 정수long타입 가넝한: char, String,
		 * 정수..
		 */
		case "spring", "봄", "스프링":
			System.out.println("따뜻해");
			break;
		case "summer", "여름", "썸머":
			System.out.println("더워");
			break;
		case "fall", "가을", "폴":
			System.out.println("선선");
			break;
		case "winter", "겨울", "윈터":
			System.out.println("추워");
			break;
		default:
			System.out.println("잘못 입력하셨습니다..."); // 위의 케이스 외에 나머지 값들은 default로..
		}

	}

}
