package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// test1에서 했던걸 -> try-with-resources~~~ 으로
		try(FileInputStream fis = new FileInputStream("input.txt")) {  
			int i;
			while((i = fis.read()) != -1 ) { 
				// i 값이 -1 (=\) 이 아닌 동안, read() 메서드로 한 바이트를 반복해 읽음
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