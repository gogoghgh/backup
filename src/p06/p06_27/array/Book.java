package p06.p06_27.array;

public class Book {
	private String bookName;
	private String author;

	public Book() {
	} // ����Ʈ ������

	// å �̸��� ���� �̸��� �Ű������� �޴� ������
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	// private�� ����������̶�,, ���ͼ��� �޼��� ������ֱ�
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

	// å ������ ������ִ� �޼���
	public void showBookInfo() {
		System.out.println("bookName: " + bookName + " , author: " + author);
	}

}
