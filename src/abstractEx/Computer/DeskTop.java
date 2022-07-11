package abstractEx.Computer;

public class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("DeskTop display() 메서드임당");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing() 메서드임당");
	}

	// 추상 메서드 Computer의 몸체 코드 마저 작성함^^
}
