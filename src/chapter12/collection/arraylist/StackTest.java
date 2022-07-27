package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	// �������
	private ArrayList<String> arrayStack = new ArrayList<String>();

	// �޼���
	public void push(String data) {
		arrayStack.add(data); // ������ �� �ڿ� ��Ҹ� �߰�
	}

	public String pop() { // ������ �� �ڿ��� ��� ����
		int len = arrayStack.size(); // ArrayList�� ����� ��ȿ�� �ڷ��� ����
		if (len == 0) { // stack�� ����ִ� ��쿣 pop �� �� ���ݾƿ�
			System.out.println("������ ������ϴ�");
			return null;
		}

		return (arrayStack.remove(len - 1)); // �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
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