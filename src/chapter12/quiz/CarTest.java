package chapter12.quiz;

import java.util.HashMap;

//import p06.p06_23.CarFactory;

class CarFactory{
	HashMap<String, Car> map = new HashMap<>(); //name을 key값으로!! 아하~
	
	private CarFactory() {}
	
	static CarFactory getInstance() {
		return new CarFactory();
	}
	
//	Car createCar(String name){
//		return new Car(name);
//	}  땡~~~
	
//	Car createCar(String name) {   // 연수 차 들어왔다
//		map.put(name, new Car()); // key값은 중복 허용 X니까~~ 연수 차 또 들어와도? 안 생김.. 
//		System.out.println(map.size());
//		return map.get(name); // 연수에 해당하는 주소값(only 1)만 리턴됨!!
//	}
	
	Car createCar(String name) {
		if(!map.containsKey(name))
			map.put(name, new Car(name));
		
		return map.get(name);
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();  //객체 생성 없이 쓰네? 아~ 싱글톤~~
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println("sonata1 주소값: " + sonata1);
		System.out.println("sonata2 주소값: " + sonata2);
		System.out.println(sonata1 == sonata2);  // true
		//hashmap 생성 전에는 주소값 주소값끼리 비교하니까,, false 뜸 new Car != new Car
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);  // true
		
		System.out.println(sonata1 == avante1);  // false
		
	}

}
