package object;

public class StringEquals {

	public static void main(String[] args) {
		System.out.println("========= String class =========");
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1 == str2:    " + (str1 == str2)); // �� �ν��Ͻ� �ּҰ��� ������ ��
		System.out.println("str1.equals(str2):   " + str1.equals(str2)); 
							// String class�� equals() �޼��� ���.
							// �� �ν��Ͻ��� ���ڿ� ���� ������ ��
		System.out.println();
		
		System.out.println("======== Integer class ========");
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i1 == i2:    " + (i1 == i2));  // �� �ν��Ͻ� �ּҰ��� ������ ��
		System.out.println("i1.equals(i2):  " + i1.equals(i2)); 
						// Integer class�� equals() �޼��� ���..
						// �� �ν��Ͻ��� ���� ���� ������ ��
		
		
	}

}
