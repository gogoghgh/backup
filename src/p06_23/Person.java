package p06_23;

public class Person {
	//��� ����
	String name;
	String goCS;
	//CoffeeShop cs;
	int money; 

	
	//������
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	
	//�޼��� --- Ŀ�Ǽ� Ŭ����->Ŀ�Ǽ� �̸��� �Ű�������
	public String goCoffeeShop(CoffeeShop cs) {
		return goCS = cs.csName;
	}
	
//	�ܴ� ��
//	public void goCoffeeShop(CoffeeShop cs) {
//		CoffeeShop = cs;
//	}
	
	
	// Ŀ�� ��� �޼���,,,,,,,,, 
	// �� ���� - / ī�� ������ +
	public int buyCoffee(CoffeeShop cs) {
		return this.money -= cs.orderPrice;
	}

//	public void take(int money) {

	public String showInfo() {
		return name + "�� " + goCS + "�� ����.. ���� ���� " + money ;
	}

}
