package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	protected double saleRatio;

	// 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05; // 가격의 5퍼 적립 와우
		saleRatio = 0.1; // 10퍼 할인?! 대박
		this.agentID = agentID;
	}

	// 메서드
	// 재정의 override
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	} // 근데 리턴하면 호출한 그 자리에 이 가격이 찍혀야 하지 않나??
		// 아니지,, 걍 값 대입 ㅎㅎ

	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}

	// 게터세터
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
