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
					// ㄴ근데 .. 이렇게 하면 막줄에 6바이트 읽음이라고는 뜨지만,,
					//    7~10 칸에 남아있는 자료가 출력됨,,
				}*/
				
				for(int k = 0; k <i; k++) {
					System.out.print("bs[k]: " + bs[k] + " / ");
					System.out.println("(char)bs[k]: " + (char)bs[k]);
				} // ㄴ이렇게 바꿔서 전체 배열 출력이 아니라 < 바이트 수만큼 출력! 
				  // 즉 i 개수만큼 출력하도록~~ 코드 바꾸기
				
				System.out.println("ㄴ여까지  " + i + "바이트 읽음");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("---- The End ----");
	} // main
}