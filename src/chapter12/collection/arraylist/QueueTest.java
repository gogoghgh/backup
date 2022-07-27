package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	// 멤버변수
	private ArrayList<String> arrayQueue = new ArrayList<String>();

	// 메서드
	public void enQueue(String data) {
		arrayQueue.add(data); // 큐의 맨 뒤에 요소 추가
	}

	public String deQueue() { // 큐의 맨 앞에서 꺼냄
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었삼");
			return null;
		}

		return (arrayQueue.remove(0)); // 맨 앞(=0)의 자료 반환하고 배열에서 제거
	}
}

public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		System.out.println(queue.deQueue());
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
