package p06_27.array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5]; // Book 클래스형으로 객체 배열 생성
		// ㄴ 이 결과 인스턴스 5개가 만들어진 게 아니라,,
		// Book 주소값을 담을 공간이 5개 만들어지고,
		// 자동으로 각 공간은 '비어있다'는 의미의 null값으로 초기화 된다..

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}
