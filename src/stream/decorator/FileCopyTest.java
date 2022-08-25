package stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try {
			FileInputStream fis = new FileInputStream("C:/Windows/explorer.exe");
			FileOutputStream fos = new FileOutputStream("D:/my_explorer.exe");
			millisecond = System.currentTimeMillis(); // 파일 복사를 시작하기 전 시간
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			// 파일을 복사하는 데 걸리는 시간 계산
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데에 " + millisecond + " milliseconds 소요됨");
		
		// 파일 복사하는 데에 17578 milliseconds 소요됨.. wow!!!

	}

}
