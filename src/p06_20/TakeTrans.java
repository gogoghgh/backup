package p06_20;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentKim = new Student("Kin", 3000);
		Student studentEdward = new Student("Edward", 20000);
		Student studentGH = new Student("GH", 50000);

		// ���� Ÿ�� ����~~
		Bus bus100 = new Bus(100); // 100�� ���� ��ü ����
		studentJames.takeBus(bus100); // bus�� ��+, �°�+ && �л��� ��-
		studentJames.showInfo(); // �ܾ� 4000
		bus100.showInfo(); // �� ���� 1000, �°� 1
		System.out.println();

		studentKim.takeBus(bus100); // 'Bus Ŭ���� Ÿ��'�� 'bus100 ��ü ����'!!! �ϱ� ���� �� �ִ� ����
		//studentKim.takeBus(new Bus(20)); �̷��Ե� �����ϱ� ��... BusŬ���� Ÿ���� ���� �±� �ϴϱ�,, �ٵ� �ؿ� showInfo �޼��� ������ ~~ ^^;
		studentKim.showInfo(); // �ܾ� 2000
		bus100.showInfo(); // �� ���� 2000, �°�2
		System.out.println();

		// ����ö Ÿ�� ����~~
		Subway subwayGreen = new Subway("2ȣ��"); // 2ȣ�� ����ö ��ü ����
		studentTomas.takeSubway(subwayGreen); // ����ö�� ��+, �°�+ && �л��� ��-
		studentTomas.showInfo();
		subwayGreen.showInfo();
		System.out.println();

		studentGH.takeSubway(subwayGreen);
		studentGH.showInfo(); // 50000-1500
		subwayGreen.showInfo(); // 3000, �°�2
		System.out.println();

		// �ý� Ÿ�� ����~~
		Taxi taxi1957 = new Taxi(1957);
		studentEdward.takeTaxi(taxi1957);
		studentEdward.showInfo();
		taxi1957.showInfo();
		System.out.println();

		studentGH.takeTaxi(taxi1957);
		studentGH.showInfo(); // 48500 - 10000
		taxi1957.showInfo(); // 20000, 2��

	}

}
