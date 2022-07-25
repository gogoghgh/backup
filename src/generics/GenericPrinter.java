package generics;

public class GenericPrinter<T extends Material> { // extends ������ ����� �� �ִ� �ڷ����� ������ ��
	// T �ڷ������� ������ ����
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	// T �ڷ��� ���� material�� ��ȯ�ϴ� ���׸� �޼���
	public T getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();  // ���� Ŭ���� Material�� �޼��� ȣ��
	}

}