package p05.p05_27;

public class Test1 {

	public static void main(String[] args) {
		byte a;
		a = 100;
		a = 127;
		// a = 128; //type mismatch
		long b = 1234567890;
		long bb = 1234567890L;// L���̴� ���� �����Ϸ��� 64��Ʈ¥�� ���ڷ� �������.. �� ���̸� 32��Ʈ ���ڷ� ����°Ű�,, float�� �Ȱ�
		long bbb = 1234567890123456789L;

		float c = 0.1f; // f �ٿ��� 32��Ʈ�� �Ҵ�Ǿ��� c �޸𸮷� ��,,, �� ���̸� 64��Ʈ..

		// --����ȯ--//
		c = b; // ���� ����!! float > long �̴ϱ�
		// b = c; ���� �߻�!!
		b = (int) c; // ���� ����ȯ!!!!! float(ū) -> int(��) ��,, ���� ���� �� ��

		char d = 'a';
		System.out.println(d); // a ���

		boolean e = false;

		String s = "abcdefghijklmonpqrstuvwxyz@ 123";

		int f = 'a'; // �ڵ� ����ȯ!! int > char
		System.out.println(f); // 97 ���/ ���� a�� �����ڵ忡�� 0061 -> 10������ �ٲٸ� 97��
		System.out.println((char) f); // ��������ȯ!! int(ū)�� ������ char(��)�� ǥ���ҷ�~~

		byte i = 10;
		// byte j = i+100; ����o �����ڰ� �߰��� ���� ������ int ������ ��
		// int j = i+100; ���� x
		byte j = (byte) (i + 100); // ������ ��� ������ int 110�� -> ��������ȯ -> byte������ �ٲ�
		System.out.println(j);
		b = b + 1; // ������ ū�� + ������ => ū Ÿ������ ��ȯ��
		f = f + 'b'; // a�� �ش��ϴ� 97 + b�� �ش��ϴ� 98 --> so ������!
		s = "abc" + f; // �º��̳� �캯�� String �� ������ +�� ���Ῥ����!! --> abc + (97 + 98) --> ���ڰ� �ƴ϶� ���ڿ���!!
		System.out.println(s);
		System.out.println(f + ""); // �� �� f�� int�� �ƴ϶� --> �� ���ڿ��� ���� String ���ڿ��� ��

		// --��������--//
		boolean bfood = true;
		boolean lfood = false;
		System.out.println(bfood & lfood);
		System.out.println(bfood | lfood);
		System.out.println(!bfood & lfood);
		System.out.println(bfood & !lfood);
		System.out.println(!bfood & !lfood);
		System.out.println(!bfood | lfood);
		System.out.println(bfood | !lfood);
		System.out.println(!bfood | !lfood);
		System.out.println("");

		// --�񱳿�����--//
		int age = 15;
		System.out.println(age < 18);
		System.out.println(age > 18);
		System.out.println(age <= 15);
		System.out.println(age >= 16);
		System.out.println(age == 18);
		System.out.println(age == 15);
		System.out.println(age != 15);
		System.out.println(age != 18);

		// --���Կ�����--//
		age += 5; // age = age + 5;
		System.out.println(age);
		System.out.println("");

		// --����������--//
		++age;
		System.out.println(age);
		--age;
		System.out.println(age);
		age++;
		System.out.println(age);
		age--;
		System.out.println(age);
		System.out.println(age++);
		System.out.println(age);
		System.out.println("");

		// --���׿�����--//
		String result = (age >= 18) ? "����" : "�̼�����";
		System.out.println(result);
		System.out.println("");

		// --����: ���� 90�� �̻��̸� A, 80�� �̻��̸� B, ������ C --//
		int score = 50;
		result = (score >= 90) ? "A" : ((score >= 80) ? "B" : "C");
		System.out.println(result);

	}

}
