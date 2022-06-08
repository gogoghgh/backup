package chapter4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking;
		System.out.println("몇 등? >>");
		ranking = sc.nextInt();
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = '금';
		break;
		case 2: medalColor = '은';
		break;
		case 3: medalColor = '동';
		break;
		default: medalColor = 'ㅠ';
		}
		
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor +"색입니다. ㅊㅋㅊㅋ");
	}

}
