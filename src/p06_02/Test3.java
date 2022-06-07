package p06_02;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// for문 이용, 정수를 3번 입력받아서 이 정수들의 합, 평균 출력
		Scanner sc = new Scanner(System.in); 
		int inputValue; 

		int sum = 0;
		int average = 0;
		int i = 0;

		for (i = 1; i <= 3; i++) {
			System.out.println("정수 입력 >>");
			inputValue = sc.nextInt();
			sum += inputValue;
		}

		//---- 선생님 답----//
//		int sum = 0 // =0 붙이기!!!
//				
//		System.out.println("sum = " + sum);
//		System.out.println("average = " + (average = sum / 3));
//
//		for(int i = 1; i <= 3; i++) {
//			System.out.println("정수 입력 >>");
//			int num = sc.nextInt(); 
				/* num1, 2, 3.. 할 필요 없음. 
				for 돌 때마다 num 새로 생기고 ->사라지고..반복 */
//			sum+=num;
//		}
//		
//		int avg = sum/3;
//		System.out.println("합계: " +sum+" 평균 : " +avg);
		
		
		
		
	}

}
