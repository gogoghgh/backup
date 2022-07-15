package gameLevel.practice;

// 추상클래스 PlayerLevel..
public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	//Player class가 아니라,, PlayerLevel 클래스에서 final로 선언,,, 
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

}
