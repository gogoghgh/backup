package interfaceEx;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println();
		
		if(seller instanceof Customer) { //true
			Customer customer2 = (Customer)seller;
			   // seller�� ���� Ŭ�������� Customer�� �ٽ� ����ȯ.. �ٿ�ĳ����
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
