package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	protected double saleRatio;

	// ������
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05; // ������ 5�� ���� �Ϳ�
		saleRatio = 0.1; // 10�� ����?! ���
		this.agentID = agentID;
	}

	// �޼���
	// ������ override
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	} // �ٵ� �����ϸ� ȣ���� �� �ڸ��� �� ������ ������ ���� �ʳ�??
		// �ƴ���,, �� �� ���� ����

	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}

	// ���ͼ���
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getAgentID() {
		return agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

}
