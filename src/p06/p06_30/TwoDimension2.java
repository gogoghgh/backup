package p06.p06_30;

public class TwoDimension2 {

	public static void main(String[] args) {
		int[][] arr = new int[2][3];

		for (int i = 0; i < arr.length; i++) { // �� ���̸�ŭ ����
			for (int j = 0; j < arr[i].length; j++) { // �� ���̸�ŭ ����
				System.out.println("arr[" + i + "][" + j + "]: " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("arr.length: " + arr.length);
		System.out.println("arr[0].length: " + arr[0].length);
		System.out.println("arr[1].length: " + arr[1].length);
		System.out.println();

		// ���ĺ� �ҹ��ڸ� 2���ھ� 13��,, 13�� 2���� ���
		// a b
		// c d
		// e f
		// g h
		char[][] ch = new char[13][2];
		char alphabet = 97; // �ҹ��� a=97, �빮�� A=65

		for (int i = 0; i < ch.length; i++) { // ch.length = �� ���� = 13 !!!
			for (int j = 0; j < ch[i].length; j++, alphabet++) { // ch[0~12].length = �� ���� = 2!!!
				ch[i][j] = alphabet;
				System.out.print("ch[" + i + "][" + j + "]: " + ch[i][j] + " / " + (int) ch[i][j]);
				System.out.print("     ");
			}
			System.out.println();
		}
		System.out.println("��^^");

	} // main

}
