package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'의 아스키 값
			for (int i = 0; i < bs.length; i++) {
				// 1~26까지 돌면서 A부터~Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); 
			// 배열의 세 번째 위치(C:67)부터 10개(L까지) 바이트 출력
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력 완^^");
		
	}//main
}
