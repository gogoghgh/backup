package abstractEx.selfCoding;

public class Bus extends Car {
	@Override
	public void refuel() {
		System.out.println("õ�� ������ �����մϴ�.");
	}

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}

}
