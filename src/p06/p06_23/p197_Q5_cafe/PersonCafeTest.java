package p06.p06_23.p197_Q5_cafe;

public class PersonCafeTest {

	public static void main(String[] args) {
		Person kim = new Person("�达", 10000);
		Person lee = new Person("�̾�", 20000);
		Person you = new Person("����", 1000000);
		Person park = new Person("�ھ�", 30000);

		Cafe star = new Cafe("���ٹ�");
		Cafe bean = new Cafe("��ٹ�");
		Cafe bbaek = new Cafe("���ٹ�");

		// �达
		star.setOrder("�Ƹ޸�ī��", 4000);
		kim.buyDrink(star);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		// �� sysout �ȿ� �����Ÿ�!! void Ÿ���̸� �� ��~~~ String Ÿ���̾�� ��
		// �� �׷��� TakeTrans(06_20) �� �� �� �ؿ� ���� �װŴ�? 
		// -> void���� sysout ���� �� �ٷ� �޼��� ȣ��
		System.out.println(star.moneyInfo());
		kim.moneyInfo();
		System.out.println();

		// �̾�
		bean.setOrder("ī���", 4500);
		lee.buyDrink(bean);
//		bean.setDrinkMenu("��");
//		bean.makeMoney(4500);
		System.out.println(lee.showInfo());
		System.out.println(bean.showInfo());
		System.out.println(bean.moneyInfo());
		lee.moneyInfo();
		System.out.println();

		// ����
		bbaek.setOrder("�ݵ���", 3000);
		you.buyDrink(bbaek);
//		bbaek.setDrinkMenu("�ݵ���");
//		bbaek.makeMoney(3000);
		System.out.println(you.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		you.moneyInfo();
		System.out.println();

		// �ھ�
		bbaek.setOrder("�ƹٶ�", 4000);
		park.buyDrink(bbaek);
//		bbaek.setDrinkMenu("�ƹٶ�");
//		bbaek.makeMoney(4000);
		System.out.println(park.showInfo());
		System.out.println(bbaek.showInfo());
		System.out.println(bbaek.moneyInfo());
		park.moneyInfo();
		System.out.println();
		
		// �达2
		star.setOrder("����Ĩ ����Ǫġ��", 6000);
		kim.buyDrink(star);
		System.out.println(kim.showInfo());
		System.out.println(star.showInfo());
		System.out.println(star.moneyInfo());
		kim.moneyInfo();
		System.out.println();

		
		// ���� �� ��ġ��,,, �� ���� �ʰ� ���Ǵµ��� 
	}

}
