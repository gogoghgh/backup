package p06_13;

public class Test {
	public static void main(String[] args) {
		// Test��� Ŭ������ �� �������� Ŭ����,, FunctionTest class�� �����ϱ� ����
		System.out.println("-------------------------FunctionTest class");
		int num1 = 100;
		int num2 = 5;
		FunctionTest ft = new FunctionTest(); // ��ü ���� ��...

		int sum = ft.add(num1, num2);
		System.out.println("(num1) " + num1 + "  +  " + "(num2) " + num2 + "  =  " + "(sum) " + sum + " �Դϴ�");

		System.out.println();
		System.out.println("---------------------------Book class");
		Book b1 = new Book(); // ��ü ����!! //�޸𸮿� �ϸ�ŭ �����������
		Book b2 = new Book();

//		b1.title = "ȫ�浿";
//		b1.author = "���";
//		b1.price = 1000;
		b1.setTitle("ȫ�浿");
		b1.setAuthor("���");
		b1.setPrice(1000);

//		b2.title = "�鼳����";
//		b2.author = "�̻� ����";
//		b2.price = 2000;
		b2.setTitle("�鼳����");
		b2.setAuthor("�����");
		b2.setPrice(2000);

		// set �ؼ� �� ����־���~ /������ �����ִ� ��� �ϴ� �� get ���͸޼���
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println();
//		System.out.println("b2.title = " + b2.title);
//		System.out.println("b2.author = " + b2.author);
//		System.out.println("b2.price = " + b2.price);
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());

	}
}
