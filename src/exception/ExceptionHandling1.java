package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try { 
			// �ݵ�� try-catch�� ����� �ϴ�!!! FileInputStream...
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);  // ���� Ŭ������ toString() �޼��� ȣ��
			// a.txt ���� ����� ���ϱ� ����� �� �Ѿ��~ 
		}
		System.out.println("���⵵ ����˴ϴ�^^ �� ����"); // ���� ���
	}

}
