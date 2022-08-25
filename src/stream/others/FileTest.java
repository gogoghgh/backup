package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
							// �ش� ��ο� File Ŭ���� ����. ���� ���� ������ ������ ���� �ƴ�
		File file = new File("D:\\newFile.txt");
		file.createNewFile(); // ���� ���� ����

		// ������ �Ӽ��� ���캸�� �޼��� ȣ���Ͽ� ���
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		// ���� ����
		file.delete();

	}

}
