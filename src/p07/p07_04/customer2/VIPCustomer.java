package p07.p07_04.customer2;

import p07.p07_04.customer.Customer; // �ٸ� ��Ű���ϱ�,, import�ؾ� Customer class ��� ������

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; // ��� ���� Ŭ�������� private �����̹Ƿ� ���� �߻�
								// so protected�� �ٲ���~~~
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//������ ���,,  �Ϳ�!! 
	@Override 	//Annotation �ּ�.. ��� ������ �ִ� �� �� ����^^
				// �� �̰� ��� ���� �� �������ѰŴϱ�,, �����Ϸ� �� �˾Ƽ� �����ؤ���,,, -_-^
				// �����ڰ� ������ �Ǽ� ���� �ʰԲ� �����Ϸ��� ������ �׾,, ������ �� ��ť
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // default Ÿ���̴ϱ�,, �� ���� -> protected�� �ٲٸ� ��
		return price - (int) (price * saleRatio);
	}
	
} //class


//�̷��� �ϸ� ,,, �ߺ��� �� ����~~ ����� ����~~~
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
//	// �� ���� Customer class�� ��ġ�� �⺯
//	// �� VIP Ŭ���������� �ʿ��� �⺯
//	private int agentID;
//	double saleRatio;
//
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	}
//
//	// �޼���
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int) (price * saleRatio); // ������ ������ ����
//	}
//
//	public int getAgentID() {
//		return agentID;
//	}
//
//	public String showCustomerInfo() {
//		return customerName + "���� ����� " + customerGrade + "�̸�, "
//				+ "���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
//	}
