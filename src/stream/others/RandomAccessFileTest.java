package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);     // ���� ������ ��ġ�� ��ȯ�ϴ� �޼���
		System.out.println("writeInt �� ��");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer() + "\n");
		
		rf.writeDouble(3.14);
		System.out.println("writeDouble �� ��");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer() + "\n");
		
		rf.writeUTF("�ȳ��ϻ�");
		System.out.println("writeUTF �� ��");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer() + "\n");

		// ���� �������� ��ġ�� �� ó������ �Ű����� �ʾƼ� ���� �߻�.. 
		
		// ���ذ� ���
		rf.seek(0); // ���� ������ ��ġ�� �� ó������ �ű�� ��ġ�� �����
		System.out.println("rf.seek(0) �� ��");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer() + "\n");
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		// �бⰡ ���� �� ���� ������ ��ġ�� �����
		System.out.println("�б� �� ��");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer() + "\n");
		
		System.out.println("i: " + i);
		System.out.println("d: " + d);
		System.out.println("str: " + str);
	}
}