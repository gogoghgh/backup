package p07.p07_01.dog;

public class DogTest {

	public static void main(String[] args) {
		Dog[] cuteDogs = new Dog[5];
		// �ܴ��� �ļ�
		String[] dogNames = { "��1", "��2", "��3", "��4", "��5" };
		String[] dogTypes = { "������", "��Ƽ��", "�ú�����", "����ġ", "Ǫ��" };
		// �̷� �����ʹ� ���߿� DB���� ��� ���� �� ��Ī��Ű��,, ���̺귯����?

//		cuteDogs[0] = new Dog("��1", "������");
//		cuteDogs[1] = new Dog("��2", "��Ƽ��");
//		cuteDogs[2] = new Dog("��3", "�ú�����");
//		cuteDogs[3] = new Dog("��4", "����ġ");
//		cuteDogs[4] = new Dog("��5", "Ǫ��");
		// �̷��� ������ �ľ� �մϲ�,,,,, �� ����~~

		// for������ ������ �ʱⰪ �ֱ�!! + �ļ�
		for (int i = 0; i < cuteDogs.length; i++) {
			cuteDogs[i] = new Dog(dogNames[i], dogTypes[i]);
		}

		System.out.println("--�� for��-------------");
		for (int i = 0; i < cuteDogs.length; i++) {
			System.out.println(cuteDogs[i].showDogInfo());
		}
		System.out.println();

		System.out.println("---��� for��------------");
		for (Dog dogsData : cuteDogs) {
			System.out.println(dogsData.showDogInfo());
		}

//		for(int i = 0; i < cuteDogs.length; i++) {
//			
//		}
//		
//		// �ʱⰪ �ֱ�.. �̰� �ƴϳ�^^;;
//		for(Dog dog : cuteDogs) {
//			dog = new Dog();
//		}

	}// main

}
