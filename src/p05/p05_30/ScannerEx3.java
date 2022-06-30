package p05.p05_30;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		// 반지름값 입력받아서 원 면적 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("↓반지름을 입력하세요↓");
		final double PI = 3.14; // 상수 final 예약어.. 상수는 "대문자", camel case 말고 "_"로 쓰는 게 관용적인 표시
		double inputR = sc.nextDouble();
		double area = inputR * inputR * PI;
		System.out.println("원의 면적은 " + area + "입니다.");

	}

}
