package p06.p06_23.p197_Q5_cafe;

public class Cafe {
	// 멤버변수
	String drink;
	String cafeName;
	int orderPrice;
	int totalRevenue;
	int customerCount;

	// 생성자
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	// 메서드 --- 무슨 음료 주문? & 주문한 음료 가격 & 누적 고객++
	public void setOrder(String orderDrink, int orderPrice) {
		this.drink = orderDrink;
		this.orderPrice = orderPrice;
		totalRevenue += orderPrice;
		customerCount++;
	}

	// 메서드 --- 정보 출력
	public String showInfo() {
		return cafeName + "에서 " + orderPrice + "원짜리 " + drink + "를 시켰다";
	}

	public String moneyInfo() {
		return cafeName + " 총 수입: " + totalRevenue + "원 / 누적 고객: " + customerCount + "명";
	}
	
//	아래 두 메서드 합쳐서 setOrder로..
//	//메서드 --- 마시는 음료
//	public String setDrinkMenu(String drink) {
//		this.drink = drink;
//		return this.drink;
//	}
//
//	//메서드 --- 누적 매출
//	public void makeMoney() {
//		this.totalRevenue += orderPrice;
//	}

}
