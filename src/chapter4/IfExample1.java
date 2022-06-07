package chapter4;

public class IfExample1 {

	public static void main(String[] args) {
		int age = 10;
		if(age >=8) {
			System.out.println("학교에 다닙니다.");
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("--------------");
		char gender = 'F';
		if (gender == 'F') {
			System.out.println("여성입니다");
		}
		else {
			System.out.println("남성입니다");
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
