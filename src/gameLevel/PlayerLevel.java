package gameLevel;

public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	// 모든 레벨 다 똑같이! 실행
	// 재정의되면 안 되므로 final로 선언
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) { // int count 매개변수 들어온 만큼 jump
			jump();
		}
		turn();
	}

}
