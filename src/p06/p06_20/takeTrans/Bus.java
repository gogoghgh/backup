package p06.p06_20.takeTrans;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;

	// 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
