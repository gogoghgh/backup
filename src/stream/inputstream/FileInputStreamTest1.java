package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); // input.txt 파일 입력 스트림 생성
						// - Weekend To Do List -
						// 1. CRUD practice
						// 2. Test
			System.out.println("fis.read(): " + fis.read()); // 파일 다 읽어오는 게 아니라 8비트만 읽어옴,, = 1바이트만
			System.out.println("fis.read(): " + fis.read());
			System.out.println("fis.read(): " + fis.read());
			
		} catch (IOException e) {
			System.out.println("IOException e: " + e);
		} finally {
			try {
				fis.close(); // 열린 스트림은 finally 블록에서 닫음
			} catch (IOException e) {
				System.out.println("IOException e: " + e);
			} catch (NullPointerException e) {
				System.out.println("NullPointerException e" + e); // 스트림이 null인 경우
			}
		} // finally
		System.out.println("------The End------");
	}
}