package p06_23;

public class PersonCoffeShopTest {

	public static void main(String[] args) {
		Person kim = new Person("±è¾¾", 10000);
		Person lee = new Person("ÀÌ¾¾", 20000);
		Person you = new Person("À¯¾¾", 99999990);
		
		CoffeeShop star = new CoffeeShop("º°´Ù¹æ");
		CoffeeShop bean = new CoffeeShop("Äá´Ù¹æ");
		CoffeeShop bbaek = new CoffeeShop("»ª´Ù¹æ");

		//±è¾¾
		kim.goCoffeeShop(star);
		star.setDrink("¾Æ¸Þ¸®Ä«³ë");
		star.setMenu(4000);
		System.out.println(kim.showInfo() + " / " + star.showInfo());
		//					¤¤ void Å¸ÀÔÀÌ¸é ¾È µÊ~~~ String Å¸ÀÔÀÌ¾î¾ß ÇÔ
		//						¿¨ ±×·¯¸é taketrans ÇÒ ¶§ ¸Ç ¹Ø¿¡ Á¤º¸ ±×°Å´Â?
		System.out.println(star.moneyInfo());
		System.out.println();
		
		//ÀÌ¾¾
		lee.goCoffeeShop(bean);
		bean.setDrink("¶ó¶¼");
		bean.setMenu(4500);
		System.out.println(lee.showInfo() + " / " + bean.showInfo());
		System.out.println(bean.moneyInfo());
		System.out.println();
		
		//À¯¾¾
		you.goCoffeeShop(bbaek);
		bbaek.setDrink("ÄÝµåºê·ç");
		bbaek.setMenu(3000);
		System.out.println(you.showInfo() + " / " + bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());

	}

}
