package gameLevel;

public abstract class PlayerLevel {
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	// ��� ���� �� �Ȱ���! ����
	// �����ǵǸ� �� �ǹǷ� final�� ����
	final public void go(int count) {
		run();
		for (int i = 0; i < count; i++) { // int count �Ű����� ���� ��ŭ jump
			jump();
		}
		turn();
	}

}
