package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;

	// 생성자
	public Customer() {
		initCustomer();
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// 메서드
	private void initCustomer() { // 생성자에서만 호출하는 메서드이므로 private으로 선언 // main -> new 생성자 -> private 은 ㅇㅋ?
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 1퍼 적립
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다^^";
	}

	// 게터세터메서드
	// 게터세터는 다?,,, 객체에 필요한 '정보'면 다!! 하는게 좋음
	// 배열~ 뭐 이런건 안 해도 되지만..
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

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}
