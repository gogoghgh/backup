package p06.p06_27.array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[5];
		Book[] bookArray2 = new Book[5];
		
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��� �� ���ΰ�", "���ù�");
		bookArray1[3] = new Book("�ȳ�", "�ϼ���");
		
		bookArray2[4] = new Book("����", "����");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 4);
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 2);
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	}

}
