package witharraylist;

import java.util.ArrayList;
import polymorphism.Customer; // �ٸ� ��Ű���ϱ� import
import polymorphism.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerYoul = new GoldCustomer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "������", 12345);

		// ArrayList�� add�Ӽ��� ����� ��ü �迭�� �� �߰�
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);

		System.out.println("===== �� ���� ��� ======");
		for (Customer customerData : customerList) {
			System.out.println(customerData.showCustomerInfo());
		} // customerData�� new �ؼ� ������ �� �ƴ϶�,, �� Customer type�� �ּҰ� ����ִ� ����������,,
			// �ű⿡ CustomerList �迭 ���鼭 �̾ƿ� ���� -> customerData�� ä��� ��!!
			// ��Ȯ�� �����ڸ�, customerData���� �� �̾ƿ� ���� ����Ű�� �ּҰ��� ��

		System.out.println("======������ & ���ʽ� ����Ʈ ���======");
		int price = 10000;
		for (Customer customerData : customerList) {
			int cost = customerData.calcPrice(price);
			// Customer, GoldCustomer, VIPCustomer �� calcPrice ����, �������� �޼��� ���� ����.
			// ���� ��� Ÿ�Կ� �´� �޼��� �ҷ����� ��~~ => �������̵��� �޼���.. �ҷ���
			System.out.println(customerData.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ� ��");
			System.out.println(
					customerData.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customerData.getBonusPoint() + "���Դϴ�");
		} // for

	}// main

}
