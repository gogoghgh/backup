package p06.p06_14;

public class OrderTest {

	public static void main(String[] args) {
		Order o1 = new Order();

		o1.setOrderNum("201803120001"); // long���� �ߴµ� ������,, �� ��~~ �׷��� String���� �ٲ�
		o1.setMemberID("abc123");
		o1.setOrderDate("2018�� 3�� 12��");
		o1.setMemberName("ȫ���");
		o1.setProductID("PD0345-12");
		o1.setAddress("����� �������� ���ǵ��� 20����");

		System.out.println("�ֹ���ȣ: " + o1.getOrderNum());
		System.out.println("�ֹ��� ���̵�: " + o1.getMemberID());
		System.out.println("�ֹ� ��¥: " + o1.getOrderDate());
		System.out.println("�ֹ��� �̸�: " + o1.getMemberName());
		System.out.println("�ֹ� ��ǰ ��ȣ: " + o1.getProductID());
		System.out.println("��� �ּ�: " + o1.getAddress());

	}

}
