package string;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '2', '4':
			System.out.println("���� �Դϴ�.");
			break;
		case '1', '3':
			System.out.println("���� �Դϴ�.");
			break;
		}

	} // main

}
