package p06_17;

class Person {
	String name;
	int age;

	Person() {
		this("�̸� ����", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 174p �޼��� �ϳ� �߰��ҰԿ�
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println("name: " + noName.name);
		System.out.println("age: " + noName.age);
		System.out.println();

		Person yesName = new Person("������", 3);
		System.out.println("name: " + yesName.name);
		System.out.println("age: " + yesName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);

	}
}
