package p06.p06_14;

public class CarTest {

	public static void main(String[] args) {
//		Car c1 = new Car(); //������,, �Ű������� ���� 4�� ���ڵ��� ���� �ϴµ� �ƹ��͵� ��� ������
//		Car c2 = new Car();
		Car c1 = new Car("1", "ȫ�浿", "A class", 1899);
		Car c2 = new Car("2", "��浿", "C class", 1992);

		System.out.println("������: " + c1.getOwner());
		System.out.println("����: " + c1.getCarKind());
		System.out.println("����: " + c1.getCarNumber());
		System.out.println("����: " + c1.getYear());
		System.out.println();
		System.out.println("������: " + c2.getOwner());
		System.out.println("����: " + c2.getCarKind());
		System.out.println("����: " + c2.getCarNumber());
		System.out.println("����: " + c2.getYear());
		System.out.println();

		c1.setOwner("������");
		c1.setCarKind("������");
		c1.setCarNumber("12��1234");
		c1.setYear(2021);

		c2.setOwner("�����");
		c2.setCarKind("ĳ����");
		c2.setCarNumber("34��3456");
		c2.setYear(2022);

		System.out.println("������: " + c1.getOwner());
		System.out.println("����: " + c1.getCarKind());
		System.out.println("����: " + c1.getCarNumber());
		System.out.println("����: " + c1.getYear());
		System.out.println();
		System.out.println("������: " + c2.getOwner());
		System.out.println("����: " + c2.getCarKind());
		System.out.println("����: " + c2.getCarNumber());
		System.out.println("����: " + c2.getYear());

	}

}
