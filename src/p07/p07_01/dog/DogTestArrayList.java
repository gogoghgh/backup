package p07.p07_01.dog;

import java.util.ArrayList;

public class DogTestArrayList {
	static ArrayList <Dog> dogs = new ArrayList<Dog>(); 

	public static void main(String[] args) {
		// dogs�� dog���� �� �ָӴ�!! �� ��!!!
		String[] dogNames = {"��1", "��2", "��3", "��4", "��5"};
		String[] dogTypes = {"������", "��Ƽ��", "�ú�����", "����ġ", "Ǫ��"};
		
		for(int i=0; i< dogNames.length ; i++) { //ArrayList������ length�� �ƴ϶� size!!!
		dogs.add(new Dog(dogNames[i], dogTypes[i]));
		} //ArrayList�� ���� �� ������� �����ϱ�,, �츮�� ����� ���̴ϱ�~
		// dogs.size()�� �ƴ϶� >> dogNames.length��� �ؾ� ��
		
//		dogs.add(new Dog("��1", "������"));
//		dogs.add(new Dog("��2", "��Ƽ��"));
//		dogs.add(new Dog("��3", "�ú�����"));
//		dogs.add(new Dog("��4", "����ġ"));
//		dogs.add(new Dog("��5", "Ǫ��"));
		
		
		//��� ���
		for(Dog dogsData: dogs) { 
			System.out.println(dogsData.showDogInfo());
		}
		
	}//main

}
