package p06.p06_23.p197_Q5_cafe;

public class Cafe {
	// �������
	String drink;
	String cafeName;
	int orderPrice;
	int totalRevenue;
	int customerCount;

	// ������
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	// �޼��� --- ���� ���� �ֹ�? & �ֹ��� ���� ���� & ���� ��++
	public void setOrder(String orderDrink, int orderPrice) {
		this.drink = orderDrink;
		this.orderPrice = orderPrice;
		totalRevenue += orderPrice;
		customerCount++;
	}

	// �޼��� --- ���� ���
	public String showInfo() {
		return cafeName + "���� " + orderPrice + "��¥�� " + drink + "�� ���״�";
	}

	public String moneyInfo() {
		return cafeName + " �� ����: " + totalRevenue + "�� / ���� ��: " + customerCount + "��";
	}
	
//	�Ʒ� �� �޼��� ���ļ� setOrder��..
//	//�޼��� --- ���ô� ����
//	public String setDrinkMenu(String drink) {
//		this.drink = drink;
//		return this.drink;
//	}
//
//	//�޼��� --- ���� ����
//	public void makeMoney() {
//		this.totalRevenue += orderPrice;
//	}

}
