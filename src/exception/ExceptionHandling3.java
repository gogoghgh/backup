package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("b.txt");
		} catch (FileNotFoundException e) {
			System.out.println("e: " + e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close(); // 파일 입력 스트림 닫기!! 꼭!! (자원 안 썼더라도,,) 
				} catch (IOException e) {
					e.printStackTrace(); // 무슨 오류 났나 알려줌
				}
			}
			System.out.println("항상 수행됩니다...");
		}// finally
		System.out.println("여기도 항상 수행됩니다..");
	}// main
}