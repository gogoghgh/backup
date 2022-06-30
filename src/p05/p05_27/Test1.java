package p05.p05_27;

public class Test1 {

	public static void main(String[] args) {
		byte a;
		a = 100;
		a = 127;
		// a = 128; //type mismatch
		long b = 1234567890;
		long bb = 1234567890L;// L붙이는 순간 컴파일러가 64비트짜리 숫자로 만들어줌.. 안 붙이면 32비트 숫자로 만드는거고,, float도 똑같
		long bbb = 1234567890123456789L;

		float c = 0.1f; // f 붙여야 32비트로 할당되어진 c 메모리로 들어감,,, 안 붙이면 64비트..

		// --형변환--//
		c = b; // 오류 없음!! float > long 이니까
		// b = c; 오류 발생!!
		b = (int) c; // 수동 형변환!!!!! float(큰) -> int(작) 로,, 흔히 쓰는 편 ★

		char d = 'a';
		System.out.println(d); // a 출력

		boolean e = false;

		String s = "abcdefghijklmonpqrstuvwxyz@ 123";

		int f = 'a'; // 자동 형변환!! int > char
		System.out.println(f); // 97 출력/ 문자 a가 유니코드에서 0061 -> 10진수로 바꾸면 97임
		System.out.println((char) f); // 수동형변환!! int(큰)를 강제로 char(작)로 표현할래~~

		byte i = 10;
		// byte j = i+100; 오류o 연산자가 중간에 들어가면 무조건 int 값으로 들어감
		// int j = i+100; 오류 x
		byte j = (byte) (i + 100); // 연산자 썼기 때문에 int 110을 -> 수동형변환 -> byte형으로 바꿈
		System.out.println(j);
		b = b + 1; // 연산자 큰거 + 작은거 => 큰 타입으로 변환됨
		f = f + 'b'; // a에 해당하는 97 + b에 해당하는 98 --> so 가넝한!
		s = "abc" + f; // 좌변이나 우변에 String 이 있으면 +는 연결연산자!! --> abc + (97 + 98) --> 숫자가 아니라 문자열임!!
		System.out.println(s);
		System.out.println(f + ""); // 이 때 f는 int가 아니라 --> 빈 문자열을 갖는 String 문자열이 됨

		// --논리연산자--//
		boolean bfood = true;
		boolean lfood = false;
		System.out.println(bfood & lfood);
		System.out.println(bfood | lfood);
		System.out.println(!bfood & lfood);
		System.out.println(bfood & !lfood);
		System.out.println(!bfood & !lfood);
		System.out.println(!bfood | lfood);
		System.out.println(bfood | !lfood);
		System.out.println(!bfood | !lfood);
		System.out.println("");

		// --비교연산자--//
		int age = 15;
		System.out.println(age < 18);
		System.out.println(age > 18);
		System.out.println(age <= 15);
		System.out.println(age >= 16);
		System.out.println(age == 18);
		System.out.println(age == 15);
		System.out.println(age != 15);
		System.out.println(age != 18);

		// --대입연산자--//
		age += 5; // age = age + 5;
		System.out.println(age);
		System.out.println("");

		// --증감연산자--//
		++age;
		System.out.println(age);
		--age;
		System.out.println(age);
		age++;
		System.out.println(age);
		age--;
		System.out.println(age);
		System.out.println(age++);
		System.out.println(age);
		System.out.println("");

		// --삼항연산자--//
		String result = (age >= 18) ? "성인" : "미성년자";
		System.out.println(result);
		System.out.println("");

		// --문제: 점수 90점 이상이면 A, 80점 이상이면 B, 나머지 C --//
		int score = 50;
		result = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C");
		System.out.println(result);

	}

}
