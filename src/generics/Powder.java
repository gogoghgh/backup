package generics;

public class Powder extends Material {
	public void doPrinting() { // override��
		System.out.println("Powder ���� ����մϴ�");
	}

	@Override
	public String toString() {
		return "���� Powder�Դϴ�..";
	}

}
