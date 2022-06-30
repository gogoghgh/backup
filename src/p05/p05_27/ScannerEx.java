package p05.p05_27;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>>");
		int input = sc.nextInt();
		System.out.println("result: " + (input + 50));
		System.out.println("result: " + input + 50);
		/*
		 * 변수 sc는 Scanner다!! 선언함. Scanner(이미 존재하고 있는 라이브러리(= 기능을 갖고
		 * 있는,,)(=System.out.println 에서의 System과 같은)) 변수,, 사용자로부터 데이터 입력받는 기능~~ in -->
		 * 키보드로부터 입력받는 스캐너를 만들겠다..... 여기서 유일하게 바꿀 수 있는 건 sc(변수명) 뿐.... 패키지 밑에, 클래스 위
		 * 위치에!! import 예약어 써서 스캐너 들고 올 라이브러리 위치 명시해야 함. 근데 일일이 쓸 필요 없이 이클립스에선 단축키 써서 ~~
		 * ctrl+shift+o ★★★★★ sc.next땡땡 메서드들 = 사용자로부터 ~~땡땡 종류를 입력받는 기능 입력받아서 --> 저장 -->
		 * 어디에? 변수에~
		 */

	}

}
