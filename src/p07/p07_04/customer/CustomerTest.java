package p07.p07_04.customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(); // -> Customer ������ (����) ���
		VIPCustomer c2 = new VIPCustomer(); // ��� O -> Customer ������ (����) + VIPCustomer ������ (�ڽ�) 
		VIPCustomer1 c3 = new VIPCustomer1(); //��� X
		
		c1.customerName="kim";  //silverȺ��
		c1.customerGrade="�ǹ���,, �ǹ���,~~";
		c1.customerID = 1004;
		c1.bonusPoint=10; //10�� �־
		System.out.println(c1.calcPrice(1000)); 
			//1000�� �ְ� �� ��� -> ���ʽ� ����Ʈ 1%�ϱ� +10
		System.out.println(c1.showCustomerInfo());
		System.out.println();
		
		c3.customerName="lee";  //vipȺ��
		c3.bonusPoint=10; //10�� �־
		System.out.println(c3.calcPrice(1000)); 
			//���� �޾Ƽ� 900�� �ְ� �� ��� -> ���ʽ� ����Ʈ 5%�ϱ� +50
		System.out.println(c3.showCustomerInfo());
		System.out.println();
		
		c2.customerName="park";  //vipȺ��
		c2.bonusPoint=10; //10�� �־
		System.out.println(c2.calcPrice(1000)); 
			//���� �޾Ƽ� 900�� �ְ� �� ��� -> ���ʽ� ����Ʈ 5%�ϱ� +50
			// 900���̾�� �ϴµ�,,, �޼���� �츮�� �� �ٲ㼭 �״�� �� �����~~~ 
			// �������̵� =�������ؼ� �ذ� ��
		System.out.println(c2.showCustomerInfo());
		System.out.println();
		
		System.out.println("----- toString ������----");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); //�� ��� ��?! �ֳĸ�,, ��� X 
		
	}

}
