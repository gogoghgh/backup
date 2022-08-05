package lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class TestLambda {
	public static void showMyString(PrintString p) { 
							// �Ű������� �������̽�(PrintString)������ ����
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "world~~"); // ���ٽ��� ��ȯ�ϴ� �޼���
	}

	public static void main(String[] args) {
		// ���ٽ��� -> �������̽�(PrintString)�� ����(lambdaStr)�� �����ϰ� 
		// -> �� ������ ����� ���ٽ� ������(showString) ȣ��
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		// �޼���(showMyString)�� �Ű������� ���ٽ��� ������ ����(lambdaStr) ����
		showMyString(lambdaStr);
		
		showMyString(s->System.out.println(s)); // �̷��� �Ű����� �ڸ��� ���ٽ� �ٷ� �־ ����
		showMyString(s->System.out.println(s + "�ɱ� �ٸ��� ����,,"));
		
		PrintString reStr = returnString(); // ������ ��ȯ�ޱ�
		reStr.showString("hello~~ "); // �޼��� ȣ��
	}

}