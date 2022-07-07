package polymorphism;

//상위 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

//상속 시작..
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 좋겠다~");
	}
}

//이제 쥔공!!!
public class AnimalTest {
	//메서드
	public void moveAnimal(Animal animal) {  // 매개변수 자료형이 상위 클래스
		animal.move(); // 재정의된 메서드가 호출됨
	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}//main
	
}
