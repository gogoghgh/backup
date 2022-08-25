package stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// ���� ��Ʈ���� InputStreamReader�� �Ű������� 
		// ��� ��Ʈ���� FileInputStream�� �޾� ������
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			int i;
			while((i = isr.read()) != -1) { 
				// ������ ���� -1�� ��ȯ�� ������ ���� ��Ʈ������ �ڷḦ ����
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
