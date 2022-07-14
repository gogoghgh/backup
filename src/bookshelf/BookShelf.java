package bookshelf;

public class BookShelf extends Shelf implements Queue {
	//Queue 인터페이스 구현
	@Override // 배열에 요소 추가,, 끝에서부터
	public void enQueue(String title) {
		shelf.add(title);
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override
	public int getSize() {
		return getCount();
	}
}
