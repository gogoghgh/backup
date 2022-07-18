package object;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		// abc 문자열의 해시 코드 값 출력
		System.out.println("str1.hashCode(): " + str1.hashCode());
		System.out.println("str2.hashCode(): " + str2.hashCode());
		System.out.println();

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		// Integer(100)의 해시 코드 값 출력
		System.out.println("i1.hashCode(): " + i1.hashCode());
		System.out.println("i2.hashCode(): " + i2.hashCode());

	}

}
