package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	// 멤버변수
	private ArrayList<String> arrayStack = new ArrayList<String>();

	// 메서드
	public void push(String data) {
		arrayStack.add(data); // 스택의 맨 뒤에 요소를 추가
	}

	public String pop() { // 스택의 맨 뒤에서 요소 꺼냄
		int len = arrayStack.size(); // ArrayList에 저장된 유효한 자료의 개수
		if (len == 0) { // stack이 비어있는 경우엔 pop 할 수 없잖아염
			System.out.println("스택이 비었습니다");
			return null;
		}

		return (arrayStack.remove(len - 1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
} // MyStack class

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println(stack.pop());
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}