package p06_23;

public class Person {
	//��� ����
	String name;
	String goCS;
	//CoffeeShop cs;
	int money; 

	
	//������
	Person(String name) {
		this.name = name;
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
//	public void buyCoffee(CoffeeShop cs) {
//		cs.takeMoney(cs.orderPrice); 
//		this.money -= cs.orderPrice;
//	}

//	public void take(int money) {

	public String showInfo() {
		return name + "�� " + goCS + "�� ����.. ���� ���� " + money ;
	}

}
