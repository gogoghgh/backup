package innerclass;

import innerclass.OutClass.InClass;

//�ܺ� Ŭ����
class OutClass {
	// �������
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass; // ���� Ŭ����(InClass) �ڷ���! ������ ���� ����

	// ������
	public OutClass() {
		inClass = new InClass();
		// �ܺ� Ŭ���� ����Ʈ ������.
		// �ܺ� Ŭ������ ������ �Ŀ� -> ���� Ŭ���� ���� ����
	}

	// ���� Ŭ���� ����
	class InClass {
		int inNum = 100;
		static int sInNum = 200; // �ν��Ͻ� ���� Ŭ������ ���� ���� ���� �Ұ���..
								// -> 16���� �̻���ʹ� ��� ����^^

		void inTest() {
			System.out.println("OutClass num: " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum: " + sNum + "(�ܺ� Ŭ������ ���� ����)");
		}

		static void sTest() { // �ν��Ͻ� ���� Ŭ������ ���� �޼��� ���� ���� �Ұ���
							  // -> 16���� �̻���ʹ� ��� ����^^
			System.out.println("static method�Դϴٸ�.. + sInNum: " + sInNum);
		}
	} // InClass

	public void usingClass() {
		inClass.inTest(); // �ܺ�-> ���� ��ü ���� ���� ��� ������~
	}

} // OutClass



public class InnerTest {
	public static void main(String[] args) {
		//OutClass ��ü ����
		OutClass outClass = new OutClass();
		
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� -> ���� Ŭ���� ���(�޼���) ȣ��");
		outClass.usingClass(); // �ܺ� ��ü�� -> ���� Ŭ���� ��� ȣ�� ����
		InClass.sTest(); // static�̴ϱ� ��ü ���� �ʿ� ���� Ŭ���� �̸� �ް� ȣ�� ����
		System.out.println();
		
		//InClass ��ü ����,,, 
			// ���� ���� �ϰ� �ʹٸ� �̷��� �� �� �ֱ� �ѵ� �� ������� �ʴ´�~
		System.out.println("------ Inner Class ------");
		OutClass.InClass inClass = outClass.new InClass(); 
		inClass.inTest();
		InClass.sTest(); // static�̴ϱ� ��ü ���� �ʿ� ���� Ŭ���� �̸� �ް� ȣ�� ����
		inClass.sTest(); 
	}

}