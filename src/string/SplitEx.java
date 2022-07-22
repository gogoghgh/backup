package string;

public class SplitEx {

	public static void main(String[] args) {
		String str = "ȫ�浿, ��浿, ��浿";
		System.out.println(str);
		String[] names = str.split(", "); // ����Ÿ���� String[]
		for (String name : names)
			System.out.println("�̸�: " + name);
		System.out.println();

		str = "ȫ�浿 ��浿 ��浿";
		System.out.println(str);
		names = str.split(" ");
		for (String name : names)
			System.out.println("�̸�: " + name);
		System.out.println();

		str = "ȫ�浿a��浿z��浿c�̱浿";
		System.out.println(str);
//		names = str.split("a"); 
		// �����ڰ� �� �޶�� �ٵ� ��������? ���� ���ĺ��̳�~~
		// ���� ���ĺ��̴�~~ �� �˷��ִ� ���Խ�!!! ���
		names = str.split("[a-z]");
		// split�̶�� �޼��带 ��� ������!!
		// "���Խ� ���ڿ�"�� ���ڿ��� ���� �� �ƴ϶�
		// ��~ �̰� ���Խ��̱���~~ �ϰ� �����Ϸ��� �˾Ƹ��� �� �ִ� ��,,
		// split(String regex) ==> regular expression ���Խ��� �Ű������� �� �� �ֳ�~
		for (String name : names)
			System.out.println("�̸�: " + name);
		System.out.println();
		System.out.println("---------------------");
		System.out.println();

		// ����ڽ� ��ڽ�
		Integer num1 = new Integer(100);
		int num2 = 200;
		// Integer + int �԰���
		int sum = num1 + num2; // num.intValue()�� ��ȯ (��ڽ�: ��ü�� -> �⺻��)
		Integer num3 = num2; // Integer.valueOf(num2)�� ��ȯ(����ڽ�: �⺻ -> ��ü��)
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
	}

}
