package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);     // 파일 포인터 위치를 반환하는 메서드
		System.out.println("writeInt 완 ↓");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer() + "\n");
		
		rf.writeDouble(3.14);
		System.out.println("writeDouble 완 ↓");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer() + "\n");
		
		rf.writeUTF("안녕하삼");
		System.out.println("writeUTF 완 ↓");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer() + "\n");

		// 파일 포인터의 위치가 맨 처음으로 옮겨지지 않아서 오류 발생.. 
		
		// ㄴ해결 방법
		rf.seek(0); // 파일 포인터 위치를 맨 처음으로 옮기고 위치를 출력함
		System.out.println("rf.seek(0) 완 ↓");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer() + "\n");
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		// 읽기가 끝난 후 파일 포인터 위치를 출력함
		System.out.println("읽기 완 ↓");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer() + "\n");
		
		System.out.println("i: " + i);
		System.out.println("d: " + d);
		System.out.println("str: " + str);
	}
}