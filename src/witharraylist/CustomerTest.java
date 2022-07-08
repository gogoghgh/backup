package witharraylist;

import java.util.ArrayList;
import polymorphism.Customer; // 다른 패키지니까 import
import polymorphism.VIPCustomer;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

		// ArrayList의 add속성을 사용해 객체 배열에 고객 추가
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);

		System.out.println("===== 고객 정보 출력 ======");
		for (Customer customerData : customerList) {
			System.out.println(customerData.showCustomerInfo());
		} // customerData는 new 해서 생성할 게 아니라,, 걍 Customer type인 주소값 들어있는 참조변수임,,
			// 거기에 CustomerList 배열 돌면서 뽑아온 값을 -> customerData에 채우는 거!!
			// 정확히 말하자면, customerData에는 그 뽑아온 값을 가리키는 주소값이 들어감

		System.out.println("======할인율 & 보너스 포인트 계산======");
		int price = 10000;
		for (Customer customerData : customerList) {
			int cost = customerData.calcPrice(price);
			// Customer, GoldCustomer, VIPCustomer 다 calcPrice 원조, 재정의한 메서드 갖고 있음.
			// 각자 등급 타입에 맞는 메서드 불러오는 것~~ => 오버라이딩한 메서드.. 불러옴
			System.out.println(customerData.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다 ㄳ");
			System.out.println(
					customerData.getCustomerName() + " 님의 현재 보너스 포인트는 " + customerData.getBonusPoint() + "점입니다");
		} // for

	}// main

}
