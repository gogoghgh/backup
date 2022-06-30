package p05.p05_27;
import java.util.Scanner;

public class Re {
	public static void main(String[] args) {
		int age = 15;
		String result = (age >= 18)? "성인": "미성년자";
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		String grade = (score>=90)? "A등급. 축하축하^^": (score>=80? "B등급":"C등급");
		System.out.println("등급: " + grade);
		
		
		
	}

}
