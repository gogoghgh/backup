package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try { 
			// 예외가 발생할 수 있으므로, try 블록에 작성
			for(int i = 0; i <=5; i++) {
				arr[i] = i;
				System.out.println(arr[i]); 
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외가 발생하면 catch 블록 수행
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");

		
		System.out.println("--------- ArithmeticException 프로그램 시작---------");
		int num = 100;
		int num2 = 0;

		try {
			int a = num / num2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눔");
			e.printStackTrace(); // 어디서 오류났는지 알려주는 메서드
			System.out.println(e.getLocalizedMessage()); // 어떤 오류메시지인지를 String 값으로~~ 바꿔서
		}

		System.out.println("메인 끝");

	}

}
