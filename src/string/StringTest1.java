package string;

public class StringTest1 {

	public static void main(String[] args) {
		System.out.println("-----힙 메모리-----");
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println();

		System.out.println("-----상수 풀-----");
		String str3 = "abc";
		String str4 = "abc";

		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4): " + str3.equals(str4));
	}

}
