package chapter12.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		// ��ũ�� ����Ʈ�� ��� �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		// ����Ʈ ��ü ���
		System.out.println("myList: " + myList);
		
		// get() �Ἥ �ȿ� Ȯ��
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("myList[" + i + "]: " + myList.get(i));
		}
		
		// ��ũ�� ����Ʈ�� ��ġ 1�� D �߰�
		myList.add(1, "D");
		System.out.println("myList: " + myList);
		
		// addFirst() ��ũ�� ����Ʈ�� �� �տ� 0 �߰�
		myList.addFirst("O");
		System.out.println("myList: " + myList);
		
		// removeLast() ��ũ�� ����Ʈ�� �� �� ��� ���� �� ���
		System.out.println("�� �� ����?: " + myList.removeLast());
		System.out.println("myList: " + myList);
		
	}

}
