package p06.p06_27.array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[5];
		Book[] bookArray2 = new Book[5];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		bookArray1[3] = new Book("안녕", "하세요");
		
		bookArray2[4] = new Book("쵸코", "하임");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 4);
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 2);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
