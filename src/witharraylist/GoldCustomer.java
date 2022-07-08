package witharraylist;

import polymorphism.Customer; // �ٸ� ��Ű���ϱ� import ���ְ�~~

public class GoldCustomer extends Customer {
	double saleRatio;

	// ������
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02; // 2�� ����
		saleRatio = 0.1; // 10�� ���� �Ϳ�
	}

	// �޼��� �������̵�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
}