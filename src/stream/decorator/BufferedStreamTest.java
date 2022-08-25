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
				// line�� ���,, null!! ���ϵ� String line;����
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���翡 �ҿ�� �ð�: " + millisecond + " milliseconds");
		// ���� ���翡 �ҿ�� �ð�: 115 milliseconds �Ϳ�!! ¯ ������
	}

}
