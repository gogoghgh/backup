package p06_20;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	// 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}

}
