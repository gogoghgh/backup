package abstractEx.selfCoding;

public class CarTest {

	public static void main(String[] args) {
		Bus bus = new Bus();
		AutoCar autoCar = new AutoCar();

		// Car class -> ���� �������̵�
		bus.run();
		autoCar.run();

		bus.refuel();
		autoCar.refuel();

		// ���� ��ײ�
		bus.takePassenger();
		autoCar.load();

		// Car class���� �� ���� �޼���
		bus.stop();
		autoCar.stop();

	}

}
