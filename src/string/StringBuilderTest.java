package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		// 인스턴스가 처음 생성됐을 때 메모리 주소

		StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		System.out.println("buffer: " + buffer);
		System.out.println();

		// 문자열 추가
		System.out.println("문자열 추가 시작");
		buffer.append(" and");
		System.out.println("buffer: " + buffer);
		buffer.append(" android");
		System.out.println("buffer: " + buffer);
		buffer.append(" programming is fun!!!!");
		System.out.println("buffer: " + buffer);
		buffer.append(" are you serious,,//? ^^");
		System.out.println("buffer: " + buffer);
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		System.out.println();

		// String클래스로 반환
		javaStr = buffer.toString();
		System.out.println("javaStr: " + javaStr);
		System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		System.out.println("-----------------------");
		System.out.println();

		// 잠깐 substring ㅎㅎㅎ
		String str = "abc{love}ghi";
		String subStr = str.substring(4, 8); // 뒤에 인수는 +1 !!
		System.out.println("subStr: " + subStr);

		// indexOf도 써봅시다^^
		subStr = str.substring(str.indexOf('{'), str.indexOf('}') + 1);
		System.out.println("susStr: " + subStr);

	}

}
