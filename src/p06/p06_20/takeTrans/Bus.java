package p06.p06_20.takeTrans;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	// ������
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// �޼���
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("���� " + busNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}

}
