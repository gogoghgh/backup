package gameLevel.practice;

public class SuperLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("�� ���� �޸� ");
	}
	
	@Override
	public void jump() {
		System.out.println("�� ���� jump jump");
	}
	
	@Override
	public void turn() {
		System.out.println("�ڵ������ turn ");
	}
	
	@Override
	public void showLevelMessage() {
	System.out.println("======����� ����=====");
	}
}
