package generics;

public class Plastic extends Material {
	public void doPrinting() { // override..
		System.out.println("Plastic ���� ����մϴ�");
	}

	@Override
	public String toString() {
		return "���� Plastic �Դϴ�";
	}
}
