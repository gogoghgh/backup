package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("C:/Windows/explorer.exe");
				FileOutputStream fos = new FileOutputStream("D:/my_my_explorer.exe");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = bis.read()) != -1) {
				// line일 경우,, null!! 리턴도 String line;으로
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사에 소요된 시간: " + millisecond + " milliseconds");
		// 파일 복사에 소요된 시간: 115 milliseconds 와우!! 짱 빠르네
	}

}
