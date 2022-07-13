package template.Q5.copy;

public class Car {
	String carName;
	
	Car(String carName){
		this.carName = carName;
	}
	
	Car(){}
	
	public void start() {System.out.println(carName + " 시동을 겁니다.");}

	public void drive() {System.out.println(carName + " 달립니다");}

	public void stop() {System.out.println(carName + " 멈춥니다");}

	public void turnoff() {System.out.println(carName + " 시동을 끕니다");}

	final public void run() {
		start(); /* {System.out.println("시동을 겁니다.");} */
		drive();
		stop();
		turnoff();
	}
}
