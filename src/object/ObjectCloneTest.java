package object;
// clone() 메서드로 인스턴스 복제하기

class Point { // 원점을 의미하는 Point 클래스
	int x;
	int y;

	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {
	}

	@Override
	public String toString() {
		return "x = " + x + ",  y = " + y;
	}
} // Point class

class Circle implements Cloneable { // ★★★ 객체를 복제해도 된다는 의미로
									// cloneable 인터페이스(=mark interface.. 텅 빈..)를 함께 선언
	Point point; // Point형 참조변수 point
	int radius; // 반지름..

	// 생성자
	Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new Point(x, y);
	}

	// overriding
	@Override
	public String toString() {
		return "원점은 " + point + "이고,  반지름은 " + radius + "입니다";
	}

	@Override // Object형 리턴됨
	protected Object clone() throws CloneNotSupportedException { // clone()메서드 사용할 때 발생할 수 있는 오류를.. 예외 처리
		return super.clone(); // super = Object class,, 에 클론 메서드 있잖아 그거 걍 그대로 써라 ㅋ
								// circle.clone() -> circle 주소값 카피~~
	}

} // Circle class

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException { // clone()메서드 사용할 때 발생할 수 있는 오류를.. 예외 처리
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		// clone() 메서드 사용해서 circle 인스턴스를 -> copyCircle에 복제함
		// ★★ (Circle) 붙여서 다운캐스팅!! 왜냐면 clone한 놈이 Object 형이라서,,

		System.out.println("circle: " + circle);
		System.out.println("copyCircle: " + copyCircle);
		System.out.println();
		System.out.println("System.identityHashCode(circle): " + System.identityHashCode(circle));
		System.out.println("System.identityHashCode(copyCircle): " + System.identityHashCode(copyCircle));
	}

}
