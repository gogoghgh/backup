package p07.p07_04.customer;

public class Customer {
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	�� ����Ϸ��� protected �� �ٲ�� �ؼ�^^;; �ٲܰԿ�
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
//	�ٵ� ������ �������ϱ� protected ���� ���ڰ� �Ͻ� ������
//	int customerID;
//	String customerName;
//	String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; // ���ʽ� ����Ʈ �⺻ ���� ����
		System.out.println("Customer ������ (����)");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}

	// �޼��� ����~~~
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ��� (���� �󸶳� �ǳ�)
		return price; // ���� ���� ���
	}

	// protected ������ ������ ������ �ܺο��� ����� �� �ֵ���
	// getter setter �޼��� �߰�
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, " + "���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
	@Override
		public String toString() {
			return "���� �̸�: " + customerName + " / ���� ���: " + customerGrade + " / ���� ID: " + customerID;
		}
	
}
