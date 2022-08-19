package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A'); // ���� �ϳ� ���
			char buf[] = {'P', 'P', 'L', 'E'};
			
			fw.write(buf); // ���� �迭 buf ���
			fw.write("�ȳ��ϼ���,,,?"); // ���ڿ� ���
			fw.write(buf, 1, 3); //���� �迭 buf�� �Ϻ� ���(1���� �����ؼ� 2����? �� ��?)
			fw.write("65"); // ���� �״�� ���,, �ƽ�Ű�� �ƴ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ�������");
		// ���
		// APPLE�ȳ��ϼ���,,,?PL65
	}
}