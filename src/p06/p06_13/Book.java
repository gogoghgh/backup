package p06.p06_13;

public class Book { // ������ ���� ���α׷�
	private String title; // å �̸� ��� ����.... ������ ���ؼ� �� private �ϰ� �����~
	private String author; // ���� ��� ����
	private int price; // å ���� ��� ����
	// ��!!! private�̶� main�޼��忡�� �� ��Դµ�??? --> "setOOOO �޼���"�� ����!!

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// �Ϳ�!! �ڵ����� ����� �𰡴�

}
