package lambda;

import java.util.Scanner;

class StringConcatImpl implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ",,, " + s2 + ",,, ♬");
	}
}

public class TestStringConcat{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 인터페이스 구현하기
		System.out.println("----- 늘 해왔던 대로~~ ------");
		System.out.println("문자열1 입력 >>>");
		String s1 = sc.next();
		System.out.println("문자열2 입력 >>>");
		String s2 = sc.next();
//		String s1 = "안녕";
//		String s2 = "하삼";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		System.out.println();
		
		System.out.println("----- 람다식으로~~ ------");
		StringConcat concat2 = (s, v) -> System.out.println(s + ",,, " + v + ",,, ♬");
		// StringConcat interface에서 바로 ,, ㄷㄷㄷ 깔끔하니까 좋긴 좋네
		concat2.makeString(s1, s2);
	}
}