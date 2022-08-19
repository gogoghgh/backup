package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// test1���� �ߴ��� -> try-with-resources~~~ ����
		try(FileInputStream fis = new FileInputStream("input.txt")) {  
			int i;
			while((i = fis.read()) != -1 ) { 
				// i ���� -1 (=\) �� �ƴ� ����, read() �޼���� �� ����Ʈ�� �ݺ��� ����
				System.out.print("i: " + i + "   ");
				System.out.println("(char)i:   " + (char)i);
			}
			System.out.println("------The End------");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}