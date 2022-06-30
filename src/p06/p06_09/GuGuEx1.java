package p06.p06_09;

public class GuGuEx1 {

	public static void main(String[] args) {

		for (int dan = 1; dan <= 19; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println("---------");
		}
		System.out.println("----------------------------------");

		for (int dan = 3; dan <= 7; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println("-------------");
		}

	}

}
