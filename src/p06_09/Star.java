package p06_09;

public class Star {

	public static void main(String[] args) {
		for (int a = 1; a <= 4; a++) {
			System.out.print(" ");
			for (int b = 1; b<=3; b++) {
				System.out.print(" ");
				for (int c = 1; c<=2; c++) {
					System.out.print(" ");
					for (int d = 1; d<=1; d++) {
						System.out.print("*");
					}System.out.println();
				}
			}
		}
	}
}