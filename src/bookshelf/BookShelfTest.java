package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// ����              ����
		Queue shelfQueue = new BookShelf();
		// ������� ��Ҹ� �ڿ������� �߰�   .add
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		shelfQueue.enQueue("�¹���4");
		System.out.println("getSize: " + shelfQueue.getSize());
		
		// �Է� ������� ��Ҹ� �տ������� ������ ���     .remove
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("getSize: " + shelfQueue.getSize());
		
	}

}
