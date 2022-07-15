package gameLevel.practice;

public class Player {
	private PlayerLevel level;

	// ������
	public Player() {
		level = new BeginnerLevel();
		// ����       ���� 
		level.showLevelMessage(); // �̰� �־�� ���� ���� ����޽��� ���� 
	}

//	final public void play(int count) {
//		level.run();
//		for (int i = 1; i <= count; i++) {
//			level.jump();
//		}
//		level.turn();
//	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level; //��ġ��ġ,, �̰� �־�� �� ������ �´� play �޼��尡 ����ǳ�!!
							// �̰� �� �־��,, ����,,,, ��� ���� play �޼��常 ������ 
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}
