package p06_02;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// for�� �̿�, ������ 3�� �Է¹޾Ƽ� �� �������� ��, ��� ���
		Scanner sc = new Scanner(System.in); 
		int inputValue; 

		int sum = 0;
		int average = 0;
		int i = 0;

		for (i = 1; i <= 3; i++) {
			System.out.println("���� �Է� >>");
			inputValue = sc.nextInt();
			sum += inputValue;
		}

		//---- ������ ��----//
//		int sum = 0 // =0 ���̱�!!!
//				
//		System.out.println("sum = " + sum);
//		System.out.println("average = " + (average = sum / 3));
//
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("���� �Է� >>");
//			int num = sc.nextInt(); 
				/* num1, 2, 3.. �� �ʿ� ����. 
				for �� ������ num ���� ����� ->�������..�ݺ� */
//			sum+=num;
//		}
//		
//		int avg = sum/3;
//		System.out.println("�հ�: " +sum+" ��� : " +avg);
		
		
		
		
	}

}
