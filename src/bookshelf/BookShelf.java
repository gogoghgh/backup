package bookshelf;

public class BookShelf extends Shelf implements Queue {
	//Queue �������̽� ����  +  Shelf Ŭ���� ���
	@Override // �迭�� ��� �߰�,, ����������
	public void enQueue(String title) {
		shelf.add(title);   // shelf�� ����? ������ ���� ���µ�? Shelf Ŭ���� ��������ϱ�~~ ArrayList �� �������� shelf��
	}
	
	@Override  // �� ó�� ��Ҹ� �迭���� �����ϰ� + �װ� ��ȯ
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override  // �迭 ��� ���� ��ȯ
	public int getSize() {
		return getCount(); // = ShelfŬ������ shelf.size() �޼�����,, ���� ��Ÿ���� 
	}
}
