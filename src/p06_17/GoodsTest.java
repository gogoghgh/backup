package p06_17;

public class GoodsTest {

	public static void main(String[] args) {
		Goods g1 = new Goods("�Ｚī�޶�", "123", 10, 3);
		Goods g2 = new Goods("�����е�", "124", 5, 2); 
		Goods g3 = new Goods();
		//�����ڰ� ���� ���� �� �� �ƴѰ���???
		//�����ڴ� �ʱⰪ�� �������ִϱ�,, ��� �ٲ�ų� �� ������ ���� ���Ͱ� �ʿ�!!!
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1.setSoldNum(11);
		g2.setSoldNum(8);
		System.out.println(g1.getName() + "(�ڵ��ȣ: " + g1.getCode() + "),  �ȸ� ����: " + g1.getSoldNum() + ",  ��� ����: " + g1.getStockNum());
		System.out.println(g2.getName() + "(�ڵ��ȣ: " + g2.getCode() + "),  �ȸ� ����: " + g2.getSoldNum() + ",  ��� ����: " + g2.getStockNum());
		
	}

}
