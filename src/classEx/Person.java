package classEx;

public class Person {
	private String name;
	private int age;

	// ����Ʈ ������
	public Person() {
	}

	// �̸��� �Է¹޴� ������
	public Person(String name) {
		this.name = name;
	}

	// �̸��� ���̸� �Է¹޴� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
