package string;

public class StringTest1 {

	public static void main(String[] args) {
		System.out.println("-----�� �޸�-----");
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println();

		System.out.println("-----��� Ǯ-----");
		String str3 = "abc";
		String str4 = "abc";

		System.out.println("str3 == str4 : " + (str3 == str4));
		System.out.println("str3.equals(str4): " + str3.equals(str4));
	}

}
