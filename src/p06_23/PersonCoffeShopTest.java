package p06_23;

public class PersonCoffeShopTest {

	public static void main(String[] args) {
		Person kim = new Person("�达", 10000);
		Person lee = new Person("�̾�", 20000);
		Person you = new Person("����", 99999990);
		
		CoffeeShop star = new CoffeeShop("���ٹ�");
		CoffeeShop bean = new CoffeeShop("��ٹ�");
		CoffeeShop bbaek = new CoffeeShop("���ٹ�");

		//�达
		kim.goCoffeeShop(star);
		star.setDrink("�Ƹ޸�ī��");
		star.setMenu(4000);
		System.out.println(kim.showInfo() + " / " + star.showInfo());
		//					�� void Ÿ���̸� �� ��~~~ String Ÿ���̾�� ��
		//						�� �׷��� taketrans �� �� �� �ؿ� ���� �װŴ�?
		System.out.println(star.moneyInfo());
		System.out.println();
		
		//�̾�
		lee.goCoffeeShop(bean);
		bean.setDrink("��");
		bean.setMenu(4500);
		System.out.println(lee.showInfo() + " / " + bean.showInfo());
		System.out.println(bean.moneyInfo());
		System.out.println();
		
		//����
		you.goCoffeeShop(bbaek);
		bbaek.setDrink("�ݵ���");
		bbaek.setMenu(3000);
		System.out.println(you.showInfo() + " / " + bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());

	}

}
