package p06_23;

public class PersonCoffeShopTest {

	public static void main(String[] args) {
		Person kim = new Person("�达");
		Person lee = new Person("�̾�");

		//�达
		CoffeeShop star = new CoffeeShop("���ٹ�");
		kim.goCoffeeShop(star);
		star.setDrink("�Ƹ޸�ī��");
		star.setMenu(4000);
		System.out.println(kim.showInfo() + " / " + star.showInfo());
		//					�� void Ÿ���̸� �� ��~~~ String Ÿ���̾�� ��
		//						�� �׷��� taketrans �� �� �� �ؿ� ���� �װŴ�?
		System.out.println(star.moneyInfo());
		System.out.println();
		//�̾�
		CoffeeShop bean = new CoffeeShop("��ٹ�");
		lee.goCoffeeShop(bean);
		bean.setDrink("��");
		bean.setMenu(4500);
		System.out.println(lee.showInfo() + " / " + bean.showInfo());
		System.out.println(bean.moneyInfo());

	}

}
