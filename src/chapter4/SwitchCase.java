package chapter4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking;
		System.out.println("�� ��? >>");
		ranking = sc.nextInt();
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = '��';
		break;
		case 2: medalColor = '��';
		break;
		case 3: medalColor = '��';
		break;
		default: medalColor = '��';
		}
		
		System.out.println(ranking + "�� �޴��� ������ " + medalColor +"���Դϴ�. ��������");
	}

}
