package p07.p07_04;

public class Person {
	String name;
	long serialNum;

	// ������
	public Person() {
		System.out.println("Person ������ 1�Դϴ�^^ (����Ʈ ������)");
	}

	public Person(String name, long serialNum) {
		super();
		// Person�� �θ� �ִ�?! Object ��� ���̺귯���� �⺻������ �޾ƿ�,,��� Ŭ������ ����,,,
		this.name = name;
		this.serialNum = serialNum;
		System.out.println("Person ������ 2�Դϴ�^^ (�Ű����� 2��¥�� ������)");
	}

	// ���ͼ��͸޼���
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}

	// showInfo�޼���
	public void showInfo() {
		System.out.println("name: " + name + " / serialNum: " + serialNum);
	}

}
