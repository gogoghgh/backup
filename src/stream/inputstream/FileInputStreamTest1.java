package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); // input.txt ���� �Է� ��Ʈ�� ����
						// - Weekend To Do List -
						// 1. CRUD practice
						// 2. Test
			System.out.println("fis.read(): " + fis.read()); // ���� �� �о���� �� �ƴ϶� 8��Ʈ�� �о��,, = 1����Ʈ��
			System.out.println("fis.read(): " + fis.read());
			System.out.println("fis.read(): " + fis.read());
			
		} catch (IOException e) {
			System.out.println("IOException e: " + e);
		} finally {
			try {
				fis.close(); // ���� ��Ʈ���� finally ��Ͽ��� ����
			} catch (IOException e) {
				System.out.println("IOException e: " + e);
			} catch (NullPointerException e) {
				System.out.println("NullPointerException e" + e); // ��Ʈ���� null�� ���
			}
		} // finally
		System.out.println("------The End------");
	}
}