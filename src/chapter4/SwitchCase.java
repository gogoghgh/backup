package chapter4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 4;
		char medalColor;
		switch (ranking) {
		case 1:
			medalColor = '금';
			break;
		case 2:
			medalColor = '은';
			break;
		case 3:
			medalColor = '동';
			break;
		default:
			medalColor = '녹';

		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + "색입니다");

		System.out.println("----------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("ㅇ월?");
		int month = sc.nextInt();
		int day;

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			day = 31;
			System.out.println(day);
			break;
			
		case 4, 6, 9, 11:
			day = 30;
			System.out.println(day);
			break;
		case 2:
			day = 28;
			System.out.println(day);
			break;
		}
	}

}
