package abstractEx.selfCoding;

public class AutoCar extends Car {
	@Override
	public void refuel() {
		System.out.println("�ֹ����� �����մϴ�.");
	}

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
