package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) throws IOException{
		System.out.println("알파벳 하나를 쓰고 [엔터]를 눌러주세용");
		
		int i;
		try {
			i = System.in.read(); // read() 메서드로 한 바이트 읽음
						// read 메서드는 딱 8비트만 읽어온다!! 8bit = 1byte
			System.out.println("i: " + i);
			System.out.println("(char)i: " + (char)i); // 문자로 변환하여 출력
			// A: 65 ㅇㅋ
			// a: 97 ㅇㅋ
			// 1: 49 ㅇㅋ
			// abc: 97... 앞에 8비트인 a만 읽어와서
			// 가: 176,,,,,?? 16비트라서 8비트에 해당하는 부분만 딱 들고 와서,,^^ 깨져버리죠~~
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}