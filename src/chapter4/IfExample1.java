package chapter4;

public class IfExample1 {

	public static void main(String[] args) {
		int age = 10;
		if(age >=8) {
			System.out.println("�б��� �ٴմϴ�.");
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		System.out.println("--------------");
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("�����Դϴ�");
		}
		else {
			System.out.println("�����Դϴ�");
		}
		System.out.println("--------------");
		int month=3;
		int day;
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:  day = 31; 
		System.out.println(day);
		
		
		
		}
		
	}

}
