package gameLevel.practice;

public class Player {
	private PlayerLevel level;
	
	//������
	public Player(){
		level = new BeginnerLevel();
	}
	
	final public void play(int count) {
		level.run();
		
//		level.jump(i);
		
		
		level.turn();
	}
	
	public void upgradeLevel() {
		
	}
	
}
