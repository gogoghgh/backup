package exam;

import java.util.Scanner;

public class Test4 {

	static Book[] books = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int insertCnt = 0;

	public static void main(String[] args) {
		// ���� ������ �Է��ϴ� �ڵ� �Ϻκ��̴�.
		System.out.println("------------- �Է� �Ϻκ� ---------------");
		System.out.print("������ �Է� : ");
		String title = sc.nextLine();
		System.out.print("���� �Է� : ");
		String author = sc.nextLine();
		System.out.print("���ǻ� �Է� : ");
		String publish = sc.nextLine();
		System.out.print("���� �Է� : ");
		int price = sc.nextInt();

		books[insertCnt] = new Book(title, author, publish, price);
		System.out.println("�Էµ� ");
		insertCnt++;

		// å �˻� �ϴ� �ڵ� �Ϻκ��̴�.
		System.out.println("------------- �˻� �Ϻκ�---------------");
		System.out.print("�˻��� å ������ �Է� :");
		sc.nextLine();// ���๮�� ���ֱ� ���� �߰��� (����� �������)
		String searchinTitle = sc.nextLine();
		int i;
		for (i = 0; i < insertCnt; i++) {
			if (searchinTitle.equalsIgnoreCase(books[i].getTitle())) {
				System.out.println("�˻� ��� ������ ");
				System.out.println("���� : " + books[i].getAuthor() + " ���ǻ� : " + books[i].getPublish() + " ����: "
						+ books[i].getPrice());
				System.out.println("insertCnt: " + insertCnt);
				break;
			} else
				System.out.println("�˻� ���� ����");
		}

		sc.close();
		System.out.println("���α׷� ����");

	}
}