package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
	private String name;
	private int price;

	// 생성자
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

		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));

		// 스트림 생성하고 출력하기
		int sum = 0;
//		sum = bookList.stream().mapToInt((b)->{return b.getPrice();}).sum();
		sum = bookList.stream().mapToInt(b->b.getPrice()).sum();
						// 가격 뽑아낼 거니까,,  mapToInt
		
		bookList.stream().filter(b->b.getPrice()>=20000)
		.sorted((b1, b2) -> b1.getName().compareTo(b2.getName()))
		.forEach(b-> System.out.println(b.getName()));
		// Comparator 433, 436 참고
		

		// 하던 대로,,
		// 모든 책 가격의 합
		int sum2 = 0;
		for (Book b : bookList)
			sum2 += b.getPrice();
		System.out.println("합계: " + sum2);

		// 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력
		ArrayList<String> resultList = new ArrayList<>();
		for (Book b : bookList) {
			if (b.getPrice() >= 20000) {
				resultList.add(b.getName());
			}
		}// for
		
		Collections.sort(resultList);
		System.out.println("20,000 이상인 책: " + resultList);	
		
	}// main

}
