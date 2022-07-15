package gameLevel.practice;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("개 빨리 달림 ");
	}
	
	@Override
	public void jump() {
		System.out.println("개 높이 jump jump");
	}
	
	@Override
	public void turn() {
		System.out.println("멋들어지게 turn ");
	}
	
	@Override
	public void showLevelMessage() {
	System.out.println("======고급자 레벨=====");
	}
}
