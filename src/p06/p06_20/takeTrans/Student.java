package p06.p06_20.takeTrans;

import java.util.Scanner;

public class Student {
	public String studentName;
	public int grade;
	public int money;

	// ������
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// �޼���
	public void takeBus(Bus bus) { // 'bus'��� ��ü�� ������ �� �ƴ�!! �١� �� �����ڰ� ���� ������ BusŬ���� Ÿ�� ����,,
		bus.take(1000); // bus.take ==> ������ 1000�� + && �°� +1
		this.money -= 1000; // �л��� 1000�� -
	}

	public void takeSubway(Subway subway) {
		subway.take(1500); // subway.take ==> ��ö�� 1500�� + && �°� +1
		this.money -= 1500; // �л��� 1500�� -
	}

	public void takeTaxi(Taxi taxi) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ýú� ��?");
		int inputTaxiPay = sc.nextInt();
		taxi.take(inputTaxiPay); // taxi.take ==> �Է��� ��븸ŭ ���� + && �°� +1
		this.money -= inputTaxiPay; // �л� �������� �׸�ŭ -

	}

	public void showInfo() {
		System.out.println(studentName + "���� ���� ����... " + money + "�� �Դϴ�.");
	}

}
