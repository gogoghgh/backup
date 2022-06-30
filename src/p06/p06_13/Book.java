package p06.p06_13;

public class Book { // 도서관 관리 프로그램
	private String title; // 책 이름 멤버 변수.... 보안을 위해서 좀 private 하게 만들게~
	private String author; // 저자 멤버 변수
	private int price; // 책 가격 멤버 변수
	// 헉!!! private이라서 main메서드에서 못 써먹는데??? --> "setOOOO 메서드"를 쓰자!!

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 와우!! 자동으로 만들기 삽가능

}
