package p06_23;

public class PersonCoffeShopTest {

	public static void main(String[] args) {
		Person kim = new Person("�达", 10000);
		Person lee = new Person("�̾�", 20000);
		Person you = new Person("����", 1000000);
		Person park = new Person("�ھ�", 30000);

		Cafe star = new Cafe("���ٹ�");
		Cafe bean = new Cafe("��ٹ�");
		Cafe bbaek = new Cafe("���ٹ�");

		// �达
		kim.buyDrink(star);
		star.setOrder("�Ƹ޸�ī��", 4000);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		// �� void Ÿ���̸� �� ��~~~ String Ÿ���̾�� ��
		// �� �׷��� taketrans �� �� �� �ؿ� ���� �װŴ�?
		System.out.println(star.moneyInfo());
		System.out.println(kim.moneyInfo());
		System.out.println();

		// �̾�
		lee.buyDrink(bean);
		bean.setOrder("ī���", 4500);
//		bean.setDrinkMenu("��");
//		bean.makeMoney(4500);
		System.out.println(lee.showInfo());
		System.out.println(bean.showInfo());
		System.out.println(bean.moneyInfo());
		System.out.println(lee.moneyInfo());
		System.out.println();

		// ����
		you.buyDrink(bbaek);
		bbaek.setOrder("�ݵ���", 3000);
//		bbaek.setDrinkMenu("�ݵ���");
//		bbaek.makeMoney(3000);
		System.out.println(you.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		System.out.println(you.moneyInfo());
		System.out.println();

		// �ھ�
		park.buyDrink(bbaek);
		bbaek.setOrder("�ƹٶ�", 4000);
//		bbaek.setDrinkMenu("�ƹٶ�");
//		bbaek.makeMoney(4000);
		System.out.println(park.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		System.out.println(park.moneyInfo());
		System.out.println();
		
		// �达2
		kim.buyDrink(star);
		star.setOrder("����Ĩ ����Ǫġ��", 6000);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		System.out.println(star.moneyInfo());
		System.out.println(kim.moneyInfo());
		System.out.println();

		
		// ���� �� ��ġ��,,, �� ���� �ʰ� ���Ǵµ��� 
	}

}
