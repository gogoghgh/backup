package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A'); // 문자 하나 출력
			char buf[] = {'P', 'P', 'L', 'E'};
			
			fw.write(buf); // 문자 배열 buf 출력
			fw.write("안녕하세요,,,?"); // 문자열 출력
			fw.write(buf, 1, 3); //문자 배열 buf의 일부 출력(1부터 시작해서 2까지? 두 개?)
			fw.write("65"); // 숫자 그대로 출력,, 아스키값 아님
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습ㄴ디ㅏ");
		// 결과
		// APPLE안녕하세요,,,?PL65
	}
}