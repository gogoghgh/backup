package p06_23.p197_Q5_T_answer;

public class TestQ5 {

	public static void main(String[] args) {
		Person kim = new Person("kim");
		Person lee = new Person("lee");
		
		kim.setMenu("�Ƹ޸�ī��");
		kim.setMoney(4000);
		kim.goCoffeeshop(new Coffeeshop("���ٹ�"));
		
		lee.setMenu("��");
		lee.setMoney(4500);
		lee.goCoffeeshop(new Coffeeshop("��ٹ�"));
		
		System.out.println(kim.showInfo());
		System.out.println(kim.showInfo2());
		System.out.println();
		
		System.out.println(lee.showInfo());
		System.out.println(lee.showInfo2());
		
	}

}
