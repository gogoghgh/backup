package p06.p06_23;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		// getInstance라는 메서드 이름만 봐도 싱글톤이군~ ,,해야 함 이름은 고정!!
		// factory = car factory 유일한 instance/...
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
