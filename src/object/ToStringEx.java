package object;

class Book {
	int bookNumber;
	String bookTitle;

	// 생성자
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {  // toString() 메서드 재정의
		return " ♥ 책 제목: " + bookTitle + " ♥ "
		 + "\n"  + " ♥ 책 남바: " + bookNumber + "번 ♥ ";
	}
}



public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "개미");

		System.out.println(book1);
		System.out.println();
		System.out.println(book1.toString()); 
		// toString()메서드 override 하기 전... 둘 다 주소값 나옴 
		// object.Book@7a81197d
		// object.Book@7a81197d
		
		// 왜 이렇게 하남..? 왜 굳이 toString 재정의하고,,
		// -> showInfo()같은 메서드 대신~~~ 쓸 수 있게

	}

}
