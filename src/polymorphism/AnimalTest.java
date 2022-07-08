package polymorphism;

import java.util.ArrayList;

//상위 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

//상속 시작..
class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}

	public void readBook() {
		System.out.println(" 사람이 책을 읽습니다");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다");
	}

	public void hunting() {
		System.out.println(" 호랑이가 사냥을 합니다 ㄷㄷㄷ");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 좋겠다~");
	}

	public void flying() {
		System.out.println(" 독수리가 날개를 쭉 펴고 멀리 날아갑니다.....");
	}
}

//이제 쥔공!!!
public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	// 배열의 자료형은 Animal로 지정

	// 메서드
//	public void moveAnimal(Animal animal) {  // 매개변수 자료형이 상위 클래스
//		animal.move(); // 재정의된 메서드가 호출됨
//	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i); // Animal 타입 참조변수 ani.. 써서 가져옴
			if (ani instanceof Human) { // Human형이면,
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다...");
			}
		} // for
	}

	public void addAnimal() {
		aniList.add(new Human()); // Animal 타입인 ArrayList에 추가되면서 Animal형으로 자동형변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (Animal aniData : aniList) { // aniList 배열 요소를 Animal타입으로 꺼내서 move()를 호출하면 재정의된 함수가 출력됨....
			aniData.move();
		}
	}

	// 메인!!!! 여기 있어요!!
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println();
		System.out.println("↓↓↓ 원래 형으로 다운캐스팅 ↓↓↓");
		aTest.testCasting();

//		aTest.moveAnimal(new Human());
//		aTest.moveAnimal(new Tiger());
//		aTest.moveAnimal(new Eagle());

	}// main

}
