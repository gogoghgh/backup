package p06.p06_23;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		// getInstance��� �޼��� �̸��� ���� �̱����̱�~ ,,�ؾ� �� �̸��� ����!!
		// factory = car factory ������ instance/...
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
