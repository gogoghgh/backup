package p06_23;

public class CoffeeShop {
	//�������
	String drink;
	String csName;
	int orderPrice;
	int takeMoney;

	//������
	public CoffeeShop(String csName) {
		this.csName = csName;
	}

	//�޼��� --- ���ô� ����
	public String setDrink(String drink) {
		this.drink = drink;
		return this.drink;
	}

	//�޼��� --- �ֹ� ����
	public void setMenu(int orderPrice) {
		this.orderPrice = orderPrice; 
	}
	
	//�޼��� --- �ϳ� �Ȱ� ����+
	public void takeMoney() {
		this.takeMoney += orderPrice;
	}
	

	public String showInfo() {
		return csName + "���� " + orderPrice+"��¥�� " + drink + "�� ���״�";
	}
	
	public String moneyInfo() {
		return "�� ����: " + takeMoney +"��";
	}

}
