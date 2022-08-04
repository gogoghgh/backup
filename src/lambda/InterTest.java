package lambda;

class InterClass implements Inter {
	@Override
	public void methodI() {
		System.out.println("Interface �߻�޼��� ���� ��");
	}
}// InterClass class


public class InterTest {
	public static void main(String[] args) {
		// �������̽� ���� ��� 3����
		// 1. �츮�� �� ������ �ؿԴ� ���~~
		InterClass ic = new InterClass();
		ic.methodI();

		
		// 2. �͸� Ŭ������ ������
		Inter i1 = new Inter() {
			@Override
			public void methodI() {
				System.out.println("�͸� Ŭ������ �߻�޼��� ���� ��");
			}
		};
		i1.methodI();

		
		// 3. ���� ǥ�������� �ٲ㺸��
		   Inter i2 = () -> {	System.out.println("���ٽ����� �߻�޼��� ���� ��");	};
		// Inter i2 = () -> System.out.println("���ٽ����� �߻�޼��� ���� ��");  �� �� ¥���� �߰�ȣ�� ���� �� ����
		i2.methodI();
			// ���ٰ� �� ��������?^^ 
			// �׷���,, �͸� Ŭ������ �ƹ� �������̽��� �� ������,
		 	// ���ٴ� ���� functional interface�ۿ� ���� �� ��~~
	
	}// main

}// InterTest class