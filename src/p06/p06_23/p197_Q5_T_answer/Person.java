package p06.p06_23.p197_Q5_T_answer;

public class Person {
	String name;
	int money;
	String menu;
	Coffeeshop coffeeshop;

	// 생성자
	public Person(String name) {
		super();
		this.name = name;
	}
	
	
	// 세터 게터 메서드
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
	
	// 정보 출력 메서드
	public String showInfo() {
		return name + "은 / " + coffeeshop +"에 가서 / " + money + "원짜리 / "+ menu +"를 시켰다";
	} // coffeeshop 은 참조변수니까 주소값을 가지고 있음!! 그래서 주소값 출력됨;;

	public String showInfo2() {
		return name + "은 / " + coffeeshop.name +"에 가서 / " + money + "원짜리 / "+ menu +"를 시켰다";
	}
}
