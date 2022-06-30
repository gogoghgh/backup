package p06.p06_10;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
//		문제: 사용자가 이름 3개 입력하는 String [] name 만들기..
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요 >>");
			name[i] = sc.next();
			System.out.println(name[i] + "님 방가방가");
			System.out.println("---------------------------------");
		}

//		결과 확인
		for (int i = 0; i < 3; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}

	}

}
