package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
			// �ڹ� 9���� �����ϴ� ���� try-with-resources��
													// �� ��° �Ű������� true��� ��� ������
													// �̹� ���� �ڷῡ ����Ǿ� ��µ�
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'�� �ƽ�Ű ��
			for (int i = 0; i < bs.length; i++) {
				// 1~26���� ���鼭 A����~Z���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs); // ����Ʈ �迭�� �Ѳ����� ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("��� ��^^");
		
	}//main
}
