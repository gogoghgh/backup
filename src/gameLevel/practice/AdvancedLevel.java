package gameLevel.practice;

public class AdvancedLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("���� �޸� ");
	}
	
	@Override
	public void jump() {
		System.out.println("���� jump jump");
	}
	
	@Override
	public void turn() {
		System.out.println("turn �� �� ");
	}
	
	@Override
	public void showLevelMessage() {
	System.out.println("======�߱��� ����=====");
	}
}
