package polymorphism;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.memberA = 100;
		b.memberA = 20;
		b.memberB = 30;
		// �� ����
		
		//�ڵ�����ȯ
		a = b;
		System.out.println("a.memberA: " + a.memberA);  
			// a=b �ϸ鼭 b �ּҰ��� -> a�� �־
			// a�� B class�� ����Ű�� �Ǹ鼭.. 100�� �ƴ϶� 20
		System.out.println();
		
		//��������ȯ
		b = (B)
				a; //��-> �� �������ϱ� �������� (B) �ٿ��� ������ ������ ����ȯ.. 
				  // ���󺹱���??? new B�� ��������µ� AŬ����Ÿ���̾��ٰ� -> B�� ����ȯ�ȰŴϱ�?
		System.out.println("a.memberA: " + a.memberA); //�ٵ� �� a.memberB�� �� ����??? �������� a�� �״�� A classŸ��..�̴ϱ�
		System.out.println("b.memberA: " + b.memberA);
		System.out.println("b.memberB: " + b.memberB);
		
		
		a = b;    // �� -> ������ ���� ���� �ڵ� ����ȯ
		b = (B)a; // A class type�� ���� Ŭ������ -> ���� B class type�� b ���������� ���� �� �ֳ�???? 
				  // �ƴ�!!! �ٵ�.. ��������ȯ(= (B) )�ؼ� ����Ŭ���� Ÿ������ ������ �ڿ�,, ����
		
		A c = new A();
		
		b = (B)c;
		//��� �ȵȴ�!!! int memberB�� ���,,  �� �ǳ�;;;;;;  �ȵǳ�
		
	}

}
