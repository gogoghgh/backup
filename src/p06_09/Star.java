package p06_09;

// 별 찍기 숙제..
public class Star {

	public static void main(String[] args) {
		System.out.println("--------------직사각형");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------직각삼각형");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------직각삼각형(역)");
		for (int i = 0; i < 5; i++) {
//			for (int j = 5; i < j; j--) { 쪼까 아쉬운 가현스 답^^;;ㅎㅎㅎ
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------피라미드(가현)"); // ㅁㅊㅁㅊ대박 나왔다!!!!!!! 이게 되네 ㄷㄷ
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if ((i + j < 3) || (j - i > 3)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 19; j++) {
				if ((i + j < 9) || (j - i > 9)) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------피라미드(구글..)");
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------피라미드(역)");
//		for (int i = 0; i < 4; i++) {
//			for (int j=0; j < )
//		}
		for (int i = 4; i > 0; i--) { // 아래쪽 삼각형
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}