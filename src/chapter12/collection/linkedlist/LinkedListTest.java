package chapter12.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		// 리스트 전체 출력
		System.out.println("myList: " + myList);
		
		// get() 써서 안에 확인
		for (int i = 0; i < myList.size(); i++) {
			System.out.println("myList[" + i + "]: " + myList.get(i));
		}
		
		// 링크드 리스트의 위치 1에 D 추가
		myList.add(1, "D");
		System.out.println("myList: " + myList);
		
		// addFirst() 링크드 리스트의 맨 앞에 0 추가
		myList.addFirst("O");
		System.out.println("myList: " + myList);
		
		// removeLast() 링크드 리스트의 맨 뒤 요소 삭제 후 출력
		System.out.println("맨 뒤 누구?: " + myList.removeLast());
		System.out.println("myList: " + myList);
		
	}

}
