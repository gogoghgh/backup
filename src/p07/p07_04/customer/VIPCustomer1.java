package p07.p07_04.customer;

public class VIPCustomer1 {
//	이렇게 하면 ,,, 중복이 넘 많아~~ 상속을 쓰자~~~
	int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;
	// ㄴ 기존 Customer class랑 겹치는 멤변
	// ㄱ VIP 클래스에서만 필요한 멤변
	int agentID;
	double saleRatio;

	public VIPCustomer1() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	// 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio); // 할인율 적용한 가격
	}

	public int getAgentID() {
		return agentID;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, " + 
				"보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public String getCustomerName() {
		return customerName;		
	}
	
}