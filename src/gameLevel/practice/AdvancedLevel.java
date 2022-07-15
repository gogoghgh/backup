package gameLevel.practice;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("빨리 달림 ");
	}
	
	@Override
	public void jump() {
		System.out.println("높이 jump jump");
	}
	
	@Override
	public void turn() {
		System.out.println("turn 못 함 ");
	}
	
	@Override
	public void showLevelMessage() {
	System.out.println("======중급자 레벨=====");
	}
}
