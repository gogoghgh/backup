package p05.p05_27;
import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
		int age = 15;
		String result = (age >= 18)? "����": "�̼�����";
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
		String grade = (score>=90)? "A���. ��������^^": (score>=80? "B���":"C���");
		System.out.println("���: " + grade);
		
		
		
	}

}
