package template.Q5.copy;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
//		carList.add(new Sonata());
//		carList.add(new Grandeur());
//		carList.add(new Avante());
//		carList.add(new Genesis());
		carList.add(new Car("소나타"));
		carList.add(new Car("그랜져"));
		carList.add(new Car("아반떼"));
		carList.add(new Car("제네시스"));
		
		
		
		for (Car car : carList) {
			car.run();
			System.out.println("=====================");
		}
	}// main
}
