package p07.p07_04.customer2;

import p07.p07_04.customer.Customer; // 다른 패키지니까,, import해야 Customer class 상속 가넝한

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP"; // 얘는 상위 클래스에서 private 변수이므로 오류 발생
								// so protected로 바꿨음~~~
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	//재정의 고고,,  와우!! 
	@Override 	//Annotation 주석.. 없어도 되지만 있는 게 훨 좋음^^
				// 나 이거 상속 받은 거 재정의한거니까,, 컴파일러 니 알아서 실행해ㅏㄹ,,, -_-^
				// 개발자가 논리적인 실수 내지 않게끔 컴파일러가 빨간줄 그어서,, 막아줌 ㅎ 댕큐
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // default 타입이니까,, 못 쓰넴 -> protected로 바꾸면 됨
		return price - (int) (price * saleRatio);
	}
	
} //class


//이렇게 하면 ,,, 중복이 넘 많아~~ 상속을 쓰자~~~
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;
//	// ㄴ 기존 Customer class랑 겹치는 멤변
//	// ㄱ VIP 클래스에서만 필요한 멤변
//	private int agentID;
//	double saleRatio;
//
//	public VIPCustomer() {
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//	}
//
//	// 메서드
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int) (price * saleRatio); // 할인율 적용한 가격
//	}
//
//	public int getAgentID() {
//		return agentID;
//	}
//
//	public String showCustomerInfo() {
//		return customerName + "님의 등급은 " + customerGrade + "이며, "
//				+ "보너스 포인트는 " + bonusPoint + "입니다.";
//	}
