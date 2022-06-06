package p05_30;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //스캐너 선언. 나 스캐너 쓸거다~~ (System.in)= 키보드로부터 입력받을거얌
		System.out.println("↓↓↓정수를 입력하시오↓↓↓"); //사용자 입장에서 개발하기~~ 사용자들이 편하게.. 사용자: 나 어디 입력하지,,? X 
		int input = sc.nextInt(); // 사용자가 ()여기에 입력한 정수를 --> input 변수에 저장
		System.out.println("input: " + input);
		System.out.println("");
		
		//점수 60점 이상이면 통과하셨삼
		System.out.println("↓↓↓점수를 입력하시오↓↓↓");
		int inputScore = sc.nextInt();
		String result = (inputScore >= 60)? "Pass입니다 ㅊㅋㅊㅋ" : "Non-Pass 입니다ㅠㅠ";
		System.out.println(result);
		
	}

}
