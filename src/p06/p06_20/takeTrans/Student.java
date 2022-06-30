package p06.p06_20.takeTrans;

import java.util.Scanner;

public class Student {
	public String studentName;
	public int grade;
	public int money;

	// 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 메서드
	public void takeBus(Bus bus) { // 'bus'라는 객체가 생성된 게 아님!! ☆★ 걍 개발자가 정한 임의의 Bus클래스 타입 변수,,
		bus.take(1000); // bus.take ==> 버스는 1000원 + && 승객 +1
		this.money -= 1000; // 학생은 1000원 -
	}

	public void takeSubway(Subway subway) {
		subway.take(1500); // subway.take ==> 쟈철은 1500원 + && 승객 +1
		this.money -= 1500; // 학생은 1500원 -
	}

	public void takeTaxi(Taxi taxi) {
		Scanner sc = new Scanner(System.in);
		System.out.println("택시비 얼마?");
		int inputTaxiPay = sc.nextInt();
		taxi.take(inputTaxiPay); // taxi.take ==> 입력한 비용만큼 수입 + && 승객 +1
		this.money -= inputTaxiPay; // 학생 돈에서는 그만큼 -

	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은... " + money + "원 입니다.");
	}

}
