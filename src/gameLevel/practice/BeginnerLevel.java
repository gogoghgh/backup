package gameLevel.practice;

public class BeginnerLevel extends PlayerLevel {
	@Override
	public void run() {
		System.out.println("õõ�� �޸�");
	}
	
	@Override
	public void jump() {
		System.out.println("jump ���ؿ�");
	}
	
	@Override
	public void turn() {
		System.out.println("turn ���ؿ�");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("=======���ʷ���======");
	}
}
