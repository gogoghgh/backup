package string;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException { // ����ó�� �� �����ϱ� ��������,,
		byte[] bytes = new byte[100];

		System.out.print("�Է����ּ���: ");
		int readByteNo = System.in.read(bytes);  
		// �� bytes�� ���� �����Ͱ� �� �� ������,, �ϱ� int...
												// �Է¹޾ƿ��� �޼���,,
												// �����ε�1. �Ű����� ���� read = �� 8��Ʈ! ���� �� �ϳ��ۿ� �� ������ 
												// �����ε�2. �Ű����� �ִ� read = bytes Ÿ���� �迭������ ����!! 
												// = Q. Ű����κ��� 8��Ʈ¥�� �� �� �޾ƿðų�? 
												// A. ���� ������ new byte[100] <<���� ���ڿ� ���ǵ� ��ŭ~ bytes �迭 ������ŭ !! ���� �� ����

		// bytes�� �ѱ� ���������? �� �� �� ��,, 
		// -> ��: 16��Ʈ��.. �� ����(8��Ʈ)�� ���ְ�, ���� ĭ���� ������ 8��Ʈ ���ְ� '��' �ϼ�,, 
		// -> so �ѱ��� 50�� ��!! (���ĺ��� 100�� �� ��).....
		// �ϳ� �ϳ��� ���� �� ���� ����,,,,, �ѱ�,, �ɰ��� ���ϱ�

		String str = new String(bytes, 0, readByteNo - 2); // ������ ���ϰ� ������ ������ String �����ھ�!!!!
		// �ٵ� �����ִ� ����Ʈ ���� ��Ʈ������ ��Ƽ�! �ѹ濡 �� �� �ְ� ���ִ� �� �̰�!! ���� �״�� String���� ��Ÿ����
		// String(�迭 ��, 0 = �ʱ� �ε��� ��, �� ���� �����͸� String���� �Ұǰ�?)
		//       �ٵ� -2�� ��?? bytes�� ����Ű�� ���ԵǾ� ���� ������.. �ѱۿ��� ���� �Ѵ�.....
		//       13+10 �������� -> ���Ͱ� ��.. ����~~~
		System.out.println(str);
		System.out.println(bytes);

		for (int i = 0; i < bytes.length; i++) {
			System.out.print("bytes[" + i + "] :  " + (char) bytes[i] + " / ");
			System.out.println("bytes[" + i + "] :  " + bytes[i]);
		}
	}

}
