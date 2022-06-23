package p06_23;

public class CoffeeShop {
	//멤버변수
	String drink;
	String csName;
	int orderPrice;
	int takeMoney;

	//생성자
	public CoffeeShop(String csName) {
		this.csName = csName;
	}

	//메서드 --- 마시는 음료
	public String setDrink(String drink) {
		this.drink = drink;
		return this.drink;
	}

	//메서드 --- 주문 가격
	public void setMenu(int orderPrice) {
		this.orderPrice = orderPrice; 
	}
	
	//메서드 --- 하나 팔고 수입+
	public void takeMoney() {
		this.takeMoney += orderPrice;
	}
	

	public String showInfo() {
		return csName + "에서 " + orderPrice+"원짜리 " + drink + "를 시켰다";
	}
	
	public String moneyInfo() {
		return "총 수입: " + takeMoney +"원";
	}

}
