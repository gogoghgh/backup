package polymorphism;

//���� Ŭ����
class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

//��� ����..
class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ� ���ڴ�~");
	}
}

//���� ���!!!
public class AnimalTest {
	//�޼���
	public void moveAnimal(Animal animal) {  // �Ű����� �ڷ����� ���� Ŭ����
		animal.move(); // �����ǵ� �޼��尡 ȣ���
	}
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}//main
	
}
