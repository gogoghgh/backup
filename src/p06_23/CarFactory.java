package p06_23;

public class CarFactory {
	// step 2
	private static CarFactory instance = new CarFactory();

	// step 1
	private CarFactory() {
	}

	// step 3
	// 리턴타입= CarFactory
	public static CarFactory getInstance() {
		return instance;
		// CarFactory의 값은? new CarFactory();
	}
	// 싱글톤? 하면 이 단계 쭈루룩 나오게,,,^^
	// static 메서드 -> static 멤버 변수만 쓸 수 있음

	// 리턴타입이 Car인 메서드
	Car createCar() {
		return new Car();
	}

//	int createCar() {
//		static int serialNum=10000;
//		return serialNum++;
//	}

}
