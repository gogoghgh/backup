package p05_30;

public class Test6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " hello");
			}
			/*
			 * i++ 자리에 i+=2.. 이런건 안 좋음~~ 가독성도 구리고,, 걍 i++로 고고.. 홀짝만 돌리고 싶은데,, 하면 차라리 안에다가
			 * if문을 쓰삼
			 */
		}

		// 1~10까지 더한 결과? 걍 외우기!! 넘 유명.. 식, 값까지 다 외우기
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum = sum+i;
		}
			System.out.println(sum); // 불변적인 코드!! 1~10, 1~100, 1~10000까지 더하든.. 다 이거
		
			/*
			 * i = 1, sum = sum + i = (0) + 1 = 1 
			 * i = 2, sum = sum + i = (0 + 1) + 2 = 3 
			 * i = 3, sum = sum + i = (0 + 1 + 2) + 3 = 6...
			 * ...
			 * i = 10, sum = sum + i = (0 + 1 + 2 + 3+ ... + 8 + 9) + 10 = 55
			 */
			
		int product = 1;
		for(i = 1; i <=10; i++) {
			product = product*i;
		}
		System.out.println(product);
	
		
		/*변수의 scope: 변수 i를 for안에서 선언하면, for문 안에서만 i 변수 유효함.. 
		변수 범위를 어디까지 잡을 것인가??!
		for문 안에서만 쓰고 안 쓴다~ 하면 for문 안에서 선언하고, 
		계속 쓰고 싶으면 for문 밖에, 메인 메서드 밑에 선언하기 */
		
	
	}
	
	
}
