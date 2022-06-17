package p06_17;

class Person {
	String name;
	int age;

	Person() {
		this("이름 없음", 1);
	}

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 174p 메서드 하나 추가할게용
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

		Person yesName = new Person("가현스", 3);
		System.out.println("name: " + yesName.name);
		System.out.println("age: " + yesName.age);

		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);

	}
}
