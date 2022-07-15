package object;

class Book {
	int bookNumber;
	String bookTitle;

	// ������
	Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {  // toString() �޼��� ������
		return " �� å ����: " + bookTitle + " �� "
		 + "\n"  + " �� å ����: " + bookNumber + "�� �� ";
	}
}



public class ToStringEx {
	public static void main(String[] args) {
		Book book1 = new Book(200, "����");

		System.out.println(book1);
		System.out.println();
		System.out.println(book1.toString()); 
		// toString()�޼��� override �ϱ� ��... �� �� �ּҰ� ���� 
		// object.Book@7a81197d
		// object.Book@7a81197d
		
		// �� �̷��� �ϳ�..? �� ���� toString �������ϰ�,,
		// -> showInfo()���� �޼��� ���~~~ �� �� �ְ�

	}

}
