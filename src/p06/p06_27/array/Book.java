package p06.p06_27.array;

public class Book {
	private String bookName;
	private String author;

	public Book() {
	} // 디폴트 생성자

	// 책 이름과 저자 이름을 매개변수로 받는 생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// private한 멤버변수들이라,, 게터세터 메서드 만들어주기
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 책 정보를 출력해주는 메서드
	public void showBookInfo() {
		System.out.println("bookName: " + bookName + " , author: " + author);
	}

}
