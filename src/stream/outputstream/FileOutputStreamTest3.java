package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'�� �ƽ�Ű ��
			for (int i = 0; i < bs.length; i++) {
				// 1~26���� ���鼭 A����~Z���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); 
			// �迭�� �� ��° ��ġ(C:67)���� 10��(L����) ����Ʈ ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��� ��^^");
		
	}//main
}
