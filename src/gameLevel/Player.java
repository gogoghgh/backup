package gameLevel;

public class Player {
	private PlayerLevel level; // Player�� ������ level ���� ����

	// ����Ʈ ������
	// ó�� �����Ǹ� BeginnerLevel�� �����ϸ� ���� �޽��� ���
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() { // ����Ÿ���� PlayerLevel,,
		return level;
	}

	// ���� ���� �޼���.
	// ���� �ڽ��� level�� �Ű������� ���� level�� �����ϰ� ���� �޽��� ���
	public void upgradeLevel(PlayerLevel level) { // �Ű����� �ڷ����� ��� ������ ��ȯ ������ PlayerLevel
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count); // PlayerLevel�� �ֽ���
	}

} // class
