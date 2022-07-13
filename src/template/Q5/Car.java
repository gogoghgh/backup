package template.Q5;

public abstract class Car {
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnoff();

	public void washCar() {
		System.out.println("세차를 합니다 반짝 반짝^^");
	}

	final public void run() {
		start(); /* {System.out.println("시동을 겁니다.");} */
		drive();
		stop();
		turnoff();
		washCar();
	}
}
