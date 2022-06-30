package p06.p06_23.p197_Q5_cafe;

public class PersonCafeTest {

	public static void main(String[] args) {
		Person kim = new Person("김씨", 10000);
		Person lee = new Person("이씨", 20000);
		Person you = new Person("유씨", 1000000);
		Person park = new Person("박씨", 30000);

		Cafe star = new Cafe("별다방");
		Cafe bean = new Cafe("콩다방");
		Cafe bbaek = new Cafe("빽다방");

		// 김씨
		star.setOrder("아메리카노", 4000);
		kim.buyDrink(star);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		// ㄴ sysout 안에 넣을거면!! void 타입이면 안 됨~~~ String 타입이어야 함
		// 엥 그러면 TakeTrans(06_20) 할 때 맨 밑에 정보 그거는? 
		// -> void여서 sysout 없이 걍 바로 메서드 호출
		System.out.println(star.moneyInfo());
		kim.moneyInfo();
		System.out.println();

		// 이씨
		bean.setOrder("카페라떼", 4500);
		lee.buyDrink(bean);
//		bean.setDrinkMenu("라떼");
//		bean.makeMoney(4500);
		System.out.println(lee.showInfo());
		System.out.println(bean.showInfo());
		System.out.println(bean.moneyInfo());
		lee.moneyInfo();
		System.out.println();

		// 유씨
		bbaek.setOrder("콜드브루", 3000);
		you.buyDrink(bbaek);
//		bbaek.setDrinkMenu("콜드브루");
//		bbaek.makeMoney(3000);
		System.out.println(you.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		you.moneyInfo();
		System.out.println();

		// 박씨
		bbaek.setOrder("아바라", 4000);
		park.buyDrink(bbaek);
//		bbaek.setDrinkMenu("아바라");
//		bbaek.makeMoney(4000);
		System.out.println(park.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		park.moneyInfo();
		System.out.println();
		
		// 김씨2
		star.setOrder("초코칩 프라푸치노", 6000);
		kim.buyDrink(star);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		System.out.println(star.moneyInfo());
		kim.moneyInfo();
		System.out.println();

		
		// 남은 돈 고치기,,, 한 박자 늦게 계산되는데ㅠ 
	}

}
