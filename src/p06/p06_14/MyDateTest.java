package p06.p06_14;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		System.out.println("year, month, day 순서대로 입력>>");
		Scanner sc = new Scanner(System.in);
		MyDate date1 = new MyDate();
		
		
		date1.setYear();
		date1.setMonth();
		date1.setDay();
		
		System.out.println();
		System.out.print(date1.getYear() + "년  " + date1.getMonth() + "월  " + date1.getDay() + "일");
		System.out.println();
		if (date1.isValid() == true) {
			System.out.println("유효한 날짜입니다");
		} else
			System.out.println("유효하지 않은 날짜입니다");

//		MyDate date2 = new MyDate(2, 10, 2006);
//		System.out.println(date2.isValid());
//		if (date1.isValid() == true) {
//			System.out.println("유효한 날짜입니다");
//		} else
//			System.out.println("유효하지 않은 날짜입니다");

//		date.setYear(2023);
//		date.setMonth(2);
//		date.setDay(28);
//
//		System.out.println(date.getYear() + "년");
//		System.out.println(date.getMonth() + "월");
//		System.out.println(date.getDay() + "일");

	}

}
