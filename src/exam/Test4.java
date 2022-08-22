package exam;

import java.util.Scanner;

public class Test4 {

	static Book[] books = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int insertCnt = 0;

	public static void main(String[] args) {
		// 도서 정보를 입력하는 코드 일부분이다.
		System.out.println("------------- 입력 일부분 ---------------");
		System.out.print("도서명 입력 : ");
		String title = sc.nextLine();
		System.out.print("저자 입력 : ");
		String author = sc.nextLine();
		System.out.print("출판사 입력 : ");
		String publish = sc.nextLine();
		System.out.print("가격 입력 : ");
		int price = sc.nextInt();

		books[insertCnt] = new Book(title, author, publish, price);
		System.out.println("입력됨 ");
		insertCnt++;

		// 책 검색 하는 코드 일부분이다.
		System.out.println("------------- 검색 일부분---------------");
		System.out.print("검색할 책 제목을 입력 :");
		sc.nextLine();// 개행문자 없애기 위해 추가됨 (내용과 상관없음)
		String searchinTitle = sc.nextLine();
		int i;
		for (i = 0; i < insertCnt; i++) {
			if (searchinTitle.equalsIgnoreCase(books[i].getTitle())) {
				System.out.println("검색 결과 존재함 ");
				System.out.println("저자 : " + books[i].getAuthor() + " 출판사 : " + books[i].getPublish() + " 가격: "
						+ books[i].getPrice());
				System.out.println("insertCnt: " + insertCnt);
				break;
			} else
				System.out.println("검색 내용 없음");
		}

		sc.close();
		System.out.println("프로그램 종료");

	}
}