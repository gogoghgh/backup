package p06.p06_23.p197_Q5_T_answer;

public class Person {
	String name;
	int money;
	String menu;
	Coffeeshop coffeeshop;

	// ������
	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	// ���� ���� �޼���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public void goCoffeeshop(Coffeeshop coffeeshop) {
		this.coffeeshop = coffeeshop;
	}
	
	// ���� ��� �޼���
	public String showInfo() {
		return name + "�� / " + coffeeshop +"�� ���� / " + money + "��¥�� / "+ menu +"�� ���״�";
	} // coffeeshop �� ���������ϱ� �ּҰ��� ������ ����!! �׷��� �ּҰ� ��µ�;;

	public String showInfo2() {
		return name + "�� / " + coffeeshop.name +"�� ���� / " + money + "��¥�� / "+ menu +"�� ���״�";
	}
}
