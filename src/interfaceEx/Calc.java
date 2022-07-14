package interfaceEx;

public interface Calc {
	double PI = 3.14;
	double ERROR = -999999999; // �������̽����� ������ ������ -> ������ �������� ����� ��ȯ��
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	double divide(int num1, int num2); // �������̽����� ������ �޼���� -> ������ �������� �߻� �޼���� ��ȯ��
	
	int square(int num);
	
	//�������̽��� ����Ʈ �޼��� �߰� ������..
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�~~");
		myMethod(); //����Ʈ �޼��忡�� private �޼��� ȣ��
	}
	
	//�������̽��� ���� �޼��� total() ����
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		
		myStaticMethod(); //���� �޼��忡�� private static �޼��� ȣ��
		return total;
	}
	
	// �������̼� �������� �� �� �ֵ���,, private method
	private void myMethod() {
		System.out.println("private �޼����Դϴ�.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static �޼����Դϴ�.");
	}
	
	
	
}
