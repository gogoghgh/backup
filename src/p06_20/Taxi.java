package p06_20;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;

	// ������
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// �޼���
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showInfo() {
		System.out.println(taxiNumber + "�� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}
