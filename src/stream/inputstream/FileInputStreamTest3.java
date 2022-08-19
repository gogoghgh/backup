package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
											// ABCDEFGHIJKLMNOPQRSTUVWXYZ
											// lululala
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs)) != -1) {
				/*for(byte b : bs) {
					System.out.print("b: " + b + " / ");
					System.out.println("(char)b: " + (char)b);
					// ���ٵ� .. �̷��� �ϸ� ���ٿ� 6����Ʈ �����̶��� ������,,
					//    7~10 ĭ�� �����ִ� �ڷᰡ ��µ�,,
				}*/
				
				for(int k = 0; k <i; k++) {
					System.out.print("bs[k]: " + bs[k] + " / ");
					System.out.println("(char)bs[k]: " + (char)bs[k]);
				} // ���̷��� �ٲ㼭 ��ü �迭 ����� �ƴ϶� < ����Ʈ ����ŭ ���! 
				  // �� i ������ŭ ����ϵ���~~ �ڵ� �ٲٱ�
				
				System.out.println("��������  " + i + "����Ʈ ����");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---- The End ----");
	} // main
}