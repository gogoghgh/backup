package p06.p06_20.takeTrans;

public class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;

	// 생성자
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// 메서드
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}

	public void showInfo() {
		System.out.println(taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
