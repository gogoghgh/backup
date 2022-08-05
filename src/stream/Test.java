package stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Arrays.stream(arr).forEach(n -> System.out.println("arr: " + n));
		// forEach()�� ���� ������,,

		System.out.println("---------reduce()---------"); 
//		Arrays.stream(arr).reduce(0, (a, b) -> a + b); �̷��Ը� ������,, �� ���ϱ�
		int reduceUse = Arrays.stream(arr).reduce(0, (a, b) -> a + b); // ������ ����־~~ ����Ÿ���� int��
		System.out.println("reduceUse: " + reduceUse);
		int reduceUse2 = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
		System.out.println("reduceUse2: " + reduceUse2);

		System.out.println("---------filter()---------"); 
		ArrayList<String> sList = new ArrayList<>();
		sList.add("hi");
		sList.add("hello");
		sList.add("�ȳ��ϼ���");
		sList.add("�ȳ�");
		sList.add("�ݰ����ϴ�");
		sList.add("�������̿���");

		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println("s.length() >= 5 :  " + s));
		sList.stream().filter(s -> s.length() <= 5).forEach(s -> System.out.println("s.length() <= 5 :  " + s));

		System.out.println("---------map()---------"); 
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("ȫ�浿", 1));
		customerList.add(new Customer("��浿", 2));
		customerList.add(new Customer("��浿", 3));

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
