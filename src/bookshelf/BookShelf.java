package bookshelf;

public class BookShelf extends Shelf implements Queue {
	//Queue 인터페이스 구현  +  Shelf 클래스 상속
	@Override // 배열에 요소 추가,, 끝에서부터
	public void enQueue(String title) {
		shelf.add(title);   // shelf가 뭐지? 선언한 적이 없는디? Shelf 클래스 상속했으니까~~ ArrayList 의 참조변수 shelf임
	}
	
	@Override  // 맨 처음 요소를 배열에서 삭제하고 + 그걸 반환
	public String deQueue() {
		return shelf.remove(0);
	}
	
	@Override  // 배열 요소 개수 반환
	public int getSize() {
		return getCount(); // = Shelf클래스에 shelf.size() 메서드임,, 길이 나타내는 
	}
}
