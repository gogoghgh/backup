package template.Q5.copy;

public class Car {
	String carName;
	
	Car(String carName){
		this.carName = carName;
	}
	
	Car(){}
	
	public void start() {System.out.println(carName + " �õ��� �̴ϴ�.");}

	public void drive() {System.out.println(carName + " �޸��ϴ�");}

	public void stop() {System.out.println(carName + " ����ϴ�");}

	public void turnoff() {System.out.println(carName + " �õ��� ���ϴ�");}

	final public void run() {
		start(); /* {System.out.println("�õ��� �̴ϴ�.");} */
		drive();
		stop();
		turnoff();
	}
}
