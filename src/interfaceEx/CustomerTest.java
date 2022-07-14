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
			   // seller를 하위 클래스형인 Customer로 다시 형변환.. 다운캐스팅
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}

}
