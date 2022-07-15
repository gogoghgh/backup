package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		// 상위              하위
		Queue shelfQueue = new BookShelf();
		// 순서대로 요소를 뒤에서부터 추가   .add
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		shelfQueue.enQueue("태백산맥4");
		System.out.println("getSize: " + shelfQueue.getSize());
		
		// 입력 순서대로 요소를 앞에서부터 꺼내서 출력     .remove
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("getSize: " + shelfQueue.getSize());
		
	}

}
