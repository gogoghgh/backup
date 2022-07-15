package p07.p07_04.customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(); // -> Customer 생성자 (상위) 출력
		VIPCustomer c2 = new VIPCustomer(); // 상속 O -> Customer 생성자 (상위) + VIPCustomer 생성자 (자식) 
		VIPCustomer1 c3 = new VIPCustomer1(); //상속 X
		
		c1.customerName="kim";  //silver횐님
		c1.customerGrade="실버벨,, 실버벨,~~";
		c1.customerID = 1004;
		c1.bonusPoint=10; //10점 있어염
		System.out.println(c1.calcPrice(1000)); 
			//1000원 주고 빵 샀다 -> 보너스 포인트 1%니까 +10
		System.out.println(c1.showCustomerInfo());
		System.out.println();
		
		c3.customerName="lee";  //vip횐님
		c3.bonusPoint=10; //10점 있어염
		System.out.println(c3.calcPrice(1000)); 
			//할인 받아서 900원 주고 빵 샀다 -> 보너스 포인트 5%니까 +50
		System.out.println(c3.showCustomerInfo());
		System.out.println();
		
		c2.customerName="park";  //vip횐님
		c2.bonusPoint=10; //10점 있어염
		System.out.println(c2.calcPrice(1000)); 
			//할인 받아서 900원 주고 빵 샀다 -> 보너스 포인트 5%니까 +50
			// 900원이어야 하는데,,, 메서드는 우리가 안 바꿔서 그대로 ㅠ 억울해~~~ 
			// 오버라이딩 =재정의해서 해결 완
		System.out.println(c2.showCustomerInfo());
		System.out.println();
		
		System.out.println("----- toString 재정의----");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); //엇 얘는 왜?! 왜냐면,, 상속 X 
		
	}

}
