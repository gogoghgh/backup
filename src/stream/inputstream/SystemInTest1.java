package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException{
		System.out.println("���ĺ� �ϳ��� ���� [����]�� �����ּ���");
		
		int i;
		try {
			i = System.in.read(); // read() �޼���� �� ����Ʈ ����
						// read �޼���� �� 8��Ʈ�� �о�´�!! 8bit = 1byte
			System.out.println("i: " + i);
			System.out.println("(char)i: " + (char)i); // ���ڷ� ��ȯ�Ͽ� ���
			// A: 65 ����
			// a: 97 ����
			// 1: 49 ����
			// abc: 97... �տ� 8��Ʈ�� a�� �о�ͼ�
			// ��: 176,,,,,?? 16��Ʈ�� 8��Ʈ�� �ش��ϴ� �κи� �� ��� �ͼ�,,^^ ����������~~
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}