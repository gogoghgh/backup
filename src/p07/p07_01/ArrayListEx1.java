package p07.p07_01;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList <Integer> numbers = new ArrayList<>();
		System.out.println(numbers);
		
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		numbers.add(104);
		
		System.out.println(numbers.size());
		System.out.println(numbers.toString());
		
		numbers.remove(2);
		System.out.println(numbers.toString());
		for(int numbersData : numbers)	System.out.println(numbersData);
		
		numbers.isEmpty();
		
		if(numbers.contains(104)) {
			System.out.println("104 있다 ~");
		} else System.out.println("104 없다 ");
		
		System.out.println(numbers.get(3));
		
	}//main

}
