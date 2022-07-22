package classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
// String 클래스 정보 가져오기
	public static void main(String[] args) throws ClassNotFoundException{
		// 1. 클래스 이름 입력해서~~~~~ String class 가져오기
//		Class strClass = Class.forName("java.lang.String");
		
		// 2. 직접 class 파일 대입해서~~~ String class 가져오기
//		Class strClass = String.class;
		
		// 3. Object의 getClass()메서드 사용해서~~~ String class 가져오기
		String str = new String("");
		Class strClass = str.getClass();
		strClass.getClass();
		System.out.println("strClass: " + strClass);
		System.out.println("str: " + str);
		
		
		System.out.println(strClass + "를 소개합니다");
		System.out.println();
		
		// 모든 생성자 가져오기
		System.out.println("------ 모든 생성자 가져오기 ------- ");
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println("c: " + c);
		}
		
		// 모든 멤버 변수(=필드) 가져오기
		System.out.println();
		System.out.println("------ 모든 멤버 변수(=필드) 가져오기 ------- ");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println("f: " + f);
		}
		
		// 모든 메서드 가져오기
		System.out.println();
		System.out.println("------ 모든 메서드 가져오기 ------- ");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println("m: " + m);
		}
	}

}
