package interfaceEx;

public interface A {
	// �������̽� �������
	// ��� +�������
	// �߻�޼��� +default �޼���, static �޼��� +private �޼���
	abstract void methodA(); // abstract ���� ������
}

interface B {
	void methodB();
}

class D {
}

class C extends D implements A, B { // ���� �������̽� �ѹ��� ���� ����
	@Override
	public void methodA() {
		System.out.println("methodA �������̵�");
	}

	@Override
	public void methodB() {
		System.out.println("methodB �������̵�");
	}

}