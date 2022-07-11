package inheritance;

public class SuperclassTest {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.toString());
		System.out.println(sub.hashCode());
		System.out.println(sub.equals(sub));
		System.out.println(sub.getClass());
		System.out.println("sub.valueSub: " + sub.valueSub + ", sub.valueSuper: " + sub.valueSuper);
		sub.methodSub();
		sub.methodSuper();

		Super s1 = new Sub();
		s1.valueSuper = 500;
		// s1.valueSub = 600; s1�� ���� Ÿ���̶�,, ���� Sub Ÿ�Կ��� �� �� �ִ� ��� ������ �ٸ���~
		s1.methodSuper();

		sub = (Sub) s1; // ���� ����ȯ = down casting ... ���� -> ������,,
		sub.methodSub();
		sub.methodSuper();
//		Sub s2 = (Sub)(new Super()); // ���� ����ȯ, �ٿ�ĳ����...  //����!! �޸� �Ҵ���� �� ���

		if (sub instanceof Sub) {
			System.out.println("sub�� SubŸ��");
		}
		if (s1 instanceof Sub) {
			System.out.println("s1 == SubŸ��");
		}
		if (sub instanceof Super) {
			System.out.println("sub == SuperŸ��");
		}
		if (s1 instanceof Super) {
			System.out.println("s1 == SuperŸ��");
		}
		if (s1 instanceof Object) {
			System.out.println("s1 == ObjectŸ��");
		}

	}

}

class Super {
	Super(int valueSuper) {
		this.valueSuper = valueSuper;
	} // �Ű����� �ִ�! ������ ������ٸ�
		// ����Ʈ ������ �� ������ ���� ��������!!! ����ó��

	Super() {
		System.out.println("���ۻ�����");
	}

	int valueSuper = 200;

	void methodSuper() {
		System.out.println("���۸޼��� ����");
	}
}

class Sub extends Super {
	// Sub(){ super(); } // �츮 ������ �� �������� �ڵ������� ���ܳ��� ������^^
	int valueSub = 300;

	void methodSub() {
		System.out.println("����޼��� ����");
	}

	@Override
	void methodSuper() {
		System.out.println("���۸޼��� ������ ����");
	}
}