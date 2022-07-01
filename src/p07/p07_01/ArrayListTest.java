package p07.p07_01;

import java.util.ArrayList;
import p06.p06_27.array.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList ����
		ArrayList<Book> library = new ArrayList<Book>();
		
		//add()�޼���� ��� �� �߰�
		library.add(new Book("�¹���", "������"));
		library.add(new Book("���̾�", "�츣�� �켼"));
		library.add(new Book("��� �췡", "���ù�"));
		library.add(new Book("����", "�ڰ渮"));
		library.add(new Book("�����", "�������丮"));
		
		//�迭�� �߰��� ��� ������ŭ ���
		for(int i = 0; i <library.size(); i++) {
			Book book = library.get(i); // Book Ŭ���� Ÿ���� book ��������,,
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("========���� for�� ���=======");
		for(Book book : library) {
			book.showBookInfo();
		}
		
	}//main

}
