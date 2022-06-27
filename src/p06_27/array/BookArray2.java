package p06_27.array;

import java.util.Scanner;

public class BookArray2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		// 인스턴스 생성 후 배열에 저장
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");

		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목을 입력해주세용 >> ");

		String inputTitle = sc.nextLine(); // '공백'이 있는 문자열 들어갈 때는 next()로는 안 됨~
//		System.out.println(inputTitle); // 입력한 거 진짜 잘 들어왔나 확인!! 한 라인 라인씩,, ★ 		
		boolean isBook = false; // 기본값 = 책 없 음 . . .

		// 기본데이터8형은 == 쓰지만
		// 참조데이터형은 .equals(비교대상) 쓰기 ★★
// 내 답..
//		for (int i = 0; i<library.length; i++) {
		// 걍 library[0] 이랑 비교하는 게 아니라,, (왜냐면 쟤는 주소값이잖아요~~~)
		// library[0] -> 에 있는!! BookName이랑 비교~!! ㅇㅏ하~~
//			if(inputTitle.equals(library[i].getBookName())) { 
//				isBook = true; // 책 있음!!! 검색은 다 이거임.....
//				break;
//				System.out.println("책 있습니다^^");
//				library[i].showBookInfo();
//			} 
//			else System.out.println("책 없습니다 ㅠ");
//		} if System.out.println("책 없ㅅ브니다ㅠ");
//		System.out.println();

		for (int i = 0; i < library.length; i++) {
			if (inputTitle.equals(library[i].getBookName())) {
				isBook = true;
				library[i].showBookInfo();
				break;
			}
		}

		if (isBook) {
			System.out.println("책 있음"); // isBook이 true면 책 있음
		} else
			System.out.println("책 없음"); // isBook이 false면 책 없음

//		for (int i = 0; i < library.length; i++) {
//			library[i].showBookInfo();
//		}
//		System.out.println();
//		
//		// library[3].. << 이 값 자체는 걍 주소값을 갖고 있다? 
//		for (int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}

	}

}
