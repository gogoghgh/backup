package p07.p07_01.dog;

import java.util.ArrayList;

public class DogTestArrayList {
	static ArrayList <Dog> dogs = new ArrayList<Dog>(); 

	public static void main(String[] args) {
		// dogs는 dog들이 들어간 주머니!! 일 뿐!!!
		String[] dogNames = {"멍1", "멍2", "멍3", "멍4", "멍5"};
		String[] dogTypes = {"진돗개", "말티즈", "시베리안", "스피치", "푸들"};
		
		for(int i=0; i< dogNames.length ; i++) { //ArrayList에서는 length가 아니라 size!!!
		dogs.add(new Dog(dogNames[i], dogTypes[i]));
		} //ArrayList가 아직 안 만들어져 있으니까,, 우리가 만드는 중이니까~
		// dogs.size()가 아니라 >> dogNames.length라고 해야 함
		
//		dogs.add(new Dog("멍1", "진돗개"));
//		dogs.add(new Dog("멍2", "말티즈"));
//		dogs.add(new Dog("멍3", "시베리안"));
//		dogs.add(new Dog("멍4", "스피치"));
//		dogs.add(new Dog("멍5", "푸들"));
		
		
		//출력 고고
		for(Dog dogsData: dogs) { 
			System.out.println(dogsData.showDogInfo());
		}
		
	}//main

}
