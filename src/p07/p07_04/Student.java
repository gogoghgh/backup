package p07.p07_04;

public class Student extends Person {
	int grade;

	public Student() {
//		super(); //�̰� ���� ����Ʈ �������� ���!! super�� �ȿ� ����ִ�~~
		//�� ���� �θ� ������ ���赵�� ȣ���Ѵ�!!! �ڽ��� ù��° �ϴ� ��,, 
		//   ���赵 ����ϴ� �� �ƴ϶� ȣ��~~
		super("��浿", 11111);
		System.out.println("Student ����Ʈ �������Դϴ�^^");
	}
}
