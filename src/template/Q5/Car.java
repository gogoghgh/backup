package template.Q5;

public abstract class Car {
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnoff();

	public void washCar() {
		System.out.println("������ �մϴ� ��¦ ��¦^^");
	}

	final public void run() {
		start(); /* {System.out.println("�õ��� �̴ϴ�.");} */
		drive();
		stop();
		turnoff();
		washCar();
	}
}
