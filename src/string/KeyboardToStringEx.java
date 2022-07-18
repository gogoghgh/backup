package string;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException { // 예외처리 안 적으니까 오류나넴,,
		byte[] bytes = new byte[100];

		System.out.print("입력해주세용: ");
		int readByteNo = System.in.read(bytes);  
		// ㄴ bytes에 실제 데이터가 몇 개 들어갔는지,, 니까 int...
												// 입력받아오는 메서드,,
												// 오버로딩1. 매개변수 없는 read = 딱 8비트! 문자 딱 하나밖에 못 가져옴 
												// 오버로딩2. 매개변수 있는 read = bytes 타입의 배열변수만 가능!! 
												// = Q. 키보드로부터 8비트짜리 몇 개 받아올거냐? 
												// A. 위에 정해진 new byte[100] <<여기 숫자에 정의된 만큼~ bytes 배열 개수만큼 !! 들어올 수 있음

		// bytes에 한글 집어넣으면? 가 나 다 라,, 
		// -> 가: 16비트임.. 그 절반(8비트)이 들어가있고, 다음 칸에는 나머지 8비트 들어가있고 '가' 완성,, 
		// -> so 한글은 50개 들어감!! (알파벳이 100개 들어갈 時).....
		// 하나 하나씩 보면 다 깨져 보임,,,,, 한글,, 쪼개서 들어가니까

		String str = new String(bytes, 0, readByteNo - 2); // 굉장히 흔하게 나오는 형식의 String 생성자쓰!!!!
		// 근데 깨져있는 바이트 값을 스트링으로 모아서! 한방에 볼 수 있게 해주는 게 이거!! 원본 그대로 String으로 나타내줌
		// String(배열 값, 0 = 초기 인덱스 값, 몇 개의 데이터를 String으로 할건가?)
		//       근데 -2는 왜?? bytes에 엔터키도 포함되어 들어가기 때문에.. 한글에서 빼야 한다.....
		//       13+10 합쳐져야 -> 엔터가 됨.. 아하~~~
		System.out.println(str);
		System.out.println(bytes);

		for (int i = 0; i < bytes.length; i++) {
			System.out.print("bytes[" + i + "] :  " + (char) bytes[i] + " / ");
			System.out.println("bytes[" + i + "] :  " + bytes[i]);
		}
	}

}
