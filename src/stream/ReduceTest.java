package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator 인터페이스를 구현한 클래스 정의
class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String s1, String s2) {
		// reduce() 메서드가 호출될 때 불리는 메서드(apply)
		// 두 문자열(s1, s2) 길이를 비교해서 더 긴 놈 리턴
		if (s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;

		// 삼항연산자로도 되겠군
	}

}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~~~", "hello", "Good morning", "방가방가~~~~~~~~~~~~~" };
		System.out.println(Arrays.stream(greetings)
			.reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));
		
		// BinaryOperator를 구현한 클래스 사용
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println("젤 긴 놈: " + str);
			// reduce() 오버로딩,, 매개변수에 클래스가 들어가는~~ reduce는, 리턴타입이 Optional<T>
			// Optional type -> java.util.Optional -> 주요 메서드: get(), ifPresent(), orElse()....
			// get() ctrl 눌러서 declaration 보삼 
	}
}
