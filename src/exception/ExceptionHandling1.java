package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try { 
			// 반드시 try-catch문 써줘야 하는!!! FileInputStream...
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);  // 예외 클래스의 toString() 메서드 호출
			// a.txt 파일 만들고 나니까 여기는 걍 넘어가네~ 
		}
		System.out.println("여기도 수행됩니다^^ 돈 워리"); // 정상 출력
	}

}
