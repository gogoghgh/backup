package p06.p06_10;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] = "������";
		name[1] = "������";
		name[2] = "�����";
		// name[3] = "������"; �� X!!!!
		System.out.println(name[2]);
		System.out.println(name);

		int[] num = new int[3];
		num[0] = 1; // �޸𸮿� ���ӵ� ������ int�� ������ ��
		num[1] = 2;
		num[2] = 3;
		System.out.println(num); // -> [I@7a81197d ���.... = �޸𸮿� �Ҵ�Ǿ��� �ִ� '�ּҰ�'!!!

		char[] ch = new char[3];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch);

//		�迭 �� for��
//		�迭�̶� ���� �� ���� �ǵ����̸� i �ʱⰪ�� 0����!!! 
//		���.. �迭dms 0���� �����̴ϱ�
		for (int i = 0; i < 3; i++) {
			System.out.println("ch[" + i + "] = " + ch[i]);
		}

	}

}