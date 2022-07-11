package abstractEx.selfCoding;

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();

		// Car class -> 각자 오버라이딩
		bus.run();
		autoCar.run();

		bus.refuel();
		autoCar.refuel();

		// 각자 즈그꺼
		bus.takePassenger();
		autoCar.load();

		// Car class에서 다 만든 메서드
		bus.stop();
		autoCar.stop();

	}

}
