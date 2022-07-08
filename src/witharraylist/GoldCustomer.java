package witharraylist;

import polymorphism.Customer; // 다른 패키지니까 import 해주고~~

public class GoldCustomer extends Customer {
	double saleRatio;

	// 생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02; // 2퍼 적립
		saleRatio = 0.1; // 10퍼 할인 와우
	}

	// 메서드 오버라이딩
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
}