package gameLevel.practice;

public class Player {
	private PlayerLevel level;

	// 생성자
	public Player() {
		level = new BeginnerLevel();
		// 상위       하위 
		level.showLevelMessage(); // 이게 있어야 비기너 때도 쇼레벨메시지 나옴 
	}

//	final public void play(int count) {
//		level.run();
//		for (int i = 1; i <= count; i++) {
//			level.jump();
//		}
//		level.turn();
//	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level; //그치그치,, 이게 있어야 그 레벨에 맞는 play 메서드가 실행되네!!
							// 이걸 안 넣었어서,, 나는,,,, 계속 비기너 play 메서드만 나왔음 
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}
