package p06_23.p197_Q5_cafe;

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

	
	// �޼��� --- ��� ī�� ���� && �� �質?
	public void buyDrink(Cafe cf) {
//		cf.setOrder(sc.next(), money);
		this.cafeName = cf.cafeName;
		this.money -= cf.orderPrice;
	}

	//�޼��� -- ���� ���
	public String showInfo() {
		return name + "�� " + cafeName + "�� ����..";
	}

	public void moneyInfo() {
		System.out.println("( "+ name +"�� ���� ���� " + money + "�� )"); 	
	}
	
//	 �޼��� --- Ŀ�Ǽ� Ŭ����->Ŀ�Ǽ� �̸��� �Ű�������
//	public String goCoffeeShop(Cafe cs) {
//		return goCafe = cs.cafeName;
//	}

//	�ܴ� ��
//	public void goCoffeeShop(CoffeeShop cs) {
//		CoffeeShop = cs;
//	}
	
//	 Ŀ�� ��� �޼���,,,,,,,,,
//	 �� ���� - / ī�� ������ +
//	public void buyCoffee(Cafe cf) {
//		this.money -= cf.orderPrice;
//	}

}
