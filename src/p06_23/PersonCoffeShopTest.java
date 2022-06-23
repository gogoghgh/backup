package p06_23;

public class PersonCoffeShopTest {

	public static void main(String[] args) {
		Person kim = new Person("±è¾¾");
		Person lee = new Person("ÀÌ¾¾");

		//±è¾¾
		CoffeeShop star = new CoffeeShop("º°´Ù¹æ");
		kim.goCoffeeShop(star);
		star.setDrink("¾Æ¸Þ¸®Ä«³ë");
		star.setMenu(4000);
		System.out.println(kim.showInfo() + " / " + star.showInfo());
		//					¤¤ void Å¸ÀÔÀÌ¸é ¾È µÊ~~~ String Å¸ÀÔÀÌ¾î¾ß ÇÔ
		//						¿¨ ±×·¯¸é taketrans ÇÒ ¶§ ¸Ç ¹Ø¿¡ Á¤º¸ ±×°Å´Â?
		System.out.println(star.moneyInfo());
		System.out.println();
		//ÀÌ¾¾
		CoffeeShop bean = new CoffeeShop("Äá´Ù¹æ");
		lee.goCoffeeShop(bean);
		bean.setDrink("¶ó¶¼");
		bean.setMenu(4500);
		System.out.println(lee.showInfo() + " / " + bean.showInfo());
		System.out.println(bean.moneyInfo());

	}

}
