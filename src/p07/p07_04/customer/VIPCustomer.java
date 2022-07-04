package p07.p07_04.customer;

public class VIPCustomer extends Customer{
	// 5���� Customer ������� + 2���� �޼���(calcPrice(), showCustomerInfo()) ��ӹ���
	// �ٵ� VIPCustomer �޼���� �޶�~~ �� ��.��.��.!! ������.��.��.!!!
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; // ��� ���� Ŭ�������� private �����̹Ƿ� ���� �߻�
								// so protected�� �ٲ���~~~
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer ������ (�ڽ�) ");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//������ ���,,  �Ϳ�!! 
	@Override 	//Annotation �ּ�.. ��� ������ �ִ� �� �� ����^^
				// �� �̰� ��� ���� �� �������ѰŴϱ�,, �����Ϸ� �� �˾Ƽ� �����ؤ���,,, -_-^
				// �����ڰ� ������ �Ǽ� ���� �ʰԲ� �����Ϸ��� ������ �׾,, ������ �� ��ť
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // int * double = double�ε� int�� ���� ����ȯ
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
