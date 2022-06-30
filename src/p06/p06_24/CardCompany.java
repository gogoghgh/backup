package p06.p06_24;

public class CardCompany {
	// step 2. static으로 유일한 인스턴스 하나 생성
	private static CardCompany cardCompany = new CardCompany();

	
	// step 1. private하게 생성자 만들기
	private CardCompany() {	}

	
	// step 3. 메서드 만듦,, 
	// 			외부에서 참조할 수 있는 public 메서드
	// 			리턴타입이 CardCompany class인... 
	//			메서드 이름은 꼭 getInstance로!!!
	// 			static 꼭!! 왜냐면 객체 생성 없이 쓸 거니까,,,,,
	public static CardCompany getInstance() {
		return cardCompany; // cardCompany = new CardCompny를 값으로 갖는,, 참조변수
	}
	
	
	// step 4. 실제로 사용하는 코드 만들기
	// 			리턴타입이 Card class!!!!!인 메서드
	Card createCard() {
		return new Card(); //Card class 타입의 값은? new Card() 니까..
	}
}
