package p06_23.p197_Q5_T_answer;

public class TestQ5 {

	public static void main(String[] args) {
		Person kim = new Person("kim");
		Person lee = new Person("lee");
		
		kim.setMenu("아메리카노");
		kim.setMoney(4000);
		kim.goCoffeeshop(new Coffeeshop("별다방"));
		
		lee.setMenu("라떼");
		lee.setMoney(4500);
		lee.goCoffeeshop(new Coffeeshop("콩다방"));
		
		System.out.println(kim.showInfo());
		System.out.println(kim.showInfo2());
		System.out.println();
		
		System.out.println(lee.showInfo());
		System.out.println(lee.showInfo2());
		
	}

}
