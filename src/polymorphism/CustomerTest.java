package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;

		System.out.println(customerLee.showCustomerInfo());

		Customer vipCustomerKim = new VIPCustomer(10020, "������", 12345);
		vipCustomerKim.bonusPoint = 1000;

		System.out.println(vipCustomerKim.showCustomerInfo());
		System.out.println();
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");

		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = vipCustomerKim.calcPrice(price); // override�� �޼��� ȣ��

		System.out.println(customerLee.getCustomerName() + " ���� " + leePrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(vipCustomerKim.getCustomerName() + " ���� " + kimPrice + "�� �����ϼ̽��ϴ�.");
		System.out.println(vipCustomerKim.showCustomerInfo());

	}// main

}
