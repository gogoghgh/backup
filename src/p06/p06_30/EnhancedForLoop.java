package p06.p06_30;

public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] strArray = { "Java", "Android", "C", "JavaScript", "Python" };

		for (String lang : strArray) {
			System.out.println(lang);
		}

		int[] numArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int data : numArray) {
			System.out.println(data);
		}
	}// main

}
