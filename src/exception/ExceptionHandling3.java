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
					fis.close(); // ���� �Է� ��Ʈ�� �ݱ�!! ��!! (�ڿ� �� �����,,) 
				} catch (IOException e) {
					e.printStackTrace(); // ���� ���� ���� �˷���
				}
			}
			System.out.println("�׻� ����˴ϴ�...");
		}// finally
		System.out.println("���⵵ �׻� ����˴ϴ�..");
	}// main
}