package p06_27.array;

import java.util.Scanner;

public class BookArray2 {

	public static void main(String[] args) {

		Book[] library = new Book[5];

		// �ν��Ͻ� ���� �� �迭�� ����
		library[0] = new Book("�¹���", "������");
		library[1] = new Book("���̾�", "�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�", "���ù�");
		library[3] = new Book("����", "�ڰ渮");
		library[4] = new Book("�����", "�������丮");

		Scanner sc = new Scanner(System.in);
		System.out.print("å ������ �Է����ּ��� >> ");

		String inputTitle = sc.nextLine(); // '����'�� �ִ� ���ڿ� �� ���� next()�δ� �� ��~
//		System.out.println(inputTitle); // �Է��� �� ��¥ �� ���Գ� Ȯ��!! �� ���� ���ξ�,, �� 		
		boolean isBook = false; // �⺻�� = å �� �� . . .

		// �⺻������8���� == ������
		// �������������� .equals(�񱳴��) ���� �ڡ�
// �� ��..
//		for (int i = 0; i<library.length; i++) {
		// �� library[0] �̶� ���ϴ� �� �ƴ϶�,, (�ֳĸ� ���� �ּҰ����ݾƿ�~~~)
		// library[0] -> �� �ִ�!! BookName�̶� ��~!! ������~~
//			if(inputTitle.equals(library[i].getBookName())) { 
//				isBook = true; // å ����!!! �˻��� �� �̰���.....
//				break;
//				System.out.println("å �ֽ��ϴ�^^");
//				library[i].showBookInfo();
//			} 
//			else System.out.println("å �����ϴ� ��");
//		} if System.out.println("å ������ϴ٤�");
//		System.out.println();

		for (int i = 0; i < library.length; i++) {
			if (inputTitle.equals(library[i].getBookName())) {
				isBook = true;
				library[i].showBookInfo();
				break;
			}
		}

		if (isBook) {
			System.out.println("å ����"); // isBook�� true�� å ����
		} else
			System.out.println("å ����"); // isBook�� false�� å ����

//		for (int i = 0; i < library.length; i++) {
//			library[i].showBookInfo();
//		}
//		System.out.println();
//		
//		// library[3].. << �� �� ��ü�� �� �ּҰ��� ���� �ִ�? 
//		for (int i = 0; i < library.length; i++) {
//			System.out.println(library[i]);
//		}

	}

}
