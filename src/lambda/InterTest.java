package lambda;

class InterClass implements Inter {
	@Override
	public void methodI() {
		System.out.println("Interface 추상메서드 구현 완");
	}
}// InterClass class


public class InterTest {
	public static void main(String[] args) {
		// 인터페이스 구현 방법 3가지
		// 1. 우리가 이 때까지 해왔던 방식~~
		InterClass ic = new InterClass();
		ic.methodI();

		
		// 2. 익명 클래스로 만들어보기
		Inter i1 = new Inter() {
			@Override
			public void methodI() {
				System.out.println("익명 클래스로 추상메서드 구현 완");
			}
		};
		i1.methodI();

		
		// 3. 람다 표현식으로 바꿔보기
		   Inter i2 = () -> {	System.out.println("람다식으로 추상메서드 구현 완");	};
		// Inter i2 = () -> System.out.println("람다식으로 추상메서드 구현 완");  한 줄 짜리는 중괄호도 없앨 수 있음
		i2.methodI();
			// 람다가 젤 간단하죠?^^ 
			// 그러나,, 익명 클래스는 아무 인터페이스나 다 되지만,
		 	// 람다는 오직 functional interface밖에 구현 못 함~~
	
	}// main

}// InterTest class