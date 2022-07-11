package template;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public void startCar() {
		System.out.println("시동을 켭니다");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다");
	}

	// 템플릿 메서드.. 자동차가 달리는 방법은 다 똑같죠??
	// 로직 흐름을 정의!!
	// 모든 하위클래스가 이 로직을 공통으로 사용하고,
	// 코드를 변경하면 안 되기 때문에 final로 선언
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

}
