package p06_14;

public class ManTest {

	public static void main(String[] args) {
		Man m1 = new Man();

		m1.setAge(40);
		m1.setName("James");
		m1.setIsMarried(true);
		m1.setKidsNum(3);

		System.out.println("����: " + m1.getAge());
		System.out.println("�̸�: " + m1.getName());
		System.out.println("��ȥ ����: " + m1.getIsMarried());
		System.out.println("�ڳ� ��: " + m1.kidsNum);

	}
}
