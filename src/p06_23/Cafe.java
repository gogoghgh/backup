package p06_23;

public class Cafe {
	//�������
	String drink;
	String cafeName;
	int orderPrice;
	int totalRevenue;
	int customerCount;

	//������
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

//	//�޼��� --- ���ô� ����
//	public String setDrinkMenu(String drink) {
//		this.drink = drink;
//		return this.drink;
//	}

//	//�޼��� --- ���� ����
//	public void makeMoney() {
//		this.totalRevenue += orderPrice;
//	}
	
	//�޼��� --- ���� ���� �ֹ�? & �ֹ��� ���� ���� & ���� ��++
	public void setOrder(String orderDrink, int orderPrice) {
		this.drink = orderDrink;
		this.orderPrice = orderPrice;
		totalRevenue += orderPrice;
		customerCount++;
		
	}

	// �޼��� --- ���� ��� 
	public String showInfo() {
		return cafeName + "���� " + orderPrice+"��¥�� " + drink + "�� ���״�";
	}
	
	public String moneyInfo() {
		return cafeName + " �� ����: " + totalRevenue +"�� / ���� ��: " + customerCount +"��";
	}

}
