package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			// FileOutputStream�� 
			// ���Ͽ� ���ڸ� ���� �ش��ϴ� �ƽ�Ű �ڵ� ������ ��ȯ��
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(1);
			fos.write(2);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("��� ��^^");
	}

}
