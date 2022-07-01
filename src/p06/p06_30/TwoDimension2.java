package p06.p06_30;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		for (int i = 0; i < arr.length; i++) { // 행 길이만큼 돈다
			for (int j = 0; j < arr[i].length; j++) { // 열 길이만큼 돈다
				System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("arr.length: " + arr.length);
		System.out.println("arr[0].length: " + arr[0].length);
		System.out.println("arr[1].length: " + arr[1].length);
		System.out.println();

		// 알파벳 소문자를 2글자씩 13줄,, 13행 2열로 출력
		// a b
		// c d
		// e f
		// g h
		char[][] ch = new char[13][2];
		char alphabet = 97; // 소문자 a=97, 대문자 A=65

		for (int i = 0; i < ch.length; i++) { // ch.length = 행 길이 = 13 !!!
			for (int j = 0; j < ch[i].length; j++, alphabet++) { // ch[0~12].length = 열 길이 = 2!!!
				ch[i][j] = alphabet;
				System.out.print("ch[" + i + "][" + j + "]: " + ch[i][j] + " / " + (int) ch[i][j]);
				System.out.print("     ");
			}
			System.out.println();
		}
		System.out.println("끝^^");

	} // main

}
