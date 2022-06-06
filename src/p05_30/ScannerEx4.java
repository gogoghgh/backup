package p05_30;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		// 초를 입력받고 --> 시간, 분, 초로 바꾸기
		System.out.println("초를 입력하세요↓");
		Scanner sc = new Scanner(System.in);
		int inputSecond = sc.nextInt();

		//내 답
		int second = inputSecond % 60;
		int minite = inputSecond / 60;
		if (minite == 60) {
			minite = 0;
		}
		int hour = inputSecond / 3600;

		String result = hour + "시간" + minite + "분" + second + "초 입니다";
		System.out.println(result);

		/* 선생님 답
		int hour = time / 3600;
		int min = time % 3600 / 60;   //time-(hour*3600) 시간으로 나눈 나머지 값을 가지고! 60으로 나누면 분이 나옴
		int sec = time % 3600 % 60;   //시간 나누고 분으로 나눈 나머지 값을 가지고! 초 내기 
		
		System.out.println(hour+"시간 "+min+"분 "+sec+"초 입니다");
		수식보다 중요한 건 내가 필요한 변수 생각해내고 만들 수 있는가~~ 통을 만드는 게 중요!!!
		+ 프린트 어떤 형식으로 할건가가 중요
		★ 입력 ---> 처리 ---> 출력 ★ 사용자가 보기 쉽게 만들기
		*/
	}

}
