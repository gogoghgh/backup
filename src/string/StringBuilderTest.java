package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		// �ν��Ͻ��� ó�� �������� �� �޸� �ּ�

		StringBuilder buffer = new StringBuilder(javaStr); // String���κ��� StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		System.out.println("buffer: " + buffer);
		System.out.println();

		// ���ڿ� �߰�
		System.out.println("���ڿ� �߰� ����");
		buffer.append(" and");
		System.out.println("buffer: " + buffer);
		buffer.append(" android");
		System.out.println("buffer: " + buffer);
		buffer.append(" programming is fun!!!!");
		System.out.println("buffer: " + buffer);
		buffer.append(" are you serious,,//? ^^");
		System.out.println("buffer: " + buffer);
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		System.out.println();

		// StringŬ������ ��ȯ
		javaStr = buffer.toString();
		System.out.println("javaStr: " + javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		System.out.println("-----------------------");
		System.out.println();

		// ��� substring ������
		String str = "abc{love}ghi";
		String subStr = str.substring(4, 8); // �ڿ� �μ��� +1 !!
		System.out.println("subStr: " + subStr);

		// indexOf�� �Ế�ô�^^
		subStr = str.substring(str.indexOf('{'), str.indexOf('}') + 1);
		System.out.println("susStr: " + subStr);

	}

}
