package template;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}

	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}

	// ���ø� �޼���.. �ڵ����� �޸��� ����� �� �Ȱ���??
	// ���� �帧�� ����!!
	// ��� ����Ŭ������ �� ������ �������� ����ϰ�,
	// �ڵ带 �����ϸ� �� �Ǳ� ������ final�� ����
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
