package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("���ĺ� ����~~���� ���� [����]�� ��������");
		
		int i;
		try {
			while((i = System.in.read()) != -1) { //  -1 = \ ��!!�� �ǹ�
				System.out.print("i: " + i + "   ");
				System.out.println("(char)i: " + (char)i);
				// while������ read() �޼���� �� ����Ʈ�� �ݺ��� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}