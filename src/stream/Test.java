package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Arrays.stream(arr).forEach(n -> System.out.println("arr: " + n));
		// forEach()는 최종 연산자,,

		System.out.println("---------reduce()---------"); 
//		Arrays.stream(arr).reduce(0, (a, b) -> a + b); 이렇게만 적으면,, 못 보니까
		int reduceUse = Arrays.stream(arr).reduce(0, (a, b) -> a + b); // 변수에 집어넣어서~~ 리턴타입은 int죵
		System.out.println("reduceUse: " + reduceUse);
		int reduceUse2 = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
		System.out.println("reduceUse2: " + reduceUse2);

		System.out.println("---------filter()---------"); 
		ArrayList<String> sList = new ArrayList<>();
		sList.add("hi");
		sList.add("hello");
		sList.add("안녕하세용");
		sList.add("안녕");
		sList.add("반갑습니다");
		sList.add("오랜만이여요");

		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println("s.length() >= 5 :  " + s));
		sList.stream().filter(s -> s.length() <= 5).forEach(s -> System.out.println("s.length() <= 5 :  " + s));

		System.out.println("---------map()---------"); 
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("홍길동", 1));
		customerList.add(new Customer("김길동", 2));
		customerList.add(new Customer("고길동", 3));

		customerList.stream().map(c -> c.getName()).forEach(c -> System.out.println("getName: " + c));
	}

}

class Customer {
	String name;
	int id;

	public Customer(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
