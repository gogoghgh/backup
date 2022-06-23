package p06_23;

public class Person {
	// 멤버 변수
	String name;
	String cafeName; // 카페 클래스 타입의 cafe 멤버 변수..
	int money;

	// 생성자
	Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 메서드 --- 커피숍 클래스->커피숍 이름을 매개변수로
//	public String goCoffeeShop(Cafe cs) {
//		return goCafe = cs.cafeName;
//	}

//	쌤님 답
//	public void goCoffeeShop(CoffeeShop cs) {
//		CoffeeShop = cs;
//	}

	// 메서드 --- 어디 카페 가서 && 얼마 썼나?
	public void buyDrink(Cafe cf) {
//		cf.setOrder(sc.next(), money);
		this.cafeName = cf.cafeName;
		this.money -= cf.orderPrice;
	}
	// cannot convert from String to Cafe

	// 커피 사는 메서드,,,,,,,,,
	// 내 돈은 - / 카페 수입은 +
//	public void buyCoffee(Cafe cf) {
//		this.money -= cf.orderPrice;
//	}

//	public void take(int money) {

	public String showInfo() {
		return name + "는 " + cafeName + "에 갔다.." ;				
	}
	
	public String moneyInfo() {
		return "( "+ name +"의 남은 돈은 " + money + "원 )";
	}

	
}
