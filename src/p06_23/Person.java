package p06_23;

public class Person {
	//멤버 변수
	String name;
	String goCS;
	//CoffeeShop cs;
	int money; 

	
	//생성자
	Person(String name) {
		this.name = name;
	}

	
	//메서드 --- 커피숍 클래스->커피숍 이름을 매개변수로
	public String goCoffeeShop(CoffeeShop cs) {
		return goCS = cs.csName;
	}
	
//	쌤님 답
//	public void goCoffeeShop(CoffeeShop cs) {
//		CoffeeShop = cs;
//	}
	
	
	// 커피 사는 메서드,,,,,,,,, 
	// 내 돈은 - / 카페 수입은 +
//	public void buyCoffee(CoffeeShop cs) {
//		cs.takeMoney(cs.orderPrice); 
//		this.money -= cs.orderPrice;
//	}

//	public void take(int money) {

	public String showInfo() {
		return name + "는 " + goCS + "에 갔다.. 남은 돈은 " + money ;
	}

}
