package p06_23;

public class Person {
	// ��� ����
	String name;
	String cafeName; // ī�� Ŭ���� Ÿ���� cafe ��� ����..
	int money;

	// ������
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// �޼��� --- Ŀ�Ǽ� Ŭ����->Ŀ�Ǽ� �̸��� �Ű�������
//	public String goCoffeeShop(Cafe cs) {
//		return goCafe = cs.cafeName;
//	}

//	�ܴ� ��
//	public void goCoffeeShop(CoffeeShop cs) {
//		CoffeeShop = cs;
//	}

	// �޼��� --- ��� ī�� ���� && �� �質?
	public void buyDrink(Cafe cf) {
//		cf.setOrder(sc.next(), money);
		this.cafeName = cf.cafeName;
		this.money -= cf.orderPrice;
	}
	// cannot convert from String to Cafe

	// Ŀ�� ��� �޼���,,,,,,,,,
	// �� ���� - / ī�� ������ +
//	public void buyCoffee(Cafe cf) {
//		this.money -= cf.orderPrice;
//	}

//	public void take(int money) {

	public String showInfo() {
		return name + "�� " + cafeName + "�� ����.." ;				
	}
	
	public String moneyInfo() {
		return "( "+ name +"�� ���� ���� " + money + "�� )";
	}

	
}
