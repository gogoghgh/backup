package p07.p07_04.customer;

public class VIPCustomer1 {
//	�̷��� �ϸ� ,,, �ߺ��� �� ����~~ ����� ����~~~
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	// �� ���� Customer class�� ��ġ�� �⺯
	// �� VIP Ŭ���������� �ʿ��� �⺯
	int agentID;
	double saleRatio;

	public VIPCustomer1() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	// �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // ������ ������ ����
	}

	public int getAgentID() {
		return agentID;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, " + 
				"���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	public String getCustomerName() {
		return customerName;		
	}
	
}