package polymorphism;

import java.util.ArrayList;

//���� Ŭ����
class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

//��� ����..
class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�");
	}

	public void readBook() {
		System.out.println(" ����� å�� �н��ϴ�");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}

	public void hunting() {
		System.out.println(" ȣ���̰� ����� �մϴ� ������");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ� ���ڴ�~");
	}

	public void flying() {
		System.out.println(" �������� ������ �� ��� �ָ� ���ư��ϴ�.....");
	}
}

//���� ���!!!
public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	// �迭�� �ڷ����� Animal�� ����

	// �޼���
//	public void moveAnimal(Animal animal) {  // �Ű����� �ڷ����� ���� Ŭ����
//		animal.move(); // �����ǵ� �޼��尡 ȣ���
//	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i); // Animal Ÿ�� �������� ani.. �Ἥ ������
			if (ani instanceof Human) { // Human���̸�,
				Human h = (Human) ani; // Human������ �ٿ�ĳ����
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�...");
			}
		} // for
	}

	public void addAnimal() {
		aniList.add(new Human()); // Animal Ÿ���� ArrayList�� �߰��Ǹ鼭 Animal������ �ڵ�����ȯ
		aniList.add(new Tiger());
		aniList.add(new Eagle());

		for (Animal aniData : aniList) { // aniList �迭 ��Ҹ� AnimalŸ������ ������ move()�� ȣ���ϸ� �����ǵ� �Լ��� ��µ�....
			aniData.move();
		}
	}

	// ����!!!! ���� �־��!!
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println();
		System.out.println("���� ���� ������ �ٿ�ĳ���� ����");
		aTest.testCasting();

//		aTest.moveAnimal(new Human());
//		aTest.moveAnimal(new Tiger());
//		aTest.moveAnimal(new Eagle());

	}// main

}
