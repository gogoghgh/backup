package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));

		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("java + android Str ����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
		javaStr = javaStr.concat(javaStr);
		System.out.println(javaStr);
		System.out.println("java + java Str ����� ���ڿ� �ּ� ��: " + System.identityHashCode(javaStr));
	}

}
