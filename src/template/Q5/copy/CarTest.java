package template.Q5.copy;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
//		carList.add(new Sonata());
//		carList.add(new Grandeur());
//		carList.add(new Avante());
//		carList.add(new Genesis());
		carList.add(new Car("�ҳ�Ÿ"));
		carList.add(new Car("�׷���"));
		carList.add(new Car("�ƹݶ�"));
		carList.add(new Car("���׽ý�"));
		
		
		
		for (Car car : carList) {
			car.run();
			System.out.println("=====================");
		}
	}// main
}
