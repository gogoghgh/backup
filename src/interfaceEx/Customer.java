package interfaceEx;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("사기");
	}
	
	@Override
	public void sell() {
		System.out.println("팔기");
	}
	
	// Buy, Sell 인터페이스에 order라는 디폴트 메서드가 중복돼서 못 쓴다,,
	// 긍까 구현하는 니가(Customer class) 재정의해라! 그걸 쓸테니까
	@Override
	public void order() {
		System.out.println("재정의: 고객 판매 주문..");
	}
	
}
