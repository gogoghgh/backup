package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
			// 자바 9부터 제공하는 향상된 try-with-resources문
													// 두 번째 매개변수에 true라고 썼기 때문에
													// 이미 쓰인 자료에 연결되어 출력됨
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65; //'A'의 아스키 값
			for (int i = 0; i < bs.length; i++) {
				// 1~26까지 돌면서 A부터~Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs); // 바이트 배열을 한꺼번에 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 완^^");
		
	}//main
}
