package p06_20;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentKim = new Student("Kin", 3000);
		Student studentEdward = new Student("Edward", 20000);
		Student studentGH = new Student("GH", 50000);

		// 버스 타고 가자~~
		Bus bus100 = new Bus(100); // 100번 버스 객체 생성
		studentJames.takeBus(bus100); // bus는 돈+, 승객+ && 학생은 돈-
		studentJames.showInfo(); // 잔액 4000
		bus100.showInfo(); // 총 수입 1000, 승객 1
		System.out.println();

		studentKim.takeBus(bus100); // 'Bus 클래스 타입'인 'bus100 객체 변수'!!! 니까 들어올 수 있는 거임
		//studentKim.takeBus(new Bus(20)); 이렇게도 가능하긴 함... Bus클래스 타입의 값이 맞긴 하니까,, 근데 밑에 showInfo 메서드 쓰려면 ~~ ^^;
		studentKim.showInfo(); // 잔액 2000
		bus100.showInfo(); // 총 수입 2000, 승객2
		System.out.println();

		// 지하철 타고 가자~~
		Subway subwayGreen = new Subway("2호선"); // 2호선 지하철 객체 생성
		studentTomas.takeSubway(subwayGreen); // 지하철은 돈+, 승객+ && 학생은 돈-
		studentTomas.showInfo();
		subwayGreen.showInfo();
		System.out.println();

		studentGH.takeSubway(subwayGreen);
		studentGH.showInfo(); // 50000-1500
		subwayGreen.showInfo(); // 3000, 승객2
		System.out.println();

		// 택시 타고 가자~~
		Taxi taxi1957 = new Taxi(1957);
		studentEdward.takeTaxi(taxi1957);
		studentEdward.showInfo();
		taxi1957.showInfo();
		System.out.println();

		studentGH.takeTaxi(taxi1957);
		studentGH.showInfo(); // 48500 - 10000
		taxi1957.showInfo(); // 20000, 2명

	}

}
