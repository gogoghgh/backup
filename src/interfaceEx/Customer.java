package interfaceEx;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("���");
	}
	
	@Override
	public void sell() {
		System.out.println("�ȱ�");
	}
	
	// Buy, Sell �������̽��� order��� ����Ʈ �޼��尡 �ߺ��ż� �� ����,,
	// ��� �����ϴ� �ϰ�(Customer class) �������ض�! �װ� ���״ϱ�
	@Override
	public void order() {
		System.out.println("������: �� �Ǹ� �ֹ�..");
	}
	
}
