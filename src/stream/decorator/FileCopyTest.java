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
			millisecond = System.currentTimeMillis(); // ���� ���縦 �����ϱ� �� �ð�
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			// ������ �����ϴ� �� �ɸ��� �ð� ���
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� �����ϴ� ���� " + millisecond + " milliseconds �ҿ��");
		
		// ���� �����ϴ� ���� 17578 milliseconds �ҿ��.. wow!!!

	}

}
