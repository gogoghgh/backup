package string;

public class SplitEx {

	public static void main(String[] args) {
		String str = "홍길동, 김길동, 고길동";
		System.out.println(str);
		String[] names = str.split(", "); // 리턴타입은 String[]
		for (String name : names)
			System.out.println("이름: " + name);
		System.out.println();

		str = "홍길동 김길동 고길동";
		System.out.println(str);
		names = str.split(" ");
		for (String name : names)
			System.out.println("이름: " + name);
		System.out.println();

		str = "홍길동a김길동z고길동c이길동";
		System.out.println(str);
//		names = str.split("a"); 
		// 구분자가 다 달라ㅠ 근데 공통점은? 영어 알파벳이네~~
		// 영어 알파벳이다~~ 를 알려주는 정규식!!! 사용
		names = str.split("[a-z]");
		// split이라는 메서드를 썼기 때문에!!
		// "정규식 문자열"을 문자열로 보는 게 아니라
		// 아~ 이거 정규식이구나~~ 하고 컴파일러가 알아먹을 수 있는 것,,
		// split(String regex) ==> regular expression 정규식이 매개변수로 들어갈 수 있네~
		for (String name : names)
			System.out.println("이름: " + name);
		System.out.println();
		System.out.println("---------------------");
		System.out.println();

		// 오토박싱 언박싱
		Integer num1 = new Integer(100);
		int num2 = 200;
		// Integer + int 쌉가능
		int sum = num1 + num2; // num.intValue()로 변환 (언박싱: 객체형 -> 기본형)
		Integer num3 = num2; // Integer.valueOf(num2)로 변환(오토박싱: 기본 -> 객체형)
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
	}

}
