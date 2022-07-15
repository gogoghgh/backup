package p07.p07_04.customer;

public class Customer {
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	ㄴ 상속하려면 protected 로 바꿔야 해서^^;; 바꿀게염
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
//	근데 샘님이 귀찮으니까 protected 빼고 하자고 하심 ㅎㅎㅎ
//	int customerID;
//	String customerName;
//	String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 보너스 포인트 기본 적립 비율
		System.out.println("Customer 생성자 (상위)");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}

	// 메서드 시작~~~
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산 (적립 얼마나 되나)
		return price; // 지불 가격 계산
	}

	// protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록
	// getter setter 메서드 추가
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
		return customerName + "님의 등급은 " + customerGrade + "이며, " + "보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	@Override
		public String toString() {
			return "고객님 이름: " + customerName + " / 고객님 등급: " + customerGrade + " / 고객님 ID: " + customerID;
		}
	
}
