package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
	private String name;
	private int price;

	// ������
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// get() set()
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));

		// ��Ʈ�� �����ϰ� ����ϱ�
		int sum = 0;
//		sum = bookList.stream().mapToInt((b)->{return b.getPrice();}).sum();
		sum = bookList.stream().mapToInt(b->b.getPrice()).sum();
						// ���� �̾Ƴ� �Ŵϱ�,,  mapToInt
		
		bookList.stream().filter(b->b.getPrice()>=20000)
		.sorted((b1, b2) -> b1.getName().compareTo(b2.getName()))
		.forEach(b-> System.out.println(b.getName()));
		// Comparator 433, 436 ����
		

		// �ϴ� ���,,
		// ��� å ������ ��
		int sum2 = 0;
		for (Book b : bookList)
			sum2 += b.getPrice();
		System.out.println("�հ�: " + sum2);

		// å�� ������ 20,000�� �̻��� å�� �̸��� �����Ͽ� ���
		ArrayList<String> resultList = new ArrayList<>();
		for (Book b : bookList) {
			if (b.getPrice() >= 20000) {
				resultList.add(b.getName());
			}
		}// for
		
		Collections.sort(resultList);
		System.out.println("20,000 �̻��� å: " + resultList);	
		
	}// main

}
