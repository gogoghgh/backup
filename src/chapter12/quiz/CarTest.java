package chapter12.quiz;

import java.util.HashMap;

//import p06.p06_23.CarFactory;

class CarFactory{
	HashMap<String, Car> map = new HashMap<>(); //name�� key������!! ����~
	
	private CarFactory() {}
	
	static CarFactory getInstance() {
		return new CarFactory();
	}
	
//	Car createCar(String name){
//		return new Car(name);
//	}  ��~~~
	
//	Car createCar(String name) {   // ���� �� ���Դ�
//		map.put(name, new Car()); // key���� �ߺ� ��� X�ϱ�~~ ���� �� �� ���͵�? �� ����.. 
//		System.out.println(map.size());
//		return map.get(name); // ������ �ش��ϴ� �ּҰ�(only 1)�� ���ϵ�!!
//	}
	
	Car createCar(String name) {
		if(!map.containsKey(name))
			map.put(name, new Car(name));
		
		return map.get(name);
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();  //��ü ���� ���� ����? ��~ �̱���~~
		Car sonata1 = factory.createCar("���� ��");
		Car sonata2 = factory.createCar("���� ��");
		System.out.println("sonata1 �ּҰ�: " + sonata1);
		System.out.println("sonata2 �ּҰ�: " + sonata2);
		System.out.println(sonata1 == sonata2);  // true
		//hashmap ���� ������ �ּҰ� �ּҰ����� ���ϴϱ�,, false �� new Car != new Car
		
		Car avante1 = factory.createCar("�¿� ��");
		Car avante2 = factory.createCar("�¿� ��");
		System.out.println(avante1 == avante2);  // true
		
		System.out.println(sonata1 == avante1);  // false
		
	}

}
