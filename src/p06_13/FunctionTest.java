package p06_13;

public class FunctionTest {

	int add(int n1, int n2) { // public static 안 쓰고도 이렇게 하면 됨!!!! 메서드 쓰려면 -> 객체 생성 해야 하니까.. 위에 객체 생성함
		int result = n1 + n2;
		return result; // result를 리턴해준다 result=int타입~~~ 리턴~~
	}
	// FunctionTest라는 Class는, add라는 메서드를 갖고 있는 것
	// static 붙였을 경우에는 객체 생성 안 하고도 쓸 수 있는데,, 찐 개발할 때 이렇게 많이 쓰진 않음
	// 클래스 생성할 때 메인은 따로 빼서~~ 클래스 밑에는 멤버 변수, 메서드만 두삼

}
