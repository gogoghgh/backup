package abstractEx.Computer;

public class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("DeskTop display() �޼����Ӵ�");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing() �޼����Ӵ�");
	}

	// �߻� �޼��� Computer�� ��ü �ڵ� ���� �ۼ���^^
}
